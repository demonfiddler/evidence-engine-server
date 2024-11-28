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

package io.github.demonfiddler.ee.server.model;

import java.net.URL;

import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * An input for creating or updating a publisher.
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("PublisherInput")
public class PublisherInput {

	/**
	 * The unique publisher identifier.
	 */
	@GraphQLScalar(fieldName = "id", graphQLTypeSimpleName = "ID", javaClass = Long.class, listDepth = 0)
	Long id;

	/**
	 * The publisher name.
	 */
	@GraphQLScalar(fieldName = "name", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String name;

	/**
	 * The publisher location.
	 */
	@GraphQLScalar(fieldName = "location", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String location;

	/**
	 * The ISO-3166-1 alpha-2 code for the publisher's country.
	 */
	@GraphQLScalar(fieldName = "country", graphQLTypeSimpleName = "Country", javaClass = String.class, listDepth = 0)
	String country;

	/**
	 * URL of publisher's home page.
	 */
	@GraphQLScalar(fieldName = "url", graphQLTypeSimpleName = "URL", javaClass = URL.class, listDepth = 0)
	URL url;

	/**
	 * The number of journals published.
	 */
	@GraphQLScalar(fieldName = "journalCount", graphQLTypeSimpleName = "Int", javaClass = Integer.class, listDepth = 0)
	Integer journalCount;

	/**
	 * The unique publisher identifier.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * The unique publisher identifier.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * The publisher name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The publisher name.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * The publisher location.
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * The publisher location.
	 */
	public String getLocation() {
		return this.location;
	}

	/**
	 * The ISO-3166-1 alpha-2 code for the publisher's country.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * The ISO-3166-1 alpha-2 code for the publisher's country.
	 */
	public String getCountry() {
		return this.country;
	}

	/**
	 * URL of publisher's home page.
	 */
	public void setUrl(URL url) {
		this.url = url;
	}

	/**
	 * URL of publisher's home page.
	 */
	public URL getUrl() {
		return this.url;
	}

	/**
	 * The number of journals published.
	 */
	public void setJournalCount(Integer journalCount) {
		this.journalCount = journalCount;
	}

	/**
	 * The number of journals published.
	 */
	public Integer getJournalCount() {
		return this.journalCount;
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
