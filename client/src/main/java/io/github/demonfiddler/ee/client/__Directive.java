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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("__Directive")
@JsonInclude(Include.NON_NULL)
public class __Directive {

	/**
	 * This map contains the deserialized values for the alias, as parsed from the JSON response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public __Directive() {
	}

	@JsonProperty("name")
	@GraphQLScalar(fieldName = "name", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String name;

	@JsonProperty("description")
	@GraphQLScalar(fieldName = "description", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String description;

	@JsonProperty("locations")
	@JsonDeserialize(using = CustomJacksonDeserializers.List__DirectiveLocation.class)
	@GraphQLScalar(fieldName = "locations", graphQLTypeSimpleName = "__DirectiveLocation",
		javaClass = __DirectiveLocation.class, listDepth = 1)
	List<__DirectiveLocation> locations;

	@JsonProperty("args")
	@JsonDeserialize(using = CustomJacksonDeserializers.List__InputValue.class)
	@GraphQLInputParameters(names = { "includeDeprecated" }, types = { "Boolean" }, mandatories = { false },
		listDepths = { 0 }, itemsMandatory = { false })
	@GraphQLNonScalar(fieldName = "args", graphQLTypeSimpleName = "__InputValue", javaClass = __InputValue.class,
		listDepth = 1)
	List<__InputValue> args;

	@JsonProperty("isRepeatable")
	@GraphQLScalar(fieldName = "isRepeatable", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class,
		listDepth = 0)
	Boolean isRepeatable;

	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String __typename;

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("description")
	public String getDescription() {
		return this.description;
	}

	@JsonProperty("locations")
	public void setLocations(List<__DirectiveLocation> locations) {
		this.locations = locations;
	}

	@JsonProperty("locations")
	public List<__DirectiveLocation> getLocations() {
		return this.locations;
	}

	@JsonProperty("args")
	public void setArgs(List<__InputValue> args) {
		this.args = args;
	}

	@JsonProperty("args")
	public List<__InputValue> getArgs() {
		return this.args;
	}

	@JsonProperty("isRepeatable")
	public void setIsRepeatable(Boolean isRepeatable) {
		this.isRepeatable = isRepeatable;
	}

	@JsonProperty("isRepeatable")
	public Boolean getIsRepeatable() {
		return this.isRepeatable;
	}

	@JsonProperty("__typename")
	public void set__typename(String __typename) {
		this.__typename = __typename;
	}

	@JsonProperty("__typename")
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
		return "__Directive {" //$NON-NLS-1$
			+ "name: " + this.name //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "description: " + this.description //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "locations: " + this.locations //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "args: " + this.args //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "isRepeatable: " + this.isRepeatable //$NON-NLS-1$
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
		private String name;
		private String description;
		private List<__DirectiveLocation> locations;
		private List<__InputValue> args;
		private Boolean isRepeatable;

		public Builder withName(String nameParam) {
			this.name = nameParam;
			return this;
		}

		public Builder withDescription(String descriptionParam) {
			this.description = descriptionParam;
			return this;
		}

		public Builder withLocations(List<__DirectiveLocation> locationsParam) {
			this.locations = locationsParam;
			return this;
		}

		public Builder withArgs(List<__InputValue> argsParam) {
			this.args = argsParam;
			return this;
		}

		public Builder withIsRepeatable(Boolean isRepeatableParam) {
			this.isRepeatable = isRepeatableParam;
			return this;
		}

		public __Directive build() {
			__Directive _object = new __Directive();
			_object.setName(this.name);
			_object.setDescription(this.description);
			_object.setLocations(this.locations);
			_object.setArgs(this.args);
			_object.setIsRepeatable(this.isRepeatable);
			_object.set__typename("__Directive"); //$NON-NLS-1$
			return _object;
		}
	}
}