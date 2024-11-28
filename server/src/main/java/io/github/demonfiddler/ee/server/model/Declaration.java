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
import java.time.LocalDate;
import java.time.OffsetDateTime;

import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

/**
 * A public declaration or open letter made in respect of given topic(s).
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@Entity
@GraphQLObjectType("Declaration")
public class Declaration implements IBaseEntity, ITrackedEntity, ITopicalEntity {

	public Declaration() {
	}

	/**
	 * The unique declaration identifier.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GraphQLScalar(fieldName = "id", graphQLTypeSimpleName = "ID", javaClass = Long.class, listDepth = 0)
	Long id;

	/**
	 * The entity status.
	 */
	@GraphQLScalar(fieldName = "status", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String status;

	/**
	 * When the record was created.
	 */
	@GraphQLScalar(fieldName = "created", graphQLTypeSimpleName = "DateTime", javaClass = OffsetDateTime.class,
		listDepth = 0)
	OffsetDateTime created;

	/**
	 * The user who created the record.
	 */
	@GraphQLNonScalar(fieldName = "createdByUser", graphQLTypeSimpleName = "User", javaClass = User.class,
		listDepth = 0)
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "created_by_user_id", nullable = false)
	User createdByUser;

	/**
	 * When the record was last updated.
	 */
	@GraphQLScalar(fieldName = "updated", graphQLTypeSimpleName = "DateTime", javaClass = OffsetDateTime.class,
		listDepth = 0)
	OffsetDateTime updated;

	/**
	 * The user who last updated the record.
	 */
	@GraphQLNonScalar(fieldName = "updatedByUser", graphQLTypeSimpleName = "User", javaClass = User.class,
		listDepth = 0)
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "updated_by_user_id", nullable = true)
	User updatedByUser;

	/**
	 * Log of transactions involving the record.
	 */
	@Transient
	@GraphQLNonScalar(fieldName = "log", graphQLTypeSimpleName = "LogPage", javaClass = LogPage.class, listDepth = 0)
	LogPage log;

	/**
	 * The topic(s) associated with the declaration.
	 */
	@Transient
	@GraphQLNonScalar(fieldName = "topicRefs", graphQLTypeSimpleName = "TopicRefPage", javaClass = TopicRefPage.class,
		listDepth = 0)
	TopicRefPage topicRefs;

	/**
	 * The kind of declaration.
	 */
	@GraphQLScalar(fieldName = "kind", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String kind;

	/**
	 * The declaration name or title.
	 */
	@GraphQLScalar(fieldName = "title", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String title;

	/**
	 * The date the declaration was published.
	 */
	@GraphQLScalar(fieldName = "date", graphQLTypeSimpleName = "Date", javaClass = LocalDate.class, listDepth = 0)
	LocalDate date;

	/**
	 * The country to which the declaration relates.
	 */
	@GraphQLScalar(fieldName = "country", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	@Column(name = "country_code")
	String country;

	/**
	 * The URL for the declaration online.
	 */
	@GraphQLScalar(fieldName = "url", graphQLTypeSimpleName = "URL", javaClass = URL.class, listDepth = 0)
	URL url;

	/**
	 * Flag to indicate that url content is cached on this application server.
	 */
	@GraphQLScalar(fieldName = "cached", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class, listDepth = 0)
	Boolean cached;

	/**
	 * Names of persons who signed the declaration, one per line.
	 */
	@GraphQLScalar(fieldName = "signatories", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String signatories;

	/**
	 * The number of signatories.
	 */
	@GraphQLScalar(fieldName = "signatoryCount", graphQLTypeSimpleName = "Int", javaClass = Integer.class,
		listDepth = 0)
	Integer signatoryCount;

	/**
	 * Added notes about the declaration.
	 */
	@GraphQLScalar(fieldName = "notes", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String notes;

	/**
	 * The unique declaration identifier.
	 */
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * The unique declaration identifier.
	 */
	@Override
	public Long getId() {
		return this.id;
	}

	/**
	 * The entity status.
	 */
	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * The entity status.
	 */
	@Override
	public String getStatus() {
		return this.status;
	}

	/**
	 * When the record was created.
	 */
	@Override
	public void setCreated(OffsetDateTime created) {
		this.created = created;
	}

	/**
	 * When the record was created.
	 */
	@Override
	public OffsetDateTime getCreated() {
		return this.created;
	}

	/**
	 * The user who created the record.
	 */
	@Override
	public void setCreatedByUser(User createdByUser) {
		this.createdByUser = createdByUser;
	}

	/**
	 * The user who created the record.
	 */
	@Override
	public User getCreatedByUser() {
		return this.createdByUser;
	}

	/**
	 * When the record was last updated.
	 */
	@Override
	public void setUpdated(OffsetDateTime updated) {
		this.updated = updated;
	}

	/**
	 * When the record was last updated.
	 */
	@Override
	public OffsetDateTime getUpdated() {
		return this.updated;
	}

	/**
	 * The user who last updated the record.
	 */
	@Override
	public void setUpdatedByUser(User updatedByUser) {
		this.updatedByUser = updatedByUser;
	}

	/**
	 * The user who last updated the record.
	 */
	@Override
	public User getUpdatedByUser() {
		return this.updatedByUser;
	}

	/**
	 * Log of transactions involving the record.
	 */
	@Override
	public void setLog(LogPage log) {
		this.log = log;
	}

	/**
	 * Log of transactions involving the record.
	 */
	@Override
	public LogPage getLog() {
		return this.log;
	}

	/**
	 * The topic(s) associated with the declaration.
	 */
	@Override
	public void setTopicRefs(TopicRefPage topicRefs) {
		this.topicRefs = topicRefs;
	}

	/**
	 * The topic(s) associated with the declaration.
	 */
	@Override
	public TopicRefPage getTopicRefs() {
		return this.topicRefs;
	}

	/**
	 * The kind of declaration.
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * The kind of declaration.
	 */
	public String getKind() {
		return this.kind;
	}

	/**
	 * The declaration name or title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * The declaration name or title.
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * The date the declaration was published.
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * The date the declaration was published.
	 */
	public LocalDate getDate() {
		return this.date;
	}

	/**
	 * The country to which the declaration relates.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * The country to which the declaration relates.
	 */
	public String getCountry() {
		return this.country;
	}

	/**
	 * The URL for the declaration online.
	 */
	public void setUrl(URL url) {
		this.url = url;
	}

	/**
	 * The URL for the declaration online.
	 */
	public URL getUrl() {
		return this.url;
	}

	/**
	 * Flag to indicate that url content is cached on this application server.
	 */
	public void setCached(Boolean cached) {
		this.cached = cached;
	}

	/**
	 * Flag to indicate that url content is cached on this application server.
	 */
	public Boolean getCached() {
		return this.cached;
	}

	/**
	 * Names of persons who signed the declaration, one per line.
	 */
	public void setSignatories(String signatories) {
		this.signatories = signatories;
	}

	/**
	 * Names of persons who signed the declaration, one per line.
	 */
	public String getSignatories() {
		return this.signatories;
	}

	/**
	 * The number of signatories.
	 */
	public void setSignatoryCount(Integer signatoryCount) {
		this.signatoryCount = signatoryCount;
	}

	/**
	 * The number of signatories.
	 */
	public Integer getSignatoryCount() {
		return this.signatoryCount;
	}

	/**
	 * Added notes about the declaration.
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * Added notes about the declaration.
	 */
	public String getNotes() {
		return this.notes;
	}

	public String toString() {
		return "Declaration {" //$NON-NLS-1$
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
			+ "kind: " + this.kind //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "title: " + this.title //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "date: " + this.date //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "country: " + this.country //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "url: " + this.url //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "cached: " + this.cached //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "signatories: " + this.signatories //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "signatoryCount: " + this.signatoryCount //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "notes: " + this.notes //$NON-NLS-1$
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
		private String kind;
		private String title;
		private LocalDate date;
		private String country;
		private URL url;
		private Boolean cached;
		private String signatories;
		private Integer signatoryCount;
		private String notes;

		/**
		 * The unique declaration identifier.
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
		 * The topic(s) associated with the declaration.
		 */
		public Builder withTopicRefs(TopicRefPage topicRefsParam) {
			this.topicRefs = topicRefsParam;
			return this;
		}

		/**
		 * The kind of declaration.
		 */
		public Builder withKind(String kindParam) {
			this.kind = kindParam;
			return this;
		}

		/**
		 * The declaration name or title.
		 */
		public Builder withTitle(String titleParam) {
			this.title = titleParam;
			return this;
		}

		/**
		 * The date the declaration was published.
		 */
		public Builder withDate(java.time.LocalDate dateParam) {
			this.date = dateParam;
			return this;
		}

		/**
		 * The country to which the declaration relates.
		 */
		public Builder withCountry(String countryParam) {
			this.country = countryParam;
			return this;
		}

		/**
		 * The URL for the declaration online.
		 */
		public Builder withUrl(URL urlParam) {
			this.url = urlParam;
			return this;
		}

		/**
		 * Flag to indicate that url content is cached on this application server.
		 */
		public Builder withCached(Boolean cachedParam) {
			this.cached = cachedParam;
			return this;
		}

		/**
		 * Names of persons who signed the declaration, one per line.
		 */
		public Builder withSignatories(String signatoriesParam) {
			this.signatories = signatoriesParam;
			return this;
		}

		/**
		 * The number of signatories.
		 */
		public Builder withSignatoryCount(Integer signatoryCountParam) {
			this.signatoryCount = signatoryCountParam;
			return this;
		}

		/**
		 * Added notes about the declaration.
		 */
		public Builder withNotes(String notesParam) {
			this.notes = notesParam;
			return this;
		}

		public Declaration build() {
			Declaration _object = new Declaration();
			_object.setId(this.id);
			_object.setStatus(this.status);
			_object.setCreated(this.created);
			_object.setCreatedByUser(this.createdByUser);
			_object.setUpdated(this.updated);
			_object.setUpdatedByUser(this.updatedByUser);
			_object.setLog(this.log);
			_object.setTopicRefs(this.topicRefs);
			_object.setKind(this.kind);
			_object.setTitle(this.title);
			_object.setDate(this.date);
			_object.setCountry(this.country);
			_object.setUrl(this.url);
			_object.setCached(this.cached);
			_object.setSignatories(this.signatories);
			_object.setSignatoryCount(this.signatoryCount);
			_object.setNotes(this.notes);
			return _object;
		}
	}

}
