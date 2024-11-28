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

import java.net.URI;
import java.util.List;

import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * An input for creating or updating an association between a topic and an entity record.
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("TopicRefInput")
public class TopicRefInput {

	/**
	 * The unique topic identifier. Only necessary because graphql-java-generator emits code with errors (missing ctor)
	 * if there is no ID field.
	 */
	@GraphQLScalar(fieldName = "id", graphQLTypeSimpleName = "ID", javaClass = Long.class, listDepth = 0)
	Long id;

	/**
	 * The unique identifier of the associated topic.
	 */
	@GraphQLScalar(fieldName = "topicId", graphQLTypeSimpleName = "Long", javaClass = Long.class, listDepth = 0)
	Long topicId;

	/**
	 * The associated entity kind.
	 */
	@GraphQLScalar(fieldName = "entityKind", graphQLTypeSimpleName = "EntityKind", javaClass = EntityKind.class,
		listDepth = 0)
	EntityKind entityKind;

	/**
	 * The unique identifier of the associated entity.
	 */
	@GraphQLScalar(fieldName = "entityId", graphQLTypeSimpleName = "Long", javaClass = Long.class, listDepth = 0)
	Long entityId;

	/**
	 * The locations within the associated record, one per line.
	 */
	@GraphQLScalar(fieldName = "locations", graphQLTypeSimpleName = "URI", javaClass = URI.class, listDepth = 1)
	List<URI> locations;

	/**
	 * The unique topic identifier. Only necessary because graphql-java-generator emits code with errors (missing ctor)
	 * if there is no ID field.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * The unique topic identifier. Only necessary because graphql-java-generator emits code with errors (missing ctor)
	 * if there is no ID field.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * The unique identifier of the associated topic.
	 */
	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}

	/**
	 * The unique identifier of the associated topic.
	 */
	public Long getTopicId() {
		return this.topicId;
	}

	/**
	 * The associated entity kind.
	 */
	public void setEntityKind(EntityKind entityKind) {
		this.entityKind = entityKind;
	}

	/**
	 * The associated entity kind.
	 */
	public EntityKind getEntityKind() {
		return this.entityKind;
	}

	/**
	 * The unique identifier of the associated entity.
	 */
	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	/**
	 * The unique identifier of the associated entity.
	 */
	public Long getEntityId() {
		return this.entityId;
	}

	/**
	 * The locations within the associated record, one per line.
	 */
	public void setLocations(List<URI> locations) {
		this.locations = locations;
	}

	/**
	 * The locations within the associated record, one per line.
	 */
	public List<URI> getLocations() {
		return this.locations;
	}

	public String toString() {
		return "TopicRefInput {" //$NON-NLS-1$
			+ "id: " + this.id //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "topicId: " + this.topicId //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "entityKind: " + this.entityKind //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "entityId: " + this.entityId //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "locations: " + this.locations //$NON-NLS-1$
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
		private Long topicId;
		private EntityKind entityKind;
		private Long entityId;
		private List<URI> locations;

		/**
		 * The unique topic identifier. Only necessary because graphql-java-generator emits code with errors (missing
		 * ctor) if there is no ID field.
		 */
		public Builder withId(Long idParam) {
			this.id = idParam;
			return this;
		}

		/**
		 * The unique identifier of the associated topic.
		 */
		public Builder withTopicId(Long topicIdParam) {
			this.topicId = topicIdParam;
			return this;
		}

		/**
		 * The associated entity kind.
		 */
		public Builder withEntityKind(EntityKind entityKindParam) {
			this.entityKind = entityKindParam;
			return this;
		}

		/**
		 * The unique identifier of the associated entity.
		 */
		public Builder withEntityId(Long entityIdParam) {
			this.entityId = entityIdParam;
			return this;
		}

		/**
		 * The locations within the associated record, one per line.
		 */
		public Builder withLocations(List<URI> locationsParam) {
			this.locations = locationsParam;
			return this;
		}

		public TopicRefInput build() {
			TopicRefInput _object = new TopicRefInput();
			_object.setId(this.id);
			_object.setTopicId(this.topicId);
			_object.setEntityKind(this.entityKind);
			_object.setEntityId(this.entityId);
			_object.setLocations(this.locations);
			return _object;
		}

	}

}
