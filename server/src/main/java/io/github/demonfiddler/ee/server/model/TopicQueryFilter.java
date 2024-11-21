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

import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * Parameters to filter a topic query.
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("TopicQueryFilter")
public class TopicQueryFilter extends TrackedEntityQueryFilter {

	/**
	 * The parent topic identifier. Specify to get sub-topics, leave blank for top-level topics.
	 */
	@GraphQLScalar(fieldName = "parentId", graphQLTypeSimpleName = "Long", javaClass = Long.class, listDepth = 0)
	Long parentId;

	/**
	 * Whether to return all sub-topics, recursively.
	 */
	@GraphQLScalar(fieldName = "recursive", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class, listDepth = 0)
	Boolean recursive = false;

	/**
	 * The parent topic identifier. Specify to get sub-topics, leave blank for top-level topics.
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	/**
	 * The parent topic identifier. Specify to get sub-topics, leave blank for top-level topics.
	 */
	public Long getParentId() {
		return this.parentId;
	}

	/**
	 * Free text search string.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Whether to return all sub-topics, recursively.
	 */
	public void setRecursive(Boolean recursive) {
		this.recursive = recursive;
	}

	/**
	 * Whether to return all sub-topics, recursively.
	 */
	public Boolean getRecursive() {
		return this.recursive;
	}

	public String toString() {
		return "TopicQueryFilter {" //$NON-NLS-1$
			+ "parentId: " + this.parentId //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "text: " + this.text //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "advancedSearch: " + this.advancedSearch //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "status: " + this.status //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "recursive: " + this.recursive //$NON-NLS-1$
			+ "}"; //$NON-NLS-1$
	}

	public static Builder builder() {
		return new Builder();
	}

	/**
	 * The Builder that helps building instance of this POJO. You can get an instance of this class, by calling the
	 * {@link #builder()}
	 */
	public static class Builder extends TrackedEntityQueryFilter.Builder {

		private Long parentId;
		private Boolean recursive = false;

		/**
		 * The parent topic identifier. Specify to get sub-topics, leave blank for top-level topics.
		 */
		public Builder withParentId(Long parentIdParam) {
			this.parentId = parentIdParam;
			return this;
		}

		/**
		 * Whether to return all sub-topics, recursively.
		 */
		public Builder withRecursive(Boolean recursiveParam) {
			this.recursive = recursiveParam;
			return this;
		}

		public TopicQueryFilter build() {
			TopicQueryFilter _object = new TopicQueryFilter();
			_object.setParentId(this.parentId);
			_object.setText(this.text);
			_object.setAdvancedSearch(this.advancedSearch);
			_object.setStatus(this.status);
			_object.setRecursive(this.recursive);
			return _object;
		}

	}

}