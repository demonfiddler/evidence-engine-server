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
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.graphql_java_generator.annotation.GraphQLIgnore;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import com.graphql_java_generator.client.GraphQLObjectMapper;

/**
 * Input for creating or updating a user of the system.
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("UserInput")
@JsonInclude(Include.NON_NULL)
public class UserInput {

	/**
	 * This map contains the deserialized values for the alias, as parsed from the JSON response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public UserInput() {
	}

	/**
	 * The immutable, unique user identifier (system-assigned).
	 */
	@JsonProperty("id")
	@GraphQLScalar(fieldName = "id", graphQLTypeSimpleName = "ID", javaClass = Long.class, listDepth = 0)
	Long id;

	/**
	 * The (mutable?) unique login name (user-assigned).
	 */
	@JsonProperty("login")
	@GraphQLScalar(fieldName = "login", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String login;

	/**
	 * The user's first name.
	 */
	@JsonProperty("firstName")
	@GraphQLScalar(fieldName = "firstName", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String firstName;

	/**
	 * The user's last name.
	 */
	@JsonProperty("lastName")
	@GraphQLScalar(fieldName = "lastName", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String lastName;

	/**
	 * The user's email address.
	 */
	@JsonProperty("email")
	@GraphQLScalar(fieldName = "email", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String email;

	/**
	 * A hash of the user's password.
	 */
	@JsonProperty("passwordHash")
	@GraphQLScalar(fieldName = "passwordHash", graphQLTypeSimpleName = "String", javaClass = String.class,
		listDepth = 0)
	String passwordHash;

	/**
	 * The immutable, unique user identifier (system-assigned).
	 */
	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * The immutable, unique user identifier (system-assigned).
	 */
	@JsonProperty("id")
	public Long getId() {
		return this.id;
	}

	/**
	 * The (mutable?) unique login name (user-assigned).
	 */
	@JsonProperty("login")
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * The (mutable?) unique login name (user-assigned).
	 */
	@JsonProperty("login")
	public String getLogin() {
		return this.login;
	}

	/**
	 * The user's first name.
	 */
	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * The user's first name.
	 */
	@JsonProperty("firstName")
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * The user's last name.
	 */
	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * The user's last name.
	 */
	@JsonProperty("lastName")
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * The user's email address.
	 */
	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * The user's email address.
	 */
	@JsonProperty("email")
	public String getEmail() {
		return this.email;
	}

	/**
	 * A hash of the user's password.
	 */
	@JsonProperty("passwordHash")
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	/**
	 * A hash of the user's password.
	 */
	@JsonProperty("passwordHash")
	public String getPasswordHash() {
		return this.passwordHash;
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
		return "UserInput {" //$NON-NLS-1$
			+ "id: " + this.id //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "login: " + this.login //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "firstName: " + this.firstName //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "lastName: " + this.lastName //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "email: " + this.email //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "passwordHash: " + this.passwordHash //$NON-NLS-1$
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
		private String login;
		private String firstName;
		private String lastName;
		private String email;
		private String passwordHash;

		/**
		 * The immutable, unique user identifier (system-assigned).
		 */
		public Builder withId(Long idParam) {
			this.id = idParam;
			return this;
		}

		/**
		 * The (mutable?) unique login name (user-assigned).
		 */
		public Builder withLogin(String loginParam) {
			this.login = loginParam;
			return this;
		}

		/**
		 * The user's first name.
		 */
		public Builder withFirstName(String firstNameParam) {
			this.firstName = firstNameParam;
			return this;
		}

		/**
		 * The user's last name.
		 */
		public Builder withLastName(String lastNameParam) {
			this.lastName = lastNameParam;
			return this;
		}

		/**
		 * The user's email address.
		 */
		public Builder withEmail(String emailParam) {
			this.email = emailParam;
			return this;
		}

		/**
		 * A hash of the user's password.
		 */
		public Builder withPasswordHash(String passwordHashParam) {
			this.passwordHash = passwordHashParam;
			return this;
		}

		public UserInput build() {
			UserInput _object = new UserInput();
			_object.setId(this.id);
			_object.setLogin(this.login);
			_object.setFirstName(this.firstName);
			_object.setLastName(this.lastName);
			_object.setEmail(this.email);
			_object.setPasswordHash(this.passwordHash);
			return _object;
		}

	}

}