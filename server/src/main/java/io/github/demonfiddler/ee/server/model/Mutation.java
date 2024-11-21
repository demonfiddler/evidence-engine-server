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

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.dataloader.DataLoader;

import graphql.schema.DataFetchingEnvironment;

import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

import com.graphql_java_generator.annotation.GraphQLDirective;

/**
 * Available mutations.
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("Mutation")
// @Transactional
@SuppressWarnings("unused")
public class Mutation {

	/**
	 * Creates a new claim.
	 */
	@GraphQLNonScalar(fieldName = "createClaim", graphQLTypeSimpleName = "Claim", javaClass = Claim.class,
		listDepth = 0)
	Claim createClaim;

	/**
	 * Updates an existing claim.
	 */
	@GraphQLNonScalar(fieldName = "updateClaim", graphQLTypeSimpleName = "Claim", javaClass = Claim.class,
		listDepth = 0)
	Claim updateClaim;

	/**
	 * Deletes an existing claim.
	 */
	@GraphQLScalar(fieldName = "deleteClaim", graphQLTypeSimpleName = "Void", javaClass = Void.class, listDepth = 0)
	Void deleteClaim;

	/**
	 * Creates a new declaration.
	 */
	@GraphQLNonScalar(fieldName = "createDeclaration", graphQLTypeSimpleName = "Declaration",
		javaClass = Declaration.class, listDepth = 0)
	Declaration createDeclaration;

	/**
	 * Updates an existing declaration.
	 */
	@GraphQLNonScalar(fieldName = "updateDeclaration", graphQLTypeSimpleName = "Declaration",
		javaClass = Declaration.class, listDepth = 0)
	Declaration updateDeclaration;

	/**
	 * Deletes an existing declaration.
	 */
	@GraphQLScalar(fieldName = "deleteDeclaration", graphQLTypeSimpleName = "Void", javaClass = Void.class,
		listDepth = 0)
	Void deleteDeclaration;

	/**
	 * Create a new journal.
	 */
	@GraphQLNonScalar(fieldName = "createJournal", graphQLTypeSimpleName = "Journal", javaClass = Journal.class,
		listDepth = 0)
	Journal createJournal;

	/**
	 * Updates an existing journal.
	 */
	@GraphQLNonScalar(fieldName = "updateJournal", graphQLTypeSimpleName = "Journal", javaClass = Journal.class,
		listDepth = 0)
	Journal updateJournal;

	/**
	 * Deletes an existing journal.
	 */
	@GraphQLScalar(fieldName = "deleteJournal", graphQLTypeSimpleName = "Void", javaClass = Void.class, listDepth = 0)
	Void deleteJournal;

	/**
	 * Creates a new person.
	 */
	@GraphQLNonScalar(fieldName = "createPerson", graphQLTypeSimpleName = "Person", javaClass = Person.class,
		listDepth = 0)
	Person createPerson;

	/**
	 * Updates an existing person.
	 */
	@GraphQLNonScalar(fieldName = "updatePerson", graphQLTypeSimpleName = "Person", javaClass = Person.class,
		listDepth = 0)
	Person updatePerson;

	/**
	 * Deletes an existing person.
	 */
	@GraphQLScalar(fieldName = "deletePerson", graphQLTypeSimpleName = "Void", javaClass = Void.class, listDepth = 0)
	Void deletePerson;

	/**
	 * Creates a new publication.
	 */
	@GraphQLNonScalar(fieldName = "createPublication", graphQLTypeSimpleName = "Publication",
		javaClass = Publication.class, listDepth = 0)
	Publication createPublication;

	/**
	 * Updates an existing publication.
	 */
	@GraphQLNonScalar(fieldName = "updatePublication", graphQLTypeSimpleName = "Publication",
		javaClass = Publication.class, listDepth = 0)
	Publication updatePublication;

	/**
	 * Deletes an existing publication.
	 */
	@GraphQLScalar(fieldName = "deletePublication", graphQLTypeSimpleName = "Void", javaClass = Void.class,
		listDepth = 0)
	Void deletePublication;

	/**
	 * Creates a new publisher.
	 */
	@GraphQLNonScalar(fieldName = "createPublisher", graphQLTypeSimpleName = "Publisher", javaClass = Publisher.class,
		listDepth = 0)
	Publisher createPublisher;

	/**
	 * Updates an existing publisher.
	 */
	@GraphQLNonScalar(fieldName = "updatePublisher", graphQLTypeSimpleName = "Publisher", javaClass = Publisher.class,
		listDepth = 0)
	Publisher updatePublisher;

	/**
	 * Deletes an existing publisher.
	 */
	@GraphQLScalar(fieldName = "deletePublisher", graphQLTypeSimpleName = "Void", javaClass = Void.class, listDepth = 0)
	Void deletePublisher;

	/**
	 * Creates a new quotation.
	 */
	@GraphQLNonScalar(fieldName = "createQuotation", graphQLTypeSimpleName = "Quotation", javaClass = Quotation.class,
		listDepth = 0)
	Quotation createQuotation;

	/**
	 * Updates an existing quotation.
	 */
	@GraphQLNonScalar(fieldName = "updateQuotation", graphQLTypeSimpleName = "Quotation", javaClass = Quotation.class,
		listDepth = 0)
	Quotation updateQuotation;

	/**
	 * Deletes an existing quotation.
	 */
	@GraphQLScalar(fieldName = "deleteQuotation", graphQLTypeSimpleName = "Void", javaClass = Void.class, listDepth = 0)
	Void deleteQuotation;

	/**
	 * Creates a new topic.
	 */
	@GraphQLNonScalar(fieldName = "createTopic", graphQLTypeSimpleName = "Topic", javaClass = Topic.class,
		listDepth = 0)
	Topic createTopic;

	/**
	 * Updates an existing topic.
	 */
	@GraphQLNonScalar(fieldName = "updateTopic", graphQLTypeSimpleName = "Topic", javaClass = Topic.class,
		listDepth = 0)
	Topic updateTopic;

	/**
	 * Deletes an existing topic.
	 */
	@GraphQLScalar(fieldName = "deleteTopic", graphQLTypeSimpleName = "Void", javaClass = Void.class, listDepth = 0)
	Void deleteTopic;

	/**
	 * Adds a new topic reference.
	 */
	@GraphQLScalar(fieldName = "addTopicRef", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class,
		listDepth = 0)
	Boolean addTopicRef;

	/**
	 * Removes a topic reference.
	 */
	@GraphQLScalar(fieldName = "removeTopicRef", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class,
		listDepth = 0)
	Boolean removeTopicRef;

	/**
	 * Links two entities.
	 */
	@GraphQLScalar(fieldName = "linkEntities", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class,
		listDepth = 0)
	Boolean linkEntities;

	/**
	 * Unlinks two linked entities.
	 */
	@GraphQLScalar(fieldName = "unlinkEntities", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class,
		listDepth = 0)
	Boolean unlinkEntities;

	/**
	 * Creates a new user.
	 */
	@GraphQLNonScalar(fieldName = "createUser", graphQLTypeSimpleName = "User", javaClass = User.class, listDepth = 0)
	User createUser;

	/**
	 * Updates an existing user.
	 */
	@GraphQLNonScalar(fieldName = "updateUser", graphQLTypeSimpleName = "User", javaClass = User.class, listDepth = 0)
	User updateUser;

	/**
	 * Updates an existing user.
	 */
	@GraphQLScalar(fieldName = "deleteUser", graphQLTypeSimpleName = "Void", javaClass = Void.class, listDepth = 0)
	Void deleteUser;

	/**
	 * Grants permissions to a user. The specified permissions are added to any existing ones.
	 */
	@GraphQLNonScalar(fieldName = "grantUserPermissions", graphQLTypeSimpleName = "User", javaClass = User.class,
		listDepth = 0)
	User grantUserPermissions;

	/**
	 * Revokes permissions from a user. The specified permissions are removed from the user; other permissions remain
	 * intact.
	 */
	@GraphQLNonScalar(fieldName = "revokeUserPermissions", graphQLTypeSimpleName = "User", javaClass = User.class,
		listDepth = 0)
	User revokeUserPermissions;

	/**
	 * Creates a new claim.
	 */
	public void setCreateClaim(Claim createClaim) {
		this.createClaim = createClaim;
	}

	/**
	 * Creates a new claim.
	 */
	public Claim getCreateClaim() {
		return this.createClaim;
	}

	/**
	 * Updates an existing claim.
	 */
	public void setUpdateClaim(Claim updateClaim) {
		this.updateClaim = updateClaim;
	}

	/**
	 * Updates an existing claim.
	 */
	public Claim getUpdateClaim() {
		return this.updateClaim;
	}

	/**
	 * Deletes an existing claim.
	 */
	public void setDeleteClaim(Void deleteClaim) {
		this.deleteClaim = deleteClaim;
	}

	/**
	 * Deletes an existing claim.
	 */
	public Void getDeleteClaim() {
		return this.deleteClaim;
	}

	/**
	 * Creates a new declaration.
	 */
	public void setCreateDeclaration(Declaration createDeclaration) {
		this.createDeclaration = createDeclaration;
	}

	/**
	 * Creates a new declaration.
	 */
	public Declaration getCreateDeclaration() {
		return this.createDeclaration;
	}

	/**
	 * Updates an existing declaration.
	 */
	public void setUpdateDeclaration(Declaration updateDeclaration) {
		this.updateDeclaration = updateDeclaration;
	}

	/**
	 * Updates an existing declaration.
	 */
	public Declaration getUpdateDeclaration() {
		return this.updateDeclaration;
	}

	/**
	 * Deletes an existing declaration.
	 */
	public void setDeleteDeclaration(Void deleteDeclaration) {
		this.deleteDeclaration = deleteDeclaration;
	}

	/**
	 * Deletes an existing declaration.
	 */
	public Void getDeleteDeclaration() {
		return this.deleteDeclaration;
	}

	/**
	 * Create a new journal.
	 */
	public void setCreateJournal(Journal createJournal) {
		this.createJournal = createJournal;
	}

	/**
	 * Create a new journal.
	 */
	public Journal getCreateJournal() {
		return this.createJournal;
	}

	/**
	 * Updates an existing journal.
	 */
	public void setUpdateJournal(Journal updateJournal) {
		this.updateJournal = updateJournal;
	}

	/**
	 * Updates an existing journal.
	 */
	public Journal getUpdateJournal() {
		return this.updateJournal;
	}

	/**
	 * Deletes an existing journal.
	 */
	public void setDeleteJournal(Void deleteJournal) {
		this.deleteJournal = deleteJournal;
	}

	/**
	 * Deletes an existing journal.
	 */
	public Void getDeleteJournal() {
		return this.deleteJournal;
	}

	/**
	 * Creates a new person.
	 */
	public void setCreatePerson(Person createPerson) {
		this.createPerson = createPerson;
	}

	/**
	 * Creates a new person.
	 */
	public Person getCreatePerson() {
		return this.createPerson;
	}

	/**
	 * Updates an existing person.
	 */
	public void setUpdatePerson(Person updatePerson) {
		this.updatePerson = updatePerson;
	}

	/**
	 * Updates an existing person.
	 */
	public Person getUpdatePerson() {
		return this.updatePerson;
	}

	/**
	 * Deletes an existing person.
	 */
	public void setDeletePerson(Void deletePerson) {
		this.deletePerson = deletePerson;
	}

	/**
	 * Deletes an existing person.
	 */
	public Void getDeletePerson() {
		return this.deletePerson;
	}

	/**
	 * Creates a new publication.
	 */
	public void setCreatePublication(Publication createPublication) {
		this.createPublication = createPublication;
	}

	/**
	 * Creates a new publication.
	 */
	public Publication getCreatePublication() {
		return this.createPublication;
	}

	/**
	 * Updates an existing publication.
	 */
	public void setUpdatePublication(Publication updatePublication) {
		this.updatePublication = updatePublication;
	}

	/**
	 * Updates an existing publication.
	 */
	public Publication getUpdatePublication() {
		return this.updatePublication;
	}

	/**
	 * Deletes an existing publication.
	 */
	public void setDeletePublication(Void deletePublication) {
		this.deletePublication = deletePublication;
	}

	/**
	 * Deletes an existing publication.
	 */
	public Void getDeletePublication() {
		return this.deletePublication;
	}

	/**
	 * Creates a new publisher.
	 */
	public void setCreatePublisher(Publisher createPublisher) {
		this.createPublisher = createPublisher;
	}

	/**
	 * Creates a new publisher.
	 */
	public Publisher getCreatePublisher() {
		return this.createPublisher;
	}

	/**
	 * Updates an existing publisher.
	 */
	public void setUpdatePublisher(Publisher updatePublisher) {
		this.updatePublisher = updatePublisher;
	}

	/**
	 * Updates an existing publisher.
	 */
	public Publisher getUpdatePublisher() {
		return this.updatePublisher;
	}

	/**
	 * Deletes an existing publisher.
	 */
	public void setDeletePublisher(Void deletePublisher) {
		this.deletePublisher = deletePublisher;
	}

	/**
	 * Deletes an existing publisher.
	 */
	public Void getDeletePublisher() {
		return this.deletePublisher;
	}

	/**
	 * Creates a new quotation.
	 */
	public void setCreateQuotation(Quotation createQuotation) {
		this.createQuotation = createQuotation;
	}

	/**
	 * Creates a new quotation.
	 */
	public Quotation getCreateQuotation() {
		return this.createQuotation;
	}

	/**
	 * Updates an existing quotation.
	 */
	public void setUpdateQuotation(Quotation updateQuotation) {
		this.updateQuotation = updateQuotation;
	}

	/**
	 * Updates an existing quotation.
	 */
	public Quotation getUpdateQuotation() {
		return this.updateQuotation;
	}

	/**
	 * Deletes an existing quotation.
	 */
	public void setDeleteQuotation(Void deleteQuotation) {
		this.deleteQuotation = deleteQuotation;
	}

	/**
	 * Deletes an existing quotation.
	 */
	public Void getDeleteQuotation() {
		return this.deleteQuotation;
	}

	/**
	 * Creates a new topic.
	 */
	public void setCreateTopic(Topic createTopic) {
		this.createTopic = createTopic;
	}

	/**
	 * Creates a new topic.
	 */
	public Topic getCreateTopic() {
		return this.createTopic;
	}

	/**
	 * Updates an existing topic.
	 */
	public void setUpdateTopic(Topic updateTopic) {
		this.updateTopic = updateTopic;
	}

	/**
	 * Updates an existing topic.
	 */
	public Topic getUpdateTopic() {
		return this.updateTopic;
	}

	/**
	 * Deletes an existing topic.
	 */
	public void setDeleteTopic(Void deleteTopic) {
		this.deleteTopic = deleteTopic;
	}

	/**
	 * Deletes an existing topic.
	 */
	public Void getDeleteTopic() {
		return this.deleteTopic;
	}

	/**
	 * Adds a new topic reference.
	 */
	public void setAddTopicRef(Boolean addTopicRef) {
		this.addTopicRef = addTopicRef;
	}

	/**
	 * Adds a new topic reference.
	 */
	public Boolean getAddTopicRef() {
		return this.addTopicRef;
	}

	/**
	 * Removes a topic reference.
	 */
	public void setRemoveTopicRef(Boolean removeTopicRef) {
		this.removeTopicRef = removeTopicRef;
	}

	/**
	 * Removes a topic reference.
	 */
	public Boolean getRemoveTopicRef() {
		return this.removeTopicRef;
	}

	/**
	 * Links two entities.
	 */
	public void setLinkEntities(Boolean linkEntities) {
		this.linkEntities = linkEntities;
	}

	/**
	 * Links two entities.
	 */
	public Boolean getLinkEntities() {
		return this.linkEntities;
	}

	/**
	 * Unlinks two linked entities.
	 */
	public void setUnlinkEntities(Boolean unlinkEntities) {
		this.unlinkEntities = unlinkEntities;
	}

	/**
	 * Unlinks two linked entities.
	 */
	public Boolean getUnlinkEntities() {
		return this.unlinkEntities;
	}

	/**
	 * Creates a new user.
	 */
	public void setCreateUser(User createUser) {
		this.createUser = createUser;
	}

	/**
	 * Creates a new user.
	 */
	public User getCreateUser() {
		return this.createUser;
	}

	/**
	 * Updates an existing user.
	 */
	public void setUpdateUser(User updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * Updates an existing user.
	 */
	public User getUpdateUser() {
		return this.updateUser;
	}

	/**
	 * Updates an existing user.
	 */
	public void setDeleteUser(Void deleteUser) {
		this.deleteUser = deleteUser;
	}

	/**
	 * Updates an existing user.
	 */
	public Void getDeleteUser() {
		return this.deleteUser;
	}

	/**
	 * Grants permissions to a user. The specified permissions are added to any existing ones.
	 */
	public void setGrantUserPermissions(User grantUserPermissions) {
		this.grantUserPermissions = grantUserPermissions;
	}

	/**
	 * Grants permissions to a user. The specified permissions are added to any existing ones.
	 */
	public User getGrantUserPermissions() {
		return this.grantUserPermissions;
	}

	/**
	 * Revokes permissions from a user. The specified permissions are removed from the user; other permissions remain
	 * intact.
	 */
	public void setRevokeUserPermissions(User revokeUserPermissions) {
		this.revokeUserPermissions = revokeUserPermissions;
	}

	/**
	 * Revokes permissions from a user. The specified permissions are removed from the user; other permissions remain
	 * intact.
	 */
	public User getRevokeUserPermissions() {
		return this.revokeUserPermissions;
	}

	public String toString() {
		return "Mutation {" //$NON-NLS-1$
			+ "createClaim: " + this.createClaim //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "updateClaim: " + this.updateClaim //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "deleteClaim: " + this.deleteClaim //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "createDeclaration: " + this.createDeclaration //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "updateDeclaration: " + this.updateDeclaration //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "deleteDeclaration: " + this.deleteDeclaration //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "createJournal: " + this.createJournal //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "updateJournal: " + this.updateJournal //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "deleteJournal: " + this.deleteJournal //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "createPerson: " + this.createPerson //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "updatePerson: " + this.updatePerson //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "deletePerson: " + this.deletePerson //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "createPublication: " + this.createPublication //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "updatePublication: " + this.updatePublication //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "deletePublication: " + this.deletePublication //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "createPublisher: " + this.createPublisher //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "updatePublisher: " + this.updatePublisher //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "deletePublisher: " + this.deletePublisher //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "createQuotation: " + this.createQuotation //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "updateQuotation: " + this.updateQuotation //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "deleteQuotation: " + this.deleteQuotation //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "createTopic: " + this.createTopic //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "updateTopic: " + this.updateTopic //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "deleteTopic: " + this.deleteTopic //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "addTopicRef: " + this.addTopicRef //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "removeTopicRef: " + this.removeTopicRef //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "linkEntities: " + this.linkEntities //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "unlinkEntities: " + this.unlinkEntities //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "createUser: " + this.createUser //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "updateUser: " + this.updateUser //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "deleteUser: " + this.deleteUser //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "grantUserPermissions: " + this.grantUserPermissions //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "revokeUserPermissions: " + this.revokeUserPermissions //$NON-NLS-1$
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
		private Claim createClaim;
		private Claim updateClaim;
		private Void deleteClaim;
		private Declaration createDeclaration;
		private Declaration updateDeclaration;
		private Void deleteDeclaration;
		private Journal createJournal;
		private Journal updateJournal;
		private Void deleteJournal;
		private Person createPerson;
		private Person updatePerson;
		private Void deletePerson;
		private Publication createPublication;
		private Publication updatePublication;
		private Void deletePublication;
		private Publisher createPublisher;
		private Publisher updatePublisher;
		private Void deletePublisher;
		private Quotation createQuotation;
		private Quotation updateQuotation;
		private Void deleteQuotation;
		private Topic createTopic;
		private Topic updateTopic;
		private Void deleteTopic;
		private Boolean addTopicRef;
		private Boolean removeTopicRef;
		private Boolean linkEntities;
		private Boolean unlinkEntities;
		private User createUser;
		private User updateUser;
		private Void deleteUser;
		private User grantUserPermissions;
		private User revokeUserPermissions;

		/**
		 * Creates a new claim.
		 */
		public Builder withCreateClaim(Claim createClaimParam) {
			this.createClaim = createClaimParam;
			return this;
		}

		/**
		 * Updates an existing claim.
		 */
		public Builder withUpdateClaim(Claim updateClaimParam) {
			this.updateClaim = updateClaimParam;
			return this;
		}

		/**
		 * Deletes an existing claim.
		 */
		public Builder withDeleteClaim(Void deleteClaimParam) {
			this.deleteClaim = deleteClaimParam;
			return this;
		}

		/**
		 * Creates a new declaration.
		 */
		public Builder withCreateDeclaration(Declaration createDeclarationParam) {
			this.createDeclaration = createDeclarationParam;
			return this;
		}

		/**
		 * Updates an existing declaration.
		 */
		public Builder withUpdateDeclaration(Declaration updateDeclarationParam) {
			this.updateDeclaration = updateDeclarationParam;
			return this;
		}

		/**
		 * Deletes an existing declaration.
		 */
		public Builder withDeleteDeclaration(Void deleteDeclarationParam) {
			this.deleteDeclaration = deleteDeclarationParam;
			return this;
		}

		/**
		 * Create a new journal.
		 */
		public Builder withCreateJournal(Journal createJournalParam) {
			this.createJournal = createJournalParam;
			return this;
		}

		/**
		 * Updates an existing journal.
		 */
		public Builder withUpdateJournal(Journal updateJournalParam) {
			this.updateJournal = updateJournalParam;
			return this;
		}

		/**
		 * Deletes an existing journal.
		 */
		public Builder withDeleteJournal(Void deleteJournalParam) {
			this.deleteJournal = deleteJournalParam;
			return this;
		}

		/**
		 * Creates a new person.
		 */
		public Builder withCreatePerson(Person createPersonParam) {
			this.createPerson = createPersonParam;
			return this;
		}

		/**
		 * Updates an existing person.
		 */
		public Builder withUpdatePerson(Person updatePersonParam) {
			this.updatePerson = updatePersonParam;
			return this;
		}

		/**
		 * Deletes an existing person.
		 */
		public Builder withDeletePerson(Void deletePersonParam) {
			this.deletePerson = deletePersonParam;
			return this;
		}

		/**
		 * Creates a new publication.
		 */
		public Builder withCreatePublication(Publication createPublicationParam) {
			this.createPublication = createPublicationParam;
			return this;
		}

		/**
		 * Updates an existing publication.
		 */
		public Builder withUpdatePublication(Publication updatePublicationParam) {
			this.updatePublication = updatePublicationParam;
			return this;
		}

		/**
		 * Deletes an existing publication.
		 */
		public Builder withDeletePublication(Void deletePublicationParam) {
			this.deletePublication = deletePublicationParam;
			return this;
		}

		/**
		 * Creates a new publisher.
		 */
		public Builder withCreatePublisher(Publisher createPublisherParam) {
			this.createPublisher = createPublisherParam;
			return this;
		}

		/**
		 * Updates an existing publisher.
		 */
		public Builder withUpdatePublisher(Publisher updatePublisherParam) {
			this.updatePublisher = updatePublisherParam;
			return this;
		}

		/**
		 * Deletes an existing publisher.
		 */
		public Builder withDeletePublisher(Void deletePublisherParam) {
			this.deletePublisher = deletePublisherParam;
			return this;
		}

		/**
		 * Creates a new quotation.
		 */
		public Builder withCreateQuotation(Quotation createQuotationParam) {
			this.createQuotation = createQuotationParam;
			return this;
		}

		/**
		 * Updates an existing quotation.
		 */
		public Builder withUpdateQuotation(Quotation updateQuotationParam) {
			this.updateQuotation = updateQuotationParam;
			return this;
		}

		/**
		 * Deletes an existing quotation.
		 */
		public Builder withDeleteQuotation(Void deleteQuotationParam) {
			this.deleteQuotation = deleteQuotationParam;
			return this;
		}

		/**
		 * Creates a new topic.
		 */
		public Builder withCreateTopic(Topic createTopicParam) {
			this.createTopic = createTopicParam;
			return this;
		}

		/**
		 * Updates an existing topic.
		 */
		public Builder withUpdateTopic(Topic updateTopicParam) {
			this.updateTopic = updateTopicParam;
			return this;
		}

		/**
		 * Deletes an existing topic.
		 */
		public Builder withDeleteTopic(Void deleteTopicParam) {
			this.deleteTopic = deleteTopicParam;
			return this;
		}

		/**
		 * Adds a new topic reference.
		 */
		public Builder withAddTopicRef(Boolean addTopicRefParam) {
			this.addTopicRef = addTopicRefParam;
			return this;
		}

		/**
		 * Removes a topic reference.
		 */
		public Builder withRemoveTopicRef(Boolean removeTopicRefParam) {
			this.removeTopicRef = removeTopicRefParam;
			return this;
		}

		/**
		 * Links two entities.
		 */
		public Builder withLinkEntities(Boolean linkEntitiesParam) {
			this.linkEntities = linkEntitiesParam;
			return this;
		}

		/**
		 * Unlinks two linked entities.
		 */
		public Builder withUnlinkEntities(Boolean unlinkEntitiesParam) {
			this.unlinkEntities = unlinkEntitiesParam;
			return this;
		}

		/**
		 * Creates a new user.
		 */
		public Builder withCreateUser(User createUserParam) {
			this.createUser = createUserParam;
			return this;
		}

		/**
		 * Updates an existing user.
		 */
		public Builder withUpdateUser(User updateUserParam) {
			this.updateUser = updateUserParam;
			return this;
		}

		/**
		 * Updates an existing user.
		 */
		public Builder withDeleteUser(Void deleteUserParam) {
			this.deleteUser = deleteUserParam;
			return this;
		}

		/**
		 * Grants permissions to a user. The specified permissions are added to any existing ones.
		 */
		public Builder withGrantUserPermissions(User grantUserPermissionsParam) {
			this.grantUserPermissions = grantUserPermissionsParam;
			return this;
		}

		/**
		 * Revokes permissions from a user. The specified permissions are removed from the user; other permissions
		 * remain intact.
		 */
		public Builder withRevokeUserPermissions(User revokeUserPermissionsParam) {
			this.revokeUserPermissions = revokeUserPermissionsParam;
			return this;
		}

		public Mutation build() {
			Mutation _object = new Mutation();
			_object.setCreateClaim(this.createClaim);
			_object.setUpdateClaim(this.updateClaim);
			_object.setDeleteClaim(this.deleteClaim);
			_object.setCreateDeclaration(this.createDeclaration);
			_object.setUpdateDeclaration(this.updateDeclaration);
			_object.setDeleteDeclaration(this.deleteDeclaration);
			_object.setCreateJournal(this.createJournal);
			_object.setUpdateJournal(this.updateJournal);
			_object.setDeleteJournal(this.deleteJournal);
			_object.setCreatePerson(this.createPerson);
			_object.setUpdatePerson(this.updatePerson);
			_object.setDeletePerson(this.deletePerson);
			_object.setCreatePublication(this.createPublication);
			_object.setUpdatePublication(this.updatePublication);
			_object.setDeletePublication(this.deletePublication);
			_object.setCreatePublisher(this.createPublisher);
			_object.setUpdatePublisher(this.updatePublisher);
			_object.setDeletePublisher(this.deletePublisher);
			_object.setCreateQuotation(this.createQuotation);
			_object.setUpdateQuotation(this.updateQuotation);
			_object.setDeleteQuotation(this.deleteQuotation);
			_object.setCreateTopic(this.createTopic);
			_object.setUpdateTopic(this.updateTopic);
			_object.setDeleteTopic(this.deleteTopic);
			_object.setAddTopicRef(this.addTopicRef);
			_object.setRemoveTopicRef(this.removeTopicRef);
			_object.setLinkEntities(this.linkEntities);
			_object.setUnlinkEntities(this.unlinkEntities);
			_object.setCreateUser(this.createUser);
			_object.setUpdateUser(this.updateUser);
			_object.setDeleteUser(this.deleteUser);
			_object.setGrantUserPermissions(this.grantUserPermissions);
			_object.setRevokeUserPermissions(this.revokeUserPermissions);
			return _object;
		}
	}

}