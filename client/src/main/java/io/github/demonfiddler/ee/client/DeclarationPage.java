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
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import com.graphql_java_generator.client.GraphQLObjectMapper;

import io.github.demonfiddler.ee.client.util.CustomJacksonDeserializers;

/**
 * Returns paginated declaration query results.
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("DeclarationPage")
@JsonInclude(Include.NON_NULL)
public class DeclarationPage {

	/**
	 * This map contains the deserialized values for the alias, as parsed from the JSON response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public DeclarationPage() {
	}

	/**
	 * Dummy ID required for @Entity classes
	 */
	@JsonProperty("dummy")
	@GraphQLScalar(fieldName = "dummy", graphQLTypeSimpleName = "ID", javaClass = Long.class, listDepth = 0)
	Long dummy;

	/**
	 * The requested pageful of records.
	 */
	@JsonProperty("content")
	@JsonDeserialize(using = CustomJacksonDeserializers.ListDeclaration.class)
	@GraphQLNonScalar(fieldName = "content", graphQLTypeSimpleName = "Declaration", javaClass = Declaration.class,
		listDepth = 1)
	List<Declaration> content;

	/**
	 * Whether the page has content.
	 */
	@JsonProperty("hasContent")
	@GraphQLScalar(fieldName = "hasContent", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class,
		listDepth = 0)
	Boolean hasContent;

	/**
	 * Whether the page is empty (no content).
	 */
	@JsonProperty("isEmpty")
	@GraphQLScalar(fieldName = "isEmpty", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class, listDepth = 0)
	Boolean isEmpty;

	/**
	 * The current page number.
	 */
	@JsonProperty("number")
	@GraphQLScalar(fieldName = "number", graphQLTypeSimpleName = "Int", javaClass = Integer.class, listDepth = 0)
	Integer number;

	/**
	 * The page size.
	 */
	@JsonProperty("size")
	@GraphQLScalar(fieldName = "size", graphQLTypeSimpleName = "Int", javaClass = Integer.class, listDepth = 0)
	Integer size;

	/**
	 * The number of elements on this page.
	 */
	@JsonProperty("numberOfElements")
	@GraphQLScalar(fieldName = "numberOfElements", graphQLTypeSimpleName = "Int", javaClass = Integer.class,
		listDepth = 0)
	Integer numberOfElements;

	/**
	 * The total number of pages available.
	 */
	@JsonProperty("totalPages")
	@GraphQLScalar(fieldName = "totalPages", graphQLTypeSimpleName = "Int", javaClass = Integer.class, listDepth = 0)
	Integer totalPages;

	/**
	 * The total number of records.
	 */
	@JsonProperty("totalElements")
	@JsonDeserialize(using = CustomJacksonDeserializers.Long.class)
	@GraphQLScalar(fieldName = "totalElements", graphQLTypeSimpleName = "Long", javaClass = Long.class, listDepth = 0)
	Long totalElements;

	/**
	 * Whether this is the first page.
	 */
	@JsonProperty("isFirst")
	@GraphQLScalar(fieldName = "isFirst", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class, listDepth = 0)
	Boolean isFirst;

	/**
	 * Whether this is the last page.
	 */
	@JsonProperty("isLast")
	@GraphQLScalar(fieldName = "isLast", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class, listDepth = 0)
	Boolean isLast;

	/**
	 * Whether there is next page.
	 */
	@JsonProperty("hasNext")
	@GraphQLScalar(fieldName = "hasNext", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class, listDepth = 0)
	Boolean hasNext;

	/**
	 * Whether there is previous page.
	 */
	@JsonProperty("hasPrevious")
	@GraphQLScalar(fieldName = "hasPrevious", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class,
		listDepth = 0)
	Boolean hasPrevious;

	@JsonProperty("__typename")
	@GraphQLScalar(fieldName = "__typename", graphQLTypeSimpleName = "String", javaClass = String.class, listDepth = 0)
	String __typename;

	/**
	 * Dummy ID required for @Entity classes
	 */
	@JsonProperty("dummy")
	public void setDummy(Long dummy) {
		this.dummy = dummy;
	}

	/**
	 * Dummy ID required for @Entity classes
	 */
	@JsonProperty("dummy")
	public Long getDummy() {
		return this.dummy;
	}

	/**
	 * The requested pageful of records.
	 */
	@JsonProperty("content")
	public void setContent(List<Declaration> content) {
		this.content = content;
	}

	/**
	 * The requested pageful of records.
	 */
	@JsonProperty("content")
	public List<Declaration> getContent() {
		return this.content;
	}

	/**
	 * Whether the page has content.
	 */
	@JsonProperty("hasContent")
	public void setHasContent(Boolean hasContent) {
		this.hasContent = hasContent;
	}

	/**
	 * Whether the page has content.
	 */
	@JsonProperty("hasContent")
	public Boolean getHasContent() {
		return this.hasContent;
	}

	/**
	 * Whether the page is empty (no content).
	 */
	@JsonProperty("isEmpty")
	public void setIsEmpty(Boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	/**
	 * Whether the page is empty (no content).
	 */
	@JsonProperty("isEmpty")
	public Boolean getIsEmpty() {
		return this.isEmpty;
	}

	/**
	 * The current page number.
	 */
	@JsonProperty("number")
	public void setNumber(Integer number) {
		this.number = number;
	}

	/**
	 * The current page number.
	 */
	@JsonProperty("number")
	public Integer getNumber() {
		return this.number;
	}

	/**
	 * The page size.
	 */
	@JsonProperty("size")
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * The page size.
	 */
	@JsonProperty("size")
	public Integer getSize() {
		return this.size;
	}

	/**
	 * The number of elements on this page.
	 */
	@JsonProperty("numberOfElements")
	public void setNumberOfElements(Integer numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	/**
	 * The number of elements on this page.
	 */
	@JsonProperty("numberOfElements")
	public Integer getNumberOfElements() {
		return this.numberOfElements;
	}

	/**
	 * The total number of pages available.
	 */
	@JsonProperty("totalPages")
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	/**
	 * The total number of pages available.
	 */
	@JsonProperty("totalPages")
	public Integer getTotalPages() {
		return this.totalPages;
	}

	/**
	 * The total number of records.
	 */
	@JsonProperty("totalElements")
	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}

	/**
	 * The total number of records.
	 */
	@JsonProperty("totalElements")
	public Long getTotalElements() {
		return this.totalElements;
	}

	/**
	 * Whether this is the first page.
	 */
	@JsonProperty("isFirst")
	public void setIsFirst(Boolean isFirst) {
		this.isFirst = isFirst;
	}

	/**
	 * Whether this is the first page.
	 */
	@JsonProperty("isFirst")
	public Boolean getIsFirst() {
		return this.isFirst;
	}

	/**
	 * Whether this is the last page.
	 */
	@JsonProperty("isLast")
	public void setIsLast(Boolean isLast) {
		this.isLast = isLast;
	}

	/**
	 * Whether this is the last page.
	 */
	@JsonProperty("isLast")
	public Boolean getIsLast() {
		return this.isLast;
	}

	/**
	 * Whether there is next page.
	 */
	@JsonProperty("hasNext")
	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}

	/**
	 * Whether there is next page.
	 */
	@JsonProperty("hasNext")
	public Boolean getHasNext() {
		return this.hasNext;
	}

	/**
	 * Whether there is previous page.
	 */
	@JsonProperty("hasPrevious")
	public void setHasPrevious(Boolean hasPrevious) {
		this.hasPrevious = hasPrevious;
	}

	/**
	 * Whether there is previous page.
	 */
	@JsonProperty("hasPrevious")
	public Boolean getHasPrevious() {
		return this.hasPrevious;
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
		return "DeclarationPage {" //$NON-NLS-1$
			+ "dummy: " + this.dummy //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "content: " + this.content //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "hasContent: " + this.hasContent //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "isEmpty: " + this.isEmpty //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "number: " + this.number //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "size: " + this.size //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "numberOfElements: " + this.numberOfElements //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "totalPages: " + this.totalPages //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "totalElements: " + this.totalElements //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "isFirst: " + this.isFirst //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "isLast: " + this.isLast //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "hasNext: " + this.hasNext //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "hasPrevious: " + this.hasPrevious //$NON-NLS-1$
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

		private Long dummy;
		private List<Declaration> content;
		private Boolean hasContent;
		private Boolean isEmpty;
		private Integer number;
		private Integer size;
		private Integer numberOfElements;
		private Integer totalPages;
		private Long totalElements;
		private Boolean isFirst;
		private Boolean isLast;
		private Boolean hasNext;
		private Boolean hasPrevious;

		/**
		 * Dummy ID required for @Entity classes
		 */
		public Builder withDummy(Long dummyParam) {
			this.dummy = dummyParam;
			return this;
		}

		/**
		 * The requested pageful of records.
		 */
		public Builder withContent(List<Declaration> contentParam) {
			this.content = contentParam;
			return this;
		}

		/**
		 * Whether the page has content.
		 */
		public Builder withHasContent(Boolean hasContentParam) {
			this.hasContent = hasContentParam;
			return this;
		}

		/**
		 * Whether the page is empty (no content).
		 */
		public Builder withIsEmpty(Boolean isEmptyParam) {
			this.isEmpty = isEmptyParam;
			return this;
		}

		/**
		 * The current page number.
		 */
		public Builder withNumber(Integer numberParam) {
			this.number = numberParam;
			return this;
		}

		/**
		 * The page size.
		 */
		public Builder withSize(Integer sizeParam) {
			this.size = sizeParam;
			return this;
		}

		/**
		 * The number of elements on this page.
		 */
		public Builder withNumberOfElements(Integer numberOfElementsParam) {
			this.numberOfElements = numberOfElementsParam;
			return this;
		}

		/**
		 * The total number of pages available.
		 */
		public Builder withTotalPages(Integer totalPagesParam) {
			this.totalPages = totalPagesParam;
			return this;
		}

		/**
		 * The total number of records.
		 */
		public Builder withTotalElements(Long totalElementsParam) {
			this.totalElements = totalElementsParam;
			return this;
		}

		/**
		 * Whether this is the first page.
		 */
		public Builder withIsFirst(Boolean isFirstParam) {
			this.isFirst = isFirstParam;
			return this;
		}

		/**
		 * Whether this is the last page.
		 */
		public Builder withIsLast(Boolean isLastParam) {
			this.isLast = isLastParam;
			return this;
		}

		/**
		 * Whether there is next page.
		 */
		public Builder withHasNext(Boolean hasNextParam) {
			this.hasNext = hasNextParam;
			return this;
		}

		/**
		 * Whether there is previous page.
		 */
		public Builder withHasPrevious(Boolean hasPreviousParam) {
			this.hasPrevious = hasPreviousParam;
			return this;
		}

		public DeclarationPage build() {
			DeclarationPage _object = new DeclarationPage();
			_object.setDummy(this.dummy);
			_object.setContent(this.content);
			_object.setHasContent(this.hasContent);
			_object.setIsEmpty(this.isEmpty);
			_object.setNumber(this.number);
			_object.setSize(this.size);
			_object.setNumberOfElements(this.numberOfElements);
			_object.setTotalPages(this.totalPages);
			_object.setTotalElements(this.totalElements);
			_object.setIsFirst(this.isFirst);
			_object.setIsLast(this.isLast);
			_object.setHasNext(this.hasNext);
			_object.setHasPrevious(this.hasPrevious);
			_object.set__typename("DeclarationPage"); //$NON-NLS-1$
			return _object;
		}

	}

}