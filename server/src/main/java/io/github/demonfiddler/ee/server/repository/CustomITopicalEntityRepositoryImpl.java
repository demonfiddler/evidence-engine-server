/*----------------------------------------------------------------------------------------------------------------------
 * Evidence Engine: A system for managing evidence on arbitrary scientific topics.
 * Comprises an SQL database, GraphQL public API, Java app server, Java and web clients.
 * Copyright © 2024 Adrian Price. All rights reserved.
 *
 * This file is part of Evidence Engine.
 *
 * Evidence Engine is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Affero General Public License as published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * Evidence Engine is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with Evidence Engine.
 * If not, see <https://www.gnu.org/licenses/>. 
 *--------------------------------------------------------------------------------------------------------------------*/

package io.github.demonfiddler.ee.server.repository;

import static io.github.demonfiddler.ee.server.util.EntityUtils.NL;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import io.github.demonfiddler.ee.server.model.IBaseEntity;
import io.github.demonfiddler.ee.server.model.ITopicalEntity;
import io.github.demonfiddler.ee.server.model.ITrackedEntity;
import io.github.demonfiddler.ee.server.model.TopicalEntityQueryFilter;
import io.github.demonfiddler.ee.server.util.EntityUtils;
import io.github.demonfiddler.ee.server.util.ProfileUtils;
import jakarta.annotation.Resource;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

/**
 * An abstract base implementation of the {@code CustomRepository} interface.
 * @param <T> The type handled by the implementation.
 */
public abstract class CustomITopicalEntityRepositoryImpl<T extends IBaseEntity & ITrackedEntity & ITopicalEntity>
    implements CustomRepository<T, TopicalEntityQueryFilter> {

    /** Describes the elements of a query. */
    private static record QueryMetaData(TopicalEntityQueryFilter filter, Pageable pageable, String countQueryName,
        String selectQueryName, String entityName, String masterEntityName, boolean hasMasterEntity, boolean hasTopic,
        boolean isRecursive, boolean hasStatus, boolean hasText, boolean hasTextH2, boolean hasTextMariaDB,
        boolean isAdvanced, boolean isPaged, boolean isSorted) {
    }

    private static final Logger LOG = LoggerFactory.getLogger(CustomITopicalEntityRepositoryImpl.class);

    @PersistenceContext
    EntityManager em;
    @Resource
    EntityUtils entityUtils;
    @Resource
    ProfileUtils profileUtils;

    /**
     * Returns the runtime entity class corresponding to the {@literal <T>} type parameter.
     * @return The runtime entity class.
     */
    protected abstract Class<T> getEntityClass();

    /**
     * Returns the database columns for which there exists a full text index.
     * @return A comma-separated list of back-quoted database column names.
     */
    protected abstract String getFulltextColumns();

    /**
     * Returns metadata about a query and paging/sorting specification.
     * @param filter The query filter, must not be {@code null}.
     * @param pageable Specifies sorting and pagination, must not be {@code null}.
     * @return Query metadata.
     */
    @SuppressWarnings("null")
    private QueryMetaData getQueryMetaData(@Nullable TopicalEntityQueryFilter filter, @NonNull Pageable pageable) {
        boolean hasFilter = filter != null;
        boolean hasTopic = hasFilter && filter.getTopicId() != null;
        boolean isRecursive = hasTopic && filter.getRecursive();
        boolean hasMasterEntity = hasFilter && filter.getMasterEntityKind() != null && filter.getMasterEntityId() != null;
        boolean hasStatus = hasFilter && filter.getStatus() != null && !filter.getStatus().isEmpty();
        boolean hasText = hasFilter && filter.getText() != null;
        boolean hasTextH2 = hasText && profileUtils.isIntegrationTesting();
        boolean hasTextMariaDB = hasText && !profileUtils.isIntegrationTesting();
        boolean isAdvanced = hasText && filter.getAdvancedSearch();
        boolean isPaged = pageable.isPaged();
        boolean isSorted = pageable.getSort().isSorted();
        String entityName = entityUtils.getEntityName(getEntityClass());
        String masterEntityName = hasMasterEntity ? entityUtils.getEntityName(filter.getMasterEntityKind()) : "";

        // For paged queries involving an H2 full text filter, we need to ensure that the sort order includes "id"
        // because otherwise the join with FT_SEARCH_DATA can result in records duplicated across successive pages.
        if (hasTextH2 && isPaged && pageable.getSort().filter(o -> o.getProperty().equals("id")).isEmpty()) {
            Sort sort = pageable.getSort().and(Sort.by("id"));
            pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
            isSorted = true;
        }

        StringBuilder countQueryName = new StringBuilder();
        StringBuilder selectQueryName = new StringBuilder();
        countQueryName.append(entityName).append(".countBy");
        selectQueryName.append(entityName).append(".findBy");
        if (hasMasterEntity) {
            countQueryName.append(masterEntityName);
            selectQueryName.append(masterEntityName);
        }
        if (isRecursive) {
            countQueryName.append("Recursive");
            selectQueryName.append("Recursive");
        }
        if (hasTopic) {
            countQueryName.append("Topic");
            selectQueryName.append("Topic");
        }
        if (hasStatus) {
            countQueryName.append("Status");
            selectQueryName.append("Status");
        }
        if (hasText) {
            countQueryName.append("Text");
            selectQueryName.append("Text");
            if (isAdvanced) {
                countQueryName.append("Advanced");
                selectQueryName.append("Advanced");
            }
        }
        if (isSorted) {
            entityUtils.appendOrderByToQueryName(selectQueryName, pageable);
        }

        return new QueryMetaData(filter, pageable, countQueryName.toString(), selectQueryName.toString(), entityName, masterEntityName,
            hasMasterEntity, hasTopic, isRecursive, hasStatus, hasText, hasTextH2, hasTextMariaDB, isAdvanced, isPaged,
            isSorted);
    }

    /**
     * Defines and registers a pair of named queries with the {@code EntityManagerFactory}.
     * @param m Query metadata.
     * @return An executable query pair.
     */
    private QueryPair defineNamedQueries(QueryMetaData m) {
        // Question: do we need the recursive topic filter if a master entity is provided?
        // One might be tempted to think that we would only need to apply a topic filter when retrieving the master
        // entity list, and that retrieval of associated entities could be done simply via the <master>_<entity>
        // association table.
        // However, a master entity person might be associated with multiple topics and multiple publications or
        // declarations, each of which may or may not pertain to the specified topic,
        // so if a topic filter is specified, we would not want to include publications or declarations that do not
        // pertain to that topic.
        // Additionally, if NO topic was selected, we would expect to see ALL associated publications and declarations,
        // whereas when a topic IS selected, we would expect to see ONLY those publications and declarations associated
        // with that topic.
        // In other words, if a topicId is supplied, it must be used in the query regardless of whether a master entity
        // is supplied.
        /*
        NOTE: H2 full text indexes work like this:
        CREATE ALIAS IF NOT EXISTS FT_INIT FOR "org.h2.fulltext.FullText.init";
        CALL FT_INIT();
        CALL FT_CREATE_INDEX('SCHEMA', 'TABLE', 'COLUMN-LIST');
        CALL FT_DROP_INDEX('SCHEMA', 'TABLE');
        SELECT * FROM FT_SEARCH('Hello', limit, offset); -> QUERY: "PUBLIC"."TEST" WHERE "ID"=1;
        NOTE: H2 common table expressions look like this:
        WITH RECURSIVE sub_topic("id", "parent_id")
        AS (
            nonRecursiveSelect
            UNION ALL
            recursiveSelect
        )
        SELECT ...
        CAN JOIN LIKE THIS:
        SELECT * FROM "table"
        JOIN FT_SEARCH_DATA('Hello', 0, 0) ft
        ON ft."TABLE" = 'table' AND "table"."id" = ft."KEYS"[1];
        --------
        -- This is what the template looks like conceptually when ALL filter fields are provided.
        WITH RECURSIVE "sub_topic"
        AS (
            SELECT "id", "parent_id"
            FROM "topic" t
            WHERE t."id" = :topicId AND t."status" IN (:status)
            UNION
            SELECT t."id", t."parent_id"
            FROM "topic" t
            INNER JOIN
                "sub_topic" st ON t."parent_id" = st."id"
            WHERE t."status" IN (:status)
        )
        SELECT DISTINCT e.*
        FROM "${entityName}" e
        INNER JOIN (
            "sub_topic" st,
            "topic_${entityName}_ref" tr,
            "${masterEntityName}_${entityName}" me,
            FT_SEARCH_DATA(:text, 0, 0) ft
        )
        ON
            tr."topic_id" = st."id"
            AND tr."%s_id" = e."id"
            AND me."${masterEntityName}_id" = :masterEntityId
            AND me."${entityName}_id" = e.id
            AND ft."TABLE" = '${entityName}'
            AND "${entityName}"."id" = ft."KEYS"[1]
        WHERE
            MATCH (${fulltextEntityColumns}) AGAINST (:text IN BOOLEAN MODE)
            AND "status" IN (:status)
        ORDER BY
            e."${sortField}" ${sortOrder}, ...
        ;
        */

        // This is the recursive query that collects all sub-topics of a specified topic (including the latter).
        String subTopicRecursiveClause;
        if (m.hasTopic && !m.isRecursive) {
            String template = """
                WITH RECURSIVE "sub_topic"
                AS (
                    SELECT "id", "parent_id"
                    FROM "topic" t
                    WHERE t."id" = :topicId%s
                    UNION ALL
                    SELECT t."id", t."parent_id"
                    FROM "topic" t
                    INNER JOIN
                        "sub_topic" st ON t."parent_id" = st."id"%s
                )
                """;
            StringBuilder recursiveWhereClause1 = new StringBuilder();
            StringBuilder recursiveWhereClause2 = new StringBuilder();
            if (m.hasStatus) {
                recursiveWhereClause1.append(" AND t.\"status\" IN (:status)");
                recursiveWhereClause2.append(NL) //
                    .append("    WHERE t.\"status\" IN (:status)");
            }
            subTopicRecursiveClause = String.format(template, recursiveWhereClause1, recursiveWhereClause2);
        } else {
            subTopicRecursiveClause = "";
        }

        /*
        -- This is a representation of the template showing the local variables and their value expressions, as substituted for %s parameter markers.
        %s --${subTopicRecursiveClause}
        SELECT COUNT(*) | DISTINCT e.*
        FROM "%s" e --${entityName}
        %s --${innerJoinOpen} = "INNER JOIN ("
        %s --${stJoinTables} = "    "sub_topic" st,\n    "topic_${entityName}_ref" tr,"
        %s --${meJoinTable} = "    "${masterEntityName}_${entityName}" me,"
        %s --${ftJoinTable} = "    FT_SEARCH_DATA(:text, 0, 0) ft"
        %s --${innerJoinClose} = ")\nON"
        %s --${stJoinCondition} = "    tr."topic_id" = st."id"\n    AND tr."${entityName}_id" = e."id""
        %s --${meJoinCondition} = "    AND me."${masterEntityName}_id" = :masterEntityId\n    AND me."${entityName}_id" = e."id""
        %s --${ftJoinCondition} = "    AND ft."TABLE" = '${entityName}'\n    AND "${entityName}"."id" = ft."KEYS"[1]"
        %s --${whereClause} = "WHERE\n    MATCH (${getFulltextColumns()}) AGAINST (:text)\n    AND e."status" IN (:status)"
        %s --${orderByClause} = "ORDER BY e."${sortField}" ${sortOrder}"
        ;
        */

        String template = """
            %s
            SELECT %s
            FROM "%s" e%s%s%s%s%s%s%s%s%s%s;
            """;

        StringBuilder innerJoinOpen = new StringBuilder();
        StringBuilder stJoinTables = new StringBuilder();
        StringBuilder meJoinTable = new StringBuilder();
        StringBuilder ftJoinTable = new StringBuilder();
        StringBuilder innerJoinClose = new StringBuilder();
        StringBuilder stJoinCondition = new StringBuilder();
        StringBuilder meJoinCondition = new StringBuilder();
        StringBuilder ftJoinCondition = new StringBuilder();
        StringBuilder whereClause = new StringBuilder();
        StringBuilder orderByClause = new StringBuilder();
        boolean needsAnd = false;
        if (m.hasTopic) {
            stJoinTables.append(NL) //
                .append("    \"sub_topic\" st,").append(NL) //
                .append("    \"topic_").append(m.entityName).append("_ref\" tr");
            if (m.hasMasterEntity || m.hasTextMariaDB)
                stJoinTables.append(',');
            stJoinCondition.append(NL) //
                .append("    tr.\"topic_id\" = st.\"id\"").append(NL) //
                .append("    AND tr.\"").append(m.entityName).append("_id\" = e.\"id\"");
            needsAnd = true;
        }
        if (m.hasMasterEntity) {
            String masterEntityName = entityUtils.getEntityName(m.filter.getMasterEntityKind());
            meJoinTable.append(NL) //
                .append("    \"").append(masterEntityName).append('_').append(m.entityName).append("\" me");
            if (m.hasTextH2)
                meJoinTable.append(',');
            meJoinCondition.append(NL) //
                .append("    ");
            if (needsAnd)
                meJoinCondition.append("AND ");
            meJoinCondition.append("me.\"").append(masterEntityName).append("_id\" = :masterEntityId").append(NL)
                .append("    AND me.\"").append(m.entityName).append("_id\" = e.\"id\"");
            needsAnd = true;
        }
        if (m.hasTextH2) {
            ftJoinTable.append(NL) //
                .append("    FT_SEARCH_DATA(:text, 0, 0) ft");
            ftJoinCondition.append(NL) //
                .append("    ");
            if (needsAnd)
                ftJoinCondition.append("AND ");
            ftJoinCondition.append("ft.\"TABLE\" = '").append(m.entityName).append('\'').append(NL) //
                .append("    AND e.\"id\" = ft.\"KEYS\"[1]");
            needsAnd = true;
        }
        if (m.hasTopic || m.hasMasterEntity || m.hasTextH2) {
            innerJoinOpen.append(NL) //
                .append("INNER JOIN (");
            innerJoinClose.append(NL) //
                .append(") ON");
        }
        if (m.hasTextMariaDB || m.hasStatus) {
            whereClause.append(NL) //
                .append("WHERE").append(NL) //
                .append("    ");
            needsAnd = false;
            if (m.hasTextMariaDB) {
                whereClause.append("MATCH (").append(getFulltextColumns()).append(") AGAINST (:text");
                if (m.isAdvanced)
                    whereClause.append(" IN BOOLEAN MODE");
                whereClause.append(')');
                needsAnd = true;
            }
            if (m.hasStatus) {
                if (needsAnd) {
                    whereClause.append(NL) //
                        .append("    AND ");
                }
                whereClause.append("e.\"status\" IN (:status)");
            }
        }
        
        if (m.isSorted)
            entityUtils.appendOrderByClause(orderByClause, m.pageable, "e.", true);

        // NOTE: since the COUNT query does not include an ORDER BY clause, multiple executions of the same SELECT query
        // with different ORDER BY clauses will result in the registration of multiple identical COUNT queries, each of
        // which will simply overwrite the previous definition. This is not a problem, but it is somewhat inefficient.
        String countSql = String.format(template, subTopicRecursiveClause, "COUNT(*)", m.entityName, innerJoinOpen,
            stJoinTables, meJoinTable, ftJoinTable, innerJoinClose, stJoinCondition, meJoinCondition, ftJoinCondition,
            whereClause, "");
        Query countQuery = em.createNativeQuery(countSql, Long.class);
        em.getEntityManagerFactory().addNamedQuery(m.countQueryName, countQuery);
        LOG.debug("Defined query '{}' as:\n{}", m.countQueryName, countSql);

        String selectSql = String.format(template, subTopicRecursiveClause, "DISTINCT e.*", m.entityName, innerJoinOpen,
            stJoinTables, meJoinTable, ftJoinTable, innerJoinClose, stJoinCondition, meJoinCondition, ftJoinCondition,
            whereClause, orderByClause);
        Query selectQuery = em.createNativeQuery(selectSql, getEntityClass());
        em.getEntityManagerFactory().addNamedQuery(m.selectQueryName, selectQuery);
        LOG.debug("Defined query '{}' as:\n{}", m.selectQueryName, selectSql);

        return new QueryPair(countQuery, selectQuery);
    }

    @Override
    // @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public Page<T> findByFilter(@Nullable TopicalEntityQueryFilter filter, @NonNull Pageable pageable) {
        QueryMetaData m = getQueryMetaData(filter, pageable);

        QueryPair queries;
        try {
            Query countQuery = em.createNamedQuery(m.countQueryName, Long.class);
            Query selectQuery = em.createNamedQuery(m.selectQueryName, getEntityClass());
            queries = new QueryPair(countQuery, selectQuery);
        } catch (IllegalArgumentException e) {
            queries = defineNamedQueries(m);
        }

        Map<String, Object> params = new HashMap<>();
        if (m.hasTopic)
            params.put("topicId", m.filter.getTopicId());
        if (m.hasMasterEntity)
            params.put("masterEntityId", m.filter.getMasterEntityId());
        if (m.hasText)
            params.put("text", m.filter.getText());
        if (m.hasStatus)
            params.put("status", m.filter.getStatus().stream().map(e -> e.name()).toList());
        entityUtils.setQueryParameters(queries, params);
        if (m.isPaged)
            entityUtils.setQueryPagination(queries.selectQuery(), m.pageable);

        long total = (Long)queries.countQuery().getSingleResult();
        List<T> content = queries.selectQuery().getResultList();
        return new PageImpl<>(content, m.pageable, total);
    }

}
