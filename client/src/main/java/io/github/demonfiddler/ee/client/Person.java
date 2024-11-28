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
 * A person associated with given topic(s).
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("Person")
@JsonInclude(Include.NON_NULL)
public class Person implements IBaseEntity, ITrackedEntity, ITopicalEntity {

	/**
	 * This map contains the deserialized values for the alias, as parsed from the JSON response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public Person() {
	}

	/**
	 * The unique person identifier.
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
	 * The topic(s) associated with the person.
	 */
	@JsonProperty("topicRefs")
	@GraphQLInputParameters(names = { "filter", "pageSort" }, types = { "TopicRefQueryFilter", "PageableInput" },
		mandatories = { false, false }, listDepths = { 0, 0 }, itemsMandatory = { false, false })
	@GraphQLNonScalar(fieldName = "topicRefs", graphQLTypeSimpleName = "TopicRefPage", javaClass = TopicRefPage.class,
		listDepth = 0)
	TopicRefPage topicRefs;

	/**
	 * The person's title(s).
	 */
	@JsonProperty("title")
	@GraphQLScalar(fieldName = "title", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String title;

	/**
	 * The person's first name(s).
	 */
	@JsonProperty("firstName")
	@GraphQLScalar(fieldName = "firstName", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String firstName;

	/**
	 * The person's nickname.
	 */
	@JsonProperty("nickname")
	@GraphQLScalar(fieldName = "nickname", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String nickname;

	/**
	 * The prefix to the person's last name.
	 */
	@JsonProperty("prefix")
	@GraphQLScalar(fieldName = "prefix", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String prefix;

	/**
	 * The person's last name.
	 */
	@JsonProperty("lastName")
	@GraphQLScalar(fieldName = "lastName", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String lastName;

	/**
	 * The suffix to the person's name.
	 */
	@JsonProperty("suffix")
	@GraphQLScalar(fieldName = "suffix", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String suffix;

	/**
	 * Last name alias.
	 */
	@JsonProperty("alias")
	@GraphQLScalar(fieldName = "alias", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String alias;

	/**
	 * Brief biography, notes, etc.
	 */
	@JsonProperty("notes")
	@GraphQLScalar(fieldName = "notes", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String notes;

	/**
	 * Academic qualifications.
	 */
	@JsonProperty("qualifications")
	@GraphQLScalar(fieldName = "qualifications", graphQLTypeSimpleName = "String", javaClass = String.class,
		listDepth = 0)
	String qualifications;

	/**
	 * The primary country associated with the person.
	 */
	@JsonProperty("country")
	@GraphQLInputParameters(names = { "format" }, types = { "CountryFormatKind" }, mandatories = { false },
		listDepths = { 0 }, itemsMandatory = { false })
	@GraphQLScalar(fieldName = "country", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String country;

	/**
	 * A five-star rating for the person, intended to reflect credibility, experience, qualifications, etc.
	 */
	@JsonProperty("rating")
	@GraphQLScalar(fieldName = "rating", graphQLTypeSimpleName = "Int", javaClass = Integer.class, listDepth = 0)
	Integer rating;

	/**
	 * Whether the person's credentials have been checked.
	 */
	@JsonProperty("checked")
	@GraphQLScalar(fieldName = "checked", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class, listDepth = 0)
	Boolean checked;

	/**
	 * Whether the person has authored any peer-reviewed publications.
	 */
	@JsonProperty("published")
	@GraphQLScalar(fieldName = "published", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class, listDepth = 0)
	Boolean published;

	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String __typename;

	/**
	 * The unique person identifier.
	 */
	@Override
	@JsonIgnore
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * The unique person identifier.
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
	 * The topic(s) associated with the person.
	 */
	@Override
	@JsonIgnore
	public void setTopicRefs(TopicRefPage topicRefs) {
		this.topicRefs = topicRefs;
	}

	/**
	 * The topic(s) associated with the person.
	 */
	@Override
	@JsonIgnore
	public TopicRefPage getTopicRefs() {
		return this.topicRefs;
	}

	/**
	 * The person's title(s).
	 */
	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * The person's title(s).
	 */
	@JsonProperty("title")
	public String getTitle() {
		return this.title;
	}

	/**
	 * The person's first name(s).
	 */
	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * The person's first name(s).
	 */
	@JsonProperty("firstName")
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * The person's nickname.
	 */
	@JsonProperty("nickname")
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * The person's nickname.
	 */
	@JsonProperty("nickname")
	public String getNickname() {
		return this.nickname;
	}

	/**
	 * The prefix to the person's last name.
	 */
	@JsonProperty("prefix")
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	/**
	 * The prefix to the person's last name.
	 */
	@JsonProperty("prefix")
	public String getPrefix() {
		return this.prefix;
	}

	/**
	 * The person's last name.
	 */
	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * The person's last name.
	 */
	@JsonProperty("lastName")
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * The suffix to the person's name.
	 */
	@JsonProperty("suffix")
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * The suffix to the person's name.
	 */
	@JsonProperty("suffix")
	public String getSuffix() {
		return this.suffix;
	}

	/**
	 * Last name alias.
	 */
	@JsonProperty("alias")
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Last name alias.
	 */
	@JsonProperty("alias")
	public String getAlias() {
		return this.alias;
	}

	/**
	 * Brief biography, notes, etc.
	 */
	@JsonProperty("notes")
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * Brief biography, notes, etc.
	 */
	@JsonProperty("notes")
	public String getNotes() {
		return this.notes;
	}

	/**
	 * Academic qualifications.
	 */
	@JsonProperty("qualifications")
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	/**
	 * Academic qualifications.
	 */
	@JsonProperty("qualifications")
	public String getQualifications() {
		return this.qualifications;
	}

	/**
	 * The primary country associated with the person.
	 */
	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * The primary country associated with the person.
	 */
	@JsonProperty("country")
	public String getCountry() {
		return this.country;
	}

	/**
	 * A five-star rating for the person, intended to reflect credibility, experience, qualifications, etc.
	 */
	@JsonProperty("rating")
	public void setRating(Integer rating) {
		this.rating = rating;
	}

	/**
	 * A five-star rating for the person, intended to reflect credibility, experience, qualifications, etc.
	 */
	@JsonProperty("rating")
	public Integer getRating() {
		return this.rating;
	}

	/**
	 * Whether the person's credentials have been checked.
	 */
	@JsonProperty("checked")
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	/**
	 * Whether the person's credentials have been checked.
	 */
	@JsonProperty("checked")
	public Boolean getChecked() {
		return this.checked;
	}

	/**
	 * Whether the person has authored any peer-reviewed publications.
	 */
	@JsonProperty("published")
	public void setPublished(Boolean published) {
		this.published = published;
	}

	/**
	 * Whether the person has authored any peer-reviewed publications.
	 */
	@JsonProperty("published")
	public Boolean getPublished() {
		return this.published;
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
		return "Person {" //$NON-NLS-1$
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
			+ "topicRefs: " + this.topicRefs //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "title: " + this.title //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "firstName: " + this.firstName //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "nickname: " + this.nickname //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "prefix: " + this.prefix //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "lastName: " + this.lastName //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "suffix: " + this.suffix //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "alias: " + this.alias //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "notes: " + this.notes //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "qualifications: " + this.qualifications //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "country: " + this.country //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "rating: " + this.rating //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "checked: " + this.checked //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "published: " + this.published //$NON-NLS-1$
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
		private TopicRefPage topicRefs;
		private String title;
		private String firstName;
		private String nickname;
		private String prefix;
		private String lastName;
		private String suffix;
		private String alias;
		private String notes;
		private String qualifications;
		private String country;
		private Integer rating;
		private Boolean checked;
		private Boolean published;

		/**
		 * The unique person identifier.
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
		 * The topic(s) associated with the person.
		 */
		public Builder withTopicRefs(TopicRefPage topicRefsParam) {
			this.topicRefs = topicRefsParam;
			return this;
		}

		/**
		 * The person's title(s).
		 */
		public Builder withTitle(String titleParam) {
			this.title = titleParam;
			return this;
		}

		/**
		 * The person's first name(s).
		 */
		public Builder withFirstName(String firstNameParam) {
			this.firstName = firstNameParam;
			return this;
		}

		/**
		 * The person's nickname.
		 */
		public Builder withNickname(String nicknameParam) {
			this.nickname = nicknameParam;
			return this;
		}

		/**
		 * The prefix to the person's last name.
		 */
		public Builder withPrefix(String prefixParam) {
			this.prefix = prefixParam;
			return this;
		}

		/**
		 * The person's last name.
		 */
		public Builder withLastName(String lastNameParam) {
			this.lastName = lastNameParam;
			return this;
		}

		/**
		 * The suffix to the person's name.
		 */
		public Builder withSuffix(String suffixParam) {
			this.suffix = suffixParam;
			return this;
		}

		/**
		 * Last name alias.
		 */
		public Builder withAlias(String aliasParam) {
			this.alias = aliasParam;
			return this;
		}

		/**
		 * Brief biography, notes, etc.
		 */
		public Builder withNotes(String notesParam) {
			this.notes = notesParam;
			return this;
		}

		/**
		 * Academic qualifications.
		 */
		public Builder withQualifications(String qualificationsParam) {
			this.qualifications = qualificationsParam;
			return this;
		}

		/**
		 * The primary country associated with the person.
		 */
		public Builder withCountry(String countryParam) {
			this.country = countryParam;
			return this;
		}

		/**
		 * A five-star rating for the person, intended to reflect credibility, experience, qualifications, etc.
		 */
		public Builder withRating(Integer ratingParam) {
			this.rating = ratingParam;
			return this;
		}

		/**
		 * Whether the person's credentials have been checked.
		 */
		public Builder withChecked(Boolean checkedParam) {
			this.checked = checkedParam;
			return this;
		}

		/**
		 * Whether the person has authored any peer-reviewed publications.
		 */
		public Builder withPublished(Boolean publishedParam) {
			this.published = publishedParam;
			return this;
		}

		public Person build() {
			Person _object = new Person();
			_object.setId(this.id);
			_object.setStatus(this.status);
			_object.setCreated(this.created);
			_object.setCreatedByUser(this.createdByUser);
			_object.setUpdated(this.updated);
			_object.setUpdatedByUser(this.updatedByUser);
			_object.setLog(this.log);
			_object.setTopicRefs(this.topicRefs);
			_object.setTitle(this.title);
			_object.setFirstName(this.firstName);
			_object.setNickname(this.nickname);
			_object.setPrefix(this.prefix);
			_object.setLastName(this.lastName);
			_object.setSuffix(this.suffix);
			_object.setAlias(this.alias);
			_object.setNotes(this.notes);
			_object.setQualifications(this.qualifications);
			_object.setCountry(this.country);
			_object.setRating(this.rating);
			_object.setChecked(this.checked);
			_object.setPublished(this.published);
			_object.set__typename("Person"); //$NON-NLS-1$
			return _object;
		}

	}

}