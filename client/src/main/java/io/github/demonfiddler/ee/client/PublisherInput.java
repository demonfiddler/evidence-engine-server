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

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.graphql_java_generator.annotation.GraphQLIgnore;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import com.graphql_java_generator.client.GraphQLObjectMapper;

import io.github.demonfiddler.ee.client.util.CustomJacksonSerializers;

/**
 * An input for creating or updating a publisher.
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("PublisherInput")
@JsonInclude(Include.NON_NULL)
public class PublisherInput {

	/**
	 * This map contains the deserialized values for the alias, as parsed from the JSON response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public PublisherInput() {
	}

	/**
	 * The unique publisher identifier.
	 */
	@JsonProperty("id")
	@GraphQLScalar(fieldName = "id", graphQLTypeSimpleName = "ID", javaClass = Long.class, listDepth = 0)
	Long id;

	/**
	 * The publisher name.
	 */
	@JsonProperty("name")
	@GraphQLScalar(fieldName = "name", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String name;

	/**
	 * The publisher location.
	 */
	@JsonProperty("location")
	@GraphQLScalar(fieldName = "location", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String location;

	/**
	 * The ISO-3166-1 alpha-2 code for the publisher's country.
	 */
	@JsonProperty("country")
	@GraphQLScalar(fieldName = "country", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String country;

	/**
	 * URL of publisher's home page.
	 */
	@JsonProperty("url")
	@JsonSerialize(using = CustomJacksonSerializers.URL.class)
	@GraphQLScalar(fieldName = "url", graphQLTypeSimpleName = "URL", javaClass = URL.class, listDepth = 0)
	URL url;

	/**
	 * The number of journals published.
	 */
	@JsonProperty("journalCount")
	@GraphQLScalar(fieldName = "journalCount", graphQLTypeSimpleName = "Int", javaClass = Integer.class, listDepth = 0)
	Integer journalCount;

	/**
	 * The unique publisher identifier.
	 */
	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * The unique publisher identifier.
	 */
	@JsonProperty("id")
	public Long getId() {
		return this.id;
	}

	/**
	 * The publisher name.
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The publisher name.
	 */
	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	/**
	 * The publisher location.
	 */
	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * The publisher location.
	 */
	@JsonProperty("location")
	public String getLocation() {
		return this.location;
	}

	/**
	 * The ISO-3166-1 alpha-2 code for the publisher's country.
	 */
	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * The ISO-3166-1 alpha-2 code for the publisher's country.
	 */
	@JsonProperty("country")
	public String getCountry() {
		return this.country;
	}

	/**
	 * URL of publisher's home page.
	 */
	@JsonProperty("url")
	public void setUrl(URL url) {
		this.url = url;
	}

	/**
	 * URL of publisher's home page.
	 */
	@JsonProperty("url")
	public URL getUrl() {
		return this.url;
	}

	/**
	 * The number of journals published.
	 */
	@JsonProperty("journalCount")
	public void setJournalCount(Integer journalCount) {
		this.journalCount = journalCount;
	}

	/**
	 * The number of journals published.
	 */
	@JsonProperty("journalCount")
	public Integer getJournalCount() {
		return this.journalCount;
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
		return "PublisherInput {" //$NON-NLS-1$
			+ "id: " + this.id //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "name: " + this.name //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "location: " + this.location //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "country: " + this.country //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "url: " + this.url //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "journalCount: " + this.journalCount //$NON-NLS-1$
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
		private String name;
		private String location;
		private String country;
		private URL url;
		private Integer journalCount;

		/**
		 * The unique publisher identifier.
		 */
		public Builder withId(Long idParam) {
			this.id = idParam;
			return this;
		}

		/**
		 * The publisher name.
		 */
		public Builder withName(String nameParam) {
			this.name = nameParam;
			return this;
		}

		/**
		 * The publisher location.
		 */
		public Builder withLocation(String locationParam) {
			this.location = locationParam;
			return this;
		}

		/**
		 * The ISO-3166-1 alpha-2 code for the publisher's country.
		 */
		public Builder withCountry(String countryParam) {
			this.country = countryParam;
			return this;
		}

		/**
		 * URL of publisher's home page.
		 */
		public Builder withUrl(URL urlParam) {
			this.url = urlParam;
			return this;
		}

		/**
		 * The number of journals published.
		 */
		public Builder withJournalCount(Integer journalCountParam) {
			this.journalCount = journalCountParam;
			return this;
		}

		public PublisherInput build() {
			PublisherInput _object = new PublisherInput();
			_object.setId(this.id);
			_object.setName(this.name);
			_object.setLocation(this.location);
			_object.setCountry(this.country);
			_object.setUrl(this.url);
			_object.setJournalCount(this.journalCount);
			return _object;
		}

	}

}
