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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLInterfaceType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;
import com.graphql_java_generator.client.GraphQLObjectMapper;

/**
 * Interface for entities with associated topics.
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "__typename", visible = true)
@JsonSubTypes({ @Type(value = Claim.class, name = "Claim"), @Type(value = Declaration.class, name = "Declaration"),
	@Type(value = Person.class, name = "Person"), @Type(value = Publication.class, name = "Publication"),
	@Type(value = Quotation.class, name = "Quotation") })
@GraphQLInterfaceType("ITopicalEntity")
public interface ITopicalEntity {

	@JsonProperty("topicRefs")
	@GraphQLInputParameters(names = { "filter", "pageSort" }, types = { "TopicRefQueryFilter", "PageableInput" },
		mandatories = { false, false }, listDepths = { 0, 0 }, itemsMandatory = { false, false })
	@GraphQLNonScalar(fieldName = "topicRefs", graphQLTypeSimpleName = "TopicRefPage", javaClass = TopicRefPage.class,
		listDepth = 0)
	public void setTopicRefs(TopicRefPage topicRefs);

	@JsonProperty("topicRefs")
	@GraphQLInputParameters(names = { "filter", "pageSort" }, types = { "TopicRefQueryFilter", "PageableInput" },
		mandatories = { false, false }, listDepths = { 0, 0 }, itemsMandatory = { false, false })
	@GraphQLNonScalar(fieldName = "topicRefs", graphQLTypeSimpleName = "TopicRefPage", javaClass = TopicRefPage.class,
		listDepth = 0)
	public TopicRefPage getTopicRefs();

	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	public void set__typename(String __typename);

	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	public String get__typename();

	/**
	 * This method is called during the json deserialization process, by the {@link GraphQLObjectMapper}, each time an
	 * alias value is read from the json.
	 * @param aliasName
	 * @param aliasDeserializedValue
	 */
	public void setAliasValue(String aliasName, Object aliasDeserializedValue);

	/**
	 * Retrieves the value for the given alias, as it has been received for this object in the GraphQL response. <BR/>
	 * This method <B>should not be used for Custom Scalars</B>, as the parser doesn't know if this alias is a custom
	 * scalar, and which custom scalar to use at deserialization time. In most case, a value will then be provided by
	 * this method with a basis json deserialization, but this value won't be the proper custom scalar value.
	 * @param alias
	 * @return
	 */
	public Object getAliasValue(String alias);

}