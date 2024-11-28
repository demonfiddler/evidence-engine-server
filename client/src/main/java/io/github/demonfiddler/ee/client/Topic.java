/*----------------------------------------------------------------------------------------------------------------------
 * Evidence Engine: A system for managing evidence on arbitrary scientific topics.
 * Comprises an SQL database, GraphQL public API, Java app server and web client.
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

package io.github.demonfiddler.ee.client;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.graphql_java_generator.annotation.GraphQLIgnore;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import com.graphql_java_generator.client.GraphQLObjectMapper;

import io.github.demonfiddler.ee.client.util.CustomJacksonDeserializers;

/**
 * A node in the topic hierarchy tree.
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("Topic")
@JsonInclude(Include.NON_NULL)
public class Topic implements IBaseEntity, ITrackedEntity {

	/**
	 * This map contains the deserialized values for the alias, as parsed from the JSON response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public Topic() {
	}

	/**
	 * The unique topic identifier.
	 */
	@JsonProperty("id")
	@GraphQLScalar(fieldName = "id", graphQLTypeSimpleName = "ID", javaClass = Long.class, listDepth = 0)
	Long id;

	/**
	 * The entity status.
	 */
	@JsonProperty("status")
	@GraphQLInputParameters(names = { "format" }, types = { "FormatKind" }, mandatories = { false }, listDepths = { 0 },
		itemsMandatory = { false })
	@GraphQLScalar(fieldName = "status", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String status;

	/**
	 * When the record was created.
	 */
	@JsonProperty("created")
	@JsonDeserialize(using = CustomJacksonDeserializers.DateTime.class)
	@GraphQLScalar(fieldName = "created", graphQLTypeSimpleName = "DateTime", javaClass = OffsetDateTime.class,
		listDepth = 0)
	OffsetDateTime created;

	/**
	 * The user who created the record.
	 */
	@JsonProperty("createdByUser")
	@GraphQLNonScalar(fieldName = "createdByUser", graphQLTypeSimpleName = "User", javaClass = User.class,
		listDepth = 0)
	User createdByUser;

	/**
	 * When the record was last updated.
	 */
	@JsonProperty("updated")
	@JsonDeserialize(using = CustomJacksonDeserializers.DateTime.class)
	@GraphQLScalar(fieldName = "updated", graphQLTypeSimpleName = "DateTime", javaClass = OffsetDateTime.class,
		listDepth = 0)
	OffsetDateTime updated;

	/**
	 * The user who last updated the record.
	 */
	@JsonProperty("updatedByUser")
	@GraphQLNonScalar(fieldName = "updatedByUser", graphQLTypeSimpleName = "User", javaClass = User.class,
		listDepth = 0)
	User updatedByUser;

	/**
	 * Log of transactions involving the record.
	 */
	@JsonProperty("log")
	@GraphQLInputParameters(names = { "filter", "pageSort" }, types = { "LogQueryFilter", "PageableInput" },
		mandatories = { false, false }, listDepths = { 0, 0 }, itemsMandatory = { false, false })
	@GraphQLNonScalar(fieldName = "log", graphQLTypeSimpleName = "LogPage", javaClass = LogPage.class, listDepth = 0)
	LogPage log;

	/**
	 * The topic label for display in the user interface.
	 */
	@JsonProperty("label")
	@GraphQLScalar(fieldName = "label", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String label;

	/**
	 * The topic description.
	 */
	@JsonProperty("description")
	@GraphQLScalar(fieldName = "description", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String description;

	/**
	 * The parent topic.
	 */
	@JsonProperty("parent")
	@GraphQLNonScalar(fieldName = "parent", graphQLTypeSimpleName = "Topic", javaClass = Topic.class, listDepth = 0)
	Topic parent;

	/**
	 * The sub-topics.
	 */
	@JsonProperty("children")
	@JsonDeserialize(using = CustomJacksonDeserializers.ListTopic.class)
	@GraphQLNonScalar(fieldName = "children", graphQLTypeSimpleName = "Topic", javaClass = Topic.class, listDepth = 1)
	List<Topic> children;

	/**
	 * Referenced entities.
	 */
	@JsonProperty("entities")
	@JsonDeserialize(using = CustomJacksonDeserializers.ListITopicalEntity.class)
	@GraphQLInputParameters(names = { "entityKind", "filter", "pageSort" },
		types = { "EntityKind", "TopicalEntityQueryFilter", "PageableInput" }, mandatories = { true, false, false },
		listDepths = { 0, 0, 0 }, itemsMandatory = { false, false, false })
	@GraphQLNonScalar(fieldName = "entities", graphQLTypeSimpleName = "ITopicalEntity",
		javaClass = ITopicalEntity.class, listDepth = 1)
	List<ITopicalEntity> entities;

	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String __typename;

	/**
	 * The unique topic identifier.
	 */
	@Override
	@JsonIgnore
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * The unique topic identifier.
	 */
	@Override
	@JsonIgnore
	public Long getId() {
		return this.id;
	}

	/**
	 * The entity status.
	 */
	@Override
	@JsonIgnore
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * The entity status.
	 */
	@Override
	@JsonIgnore
	public String getStatus() {
		return this.status;
	}

	/**
	 * When the record was created.
	 */
	@Override
	@JsonIgnore
	public void setCreated(OffsetDateTime created) {
		this.created = created;
	}

	/**
	 * When the record was created.
	 */
	@Override
	@JsonIgnore
	public OffsetDateTime getCreated() {
		return this.created;
	}

	/**
	 * The user who created the record.
	 */
	@Override
	@JsonIgnore
	public void setCreatedByUser(User createdByUser) {
		this.createdByUser = createdByUser;
	}

	/**
	 * The user who created the record.
	 */
	@Override
	@JsonIgnore
	public User getCreatedByUser() {
		return this.createdByUser;
	}

	/**
	 * When the record was last updated.
	 */
	@Override
	@JsonIgnore
	public void setUpdated(OffsetDateTime updated) {
		this.updated = updated;
	}

	/**
	 * When the record was last updated.
	 */
	@Override
	@JsonIgnore
	public OffsetDateTime getUpdated() {
		return this.updated;
	}

	/**
	 * The user who last updated the record.
	 */
	@Override
	@JsonIgnore
	public void setUpdatedByUser(User updatedByUser) {
		this.updatedByUser = updatedByUser;
	}

	/**
	 * The user who last updated the record.
	 */
	@Override
	@JsonIgnore
	public User getUpdatedByUser() {
		return this.updatedByUser;
	}

	/**
	 * Log of transactions involving the record.
	 */
	@Override
	@JsonIgnore
	public void setLog(LogPage log) {
		this.log = log;
	}

	/**
	 * Log of transactions involving the record.
	 */
	@Override
	@JsonIgnore
	public LogPage getLog() {
		return this.log;
	}

	/**
	 * The topic label for display in the user interface.
	 */
	@JsonProperty("label")
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * The topic label for display in the user interface.
	 */
	@JsonProperty("label")
	public String getLabel() {
		return this.label;
	}

	/**
	 * The topic description.
	 */
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * The topic description.
	 */
	@JsonProperty("description")
	public String getDescription() {
		return this.description;
	}

	/**
	 * The parent topic.
	 */
	@JsonProperty("parent")
	public void setParent(Topic parent) {
		this.parent = parent;
	}

	/**
	 * The parent topic.
	 */
	@JsonProperty("parent")
	public Topic getParent() {
		return this.parent;
	}

	/**
	 * The sub-topics.
	 */
	@JsonProperty("children")
	public void setChildren(List<Topic> children) {
		this.children = children;
	}

	/**
	 * The sub-topics.
	 */
	@JsonProperty("children")
	public List<Topic> getChildren() {
		return this.children;
	}

	/**
	 * Referenced entities.
	 */
	@JsonProperty("entities")
	public void setEntities(List<ITopicalEntity> entities) {
		this.entities = entities;
	}

	/**
	 * Referenced entities.
	 */
	@JsonProperty("entities")
	public List<ITopicalEntity> getEntities() {
		return this.entities;
	}

	@Override
	@JsonIgnore
	public void set__typename(String __typename) {
		this.__typename = __typename;
	}

	@Override
	@JsonIgnore
	public String get__typename() {
		return this.__typename;
	}

	/**
	 * This method is called during the json deserialization process, by the {@link GraphQLObjectMapper}, each time an
	 * alias value is read from the json.
	 * @param aliasName
	 * @param aliasDeserializedValue
	 */
	public void setAliasValue(String aliasName, Object aliasDeserializedValue) {
		this.aliasValues.put(aliasName, aliasDeserializedValue);
	}

	/**
	 * Retrieves the value for the given alias, as it has been received for this object in the GraphQL response. <BR/>
	 * This method <B>should not be used for Custom Scalars</B>, as the parser doesn't know if this alias is a custom
	 * scalar, and which custom scalar to use at deserialization time. In most case, a value will then be provided by
	 * this method with a basis json deserialization, but this value won't be the proper custom scalar value.
	 * @param alias
	 * @return
	 */
	public Object getAliasValue(String alias) {
		return this.aliasValues.get(alias);
	}

	public String toString() {
		return "Topic {" //$NON-NLS-1$
			+ "id: " + this.id //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "status: " + this.status //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "created: " + this.created //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "createdByUser: " + this.createdByUser //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "updated: " + this.updated //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "updatedByUser: " + this.updatedByUser //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "log: " + this.log //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "label: " + this.label //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "description: " + this.description //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "parent: " + this.parent //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "children: " + this.children //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "entities: " + this.entities //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "__typename: " + this.__typename //$NON-NLS-1$
			+ "}"; //$NON-NLS-1$
	}

	public static Builder builder() {
		return new Builder();
	}

	/**
	 * The Builder that helps building instance of this POJO. You can get an instance of this class, by calling the
	 * {@link #builder()}
	 */
	public static class Builder {

		private Long id;
		private String status;
		private OffsetDateTime created;
		private User createdByUser;
		private OffsetDateTime updated;
		private User updatedByUser;
		private LogPage log;
		private String label;
		private String description;
		private Topic parent;
		private List<Topic> children;
		private List<ITopicalEntity> entities;

		/**
		 * The unique topic identifier.
		 */
		public Builder withId(Long idParam) {
			this.id = idParam;
			return this;
		}

		/**
		 * The entity status.
		 */
		public Builder withStatus(String statusParam) {
			this.status = statusParam;
			return this;
		}

		/**
		 * When the record was created.
		 */
		public Builder withCreated(OffsetDateTime createdParam) {
			this.created = createdParam;
			return this;
		}

		/**
		 * The user who created the record.
		 */
		public Builder withCreatedByUser(User createdByUserParam) {
			this.createdByUser = createdByUserParam;
			return this;
		}

		/**
		 * When the record was last updated.
		 */
		public Builder withUpdated(OffsetDateTime updatedParam) {
			this.updated = updatedParam;
			return this;
		}

		/**
		 * The user who last updated the record.
		 */
		public Builder withUpdatedByUser(User updatedByUserParam) {
			this.updatedByUser = updatedByUserParam;
			return this;
		}

		/**
		 * Log of transactions involving the record.
		 */
		public Builder withLog(LogPage logParam) {
			this.log = logParam;
			return this;
		}

		/**
		 * The topic label for display in the user interface.
		 */
		public Builder withLabel(String labelParam) {
			this.label = labelParam;
			return this;
		}

		/**
		 * The topic description.
		 */
		public Builder withDescription(String descriptionParam) {
			this.description = descriptionParam;
			return this;
		}

		/**
		 * The parent topic.
		 */
		public Builder withParent(Topic parentParam) {
			this.parent = parentParam;
			return this;
		}

		/**
		 * The sub-topics.
		 */
		public Builder withChildren(List<Topic> childrenParam) {
			this.children = childrenParam;
			return this;
		}

		/**
		 * Referenced entities.
		 */
		public Builder withEntities(List<ITopicalEntity> entitiesParam) {
			this.entities = entitiesParam;
			return this;
		}

		public Topic build() {
			Topic _object = new Topic();
			_object.setId(this.id);
			_object.setStatus(this.status);
			_object.setCreated(this.created);
			_object.setCreatedByUser(this.createdByUser);
			_object.setUpdated(this.updated);
			_object.setUpdatedByUser(this.updatedByUser);
			_object.setLog(this.log);
			_object.setLabel(this.label);
			_object.setDescription(this.description);
			_object.setParent(this.parent);
			_object.setChildren(this.children);
			_object.setEntities(this.entities);
			_object.set__typename("Topic"); //$NON-NLS-1$
			return _object;
		}

	}

}