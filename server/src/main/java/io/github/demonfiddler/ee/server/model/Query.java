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

import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;

/**
 * Available queries.
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("Query")
public class Query {

	/**
	 * Returns a paged list of claims.
	 */
	@GraphQLNonScalar(fieldName = "claims", graphQLTypeSimpleName = "ClaimPage", javaClass = ClaimPage.class,
		listDepth = 0)
	ClaimPage claims;

	/**
	 * Returns a claim given its identifier.
	 */
	@GraphQLNonScalar(fieldName = "claimById", graphQLTypeSimpleName = "Claim", javaClass = Claim.class, listDepth = 0)
	Claim claimById;

	/**
	 * Returns a paged list of declarations.
	 */
	@GraphQLNonScalar(fieldName = "declarations", graphQLTypeSimpleName = "DeclarationPage",
		javaClass = DeclarationPage.class, listDepth = 0)
	DeclarationPage declarations;

	/**
	 * Returns a declaration given its identifier.
	 */
	@GraphQLNonScalar(fieldName = "declarationById", graphQLTypeSimpleName = "Declaration",
		javaClass = Declaration.class, listDepth = 0)
	Declaration declarationById;

	/**
	 * Returns a paged list of journals.
	 */
	@GraphQLNonScalar(fieldName = "journals", graphQLTypeSimpleName = "JournalPage", javaClass = JournalPage.class,
		listDepth = 0)
	JournalPage journals;

	/**
	 * Returns a journal given its identifier.
	 */
	@GraphQLNonScalar(fieldName = "journalById", graphQLTypeSimpleName = "Journal", javaClass = Journal.class,
		listDepth = 0)
	Journal journalById;

	/**
	 * Returns a paged list of log entries.
	 */
	@GraphQLNonScalar(fieldName = "log", graphQLTypeSimpleName = "LogPage", javaClass = LogPage.class, listDepth = 0)
	LogPage log;

	/**
	 * Returns a paged list of persons.
	 */
	@GraphQLNonScalar(fieldName = "persons", graphQLTypeSimpleName = "PersonPage", javaClass = PersonPage.class,
		listDepth = 0)
	PersonPage persons;

	/**
	 * Returns a person given its identifier.
	 */
	@GraphQLNonScalar(fieldName = "personById", graphQLTypeSimpleName = "Person", javaClass = Person.class,
		listDepth = 0)
	Person personById;

	/**
	 * Returns a paged list of publications.
	 */
	@GraphQLNonScalar(fieldName = "publications", graphQLTypeSimpleName = "PublicationPage",
		javaClass = PublicationPage.class, listDepth = 0)
	PublicationPage publications;

	/**
	 * Returns a publication given its identifier.
	 */
	@GraphQLNonScalar(fieldName = "publicationById", graphQLTypeSimpleName = "Publication",
		javaClass = Publication.class, listDepth = 0)
	Publication publicationById;

	/**
	 * Returns a paged list of publishers.
	 */
	@GraphQLNonScalar(fieldName = "publishers", graphQLTypeSimpleName = "PublisherPage",
		javaClass = PublisherPage.class, listDepth = 0)
	PublisherPage publishers;

	/**
	 * Returns a publisher given its identifier.
	 */
	@GraphQLNonScalar(fieldName = "publisherById", graphQLTypeSimpleName = "Publisher", javaClass = Publisher.class,
		listDepth = 0)
	Publisher publisherById;

	/**
	 * Returns a paged list of quotations.
	 */
	@GraphQLNonScalar(fieldName = "quotations", graphQLTypeSimpleName = "QuotationPage",
		javaClass = QuotationPage.class, listDepth = 0)
	QuotationPage quotations;

	/**
	 * Returns a quotation given its identifier.
	 */
	@GraphQLNonScalar(fieldName = "quotationById", graphQLTypeSimpleName = "Quotation", javaClass = Quotation.class,
		listDepth = 0)
	Quotation quotationById;

	/**
	 * Returns a paged list of topics or sub-topics.
	 */
	@GraphQLNonScalar(fieldName = "topics", graphQLTypeSimpleName = "TopicPage", javaClass = TopicPage.class,
		listDepth = 0)
	TopicPage topics;

	/**
	 * Returns a topic given its identifier.
	 */
	@GraphQLNonScalar(fieldName = "topicById", graphQLTypeSimpleName = "Topic", javaClass = Topic.class, listDepth = 0)
	Topic topicById;

	@GraphQLNonScalar(fieldName = "topicRefs", graphQLTypeSimpleName = "TopicRefPage", javaClass = TopicRefPage.class,
		listDepth = 0)
	TopicRefPage topicRefs;

	/**
	 * Returns a topic reference given its identifier.
	 */
	@GraphQLNonScalar(fieldName = "topicRefById", graphQLTypeSimpleName = "TopicRef", javaClass = TopicRef.class,
		listDepth = 0)
	TopicRef topicRefById;

	/**
	 * Returns a paged list of users.
	 */
	@GraphQLNonScalar(fieldName = "users", graphQLTypeSimpleName = "UserPage", javaClass = UserPage.class,
		listDepth = 0)
	UserPage users;

	/**
	 * Returns a user given its identifier.
	 */
	@GraphQLNonScalar(fieldName = "userById", graphQLTypeSimpleName = "User", javaClass = User.class, listDepth = 0)
	User userById;

	/**
	 * Returns a user given its login.
	 */
	@GraphQLNonScalar(fieldName = "userByLogin", graphQLTypeSimpleName = "User", javaClass = User.class, listDepth = 0)
	User userByLogin;

	/**
	 * Returns a paged list of claims.
	 */
	public void setClaims(ClaimPage claims) {
		this.claims = claims;
	}

	/**
	 * Returns a paged list of claims.
	 */
	public ClaimPage getClaims() {
		return this.claims;
	}

	/**
	 * Returns a claim given its identifier.
	 */
	public void setClaimById(Claim claimById) {
		this.claimById = claimById;
	}

	/**
	 * Returns a claim given its identifier.
	 */
	public Claim getClaimById() {
		return this.claimById;
	}

	/**
	 * Returns a paged list of declarations.
	 */
	public void setDeclarations(DeclarationPage declarations) {
		this.declarations = declarations;
	}

	/**
	 * Returns a paged list of declarations.
	 */
	public DeclarationPage getDeclarations() {
		return this.declarations;
	}

	/**
	 * Returns a declaration given its identifier.
	 */
	public void setDeclarationById(Declaration declarationById) {
		this.declarationById = declarationById;
	}

	/**
	 * Returns a declaration given its identifier.
	 */
	public Declaration getDeclarationById() {
		return this.declarationById;
	}

	/**
	 * Returns a paged list of journals.
	 */
	public void setJournals(JournalPage journals) {
		this.journals = journals;
	}

	/**
	 * Returns a paged list of journals.
	 */
	public JournalPage getJournals() {
		return this.journals;
	}

	/**
	 * Returns a journal given its identifier.
	 */
	public void setJournalById(Journal journalById) {
		this.journalById = journalById;
	}

	/**
	 * Returns a journal given its identifier.
	 */
	public Journal getJournalById() {
		return this.journalById;
	}

	/**
	 * Returns a paged list of log entries.
	 */
	public void setLog(LogPage log) {
		this.log = log;
	}

	/**
	 * Returns a paged list of log entries.
	 */
	public LogPage getLog() {
		return this.log;
	}

	/**
	 * Returns a paged list of persons.
	 */
	public void setPersons(PersonPage persons) {
		this.persons = persons;
	}

	/**
	 * Returns a paged list of persons.
	 */
	public PersonPage getPersons() {
		return this.persons;
	}

	/**
	 * Returns a person given its identifier.
	 */
	public void setPersonById(Person personById) {
		this.personById = personById;
	}

	/**
	 * Returns a person given its identifier.
	 */
	public Person getPersonById() {
		return this.personById;
	}

	/**
	 * Returns a paged list of publications.
	 */
	public void setPublications(PublicationPage publications) {
		this.publications = publications;
	}

	/**
	 * Returns a paged list of publications.
	 */
	public PublicationPage getPublications() {
		return this.publications;
	}

	/**
	 * Returns a publication given its identifier.
	 */
	public void setPublicationById(Publication publicationById) {
		this.publicationById = publicationById;
	}

	/**
	 * Returns a publication given its identifier.
	 */
	public Publication getPublicationById() {
		return this.publicationById;
	}

	/**
	 * Returns a paged list of publishers.
	 */
	public void setPublishers(PublisherPage publishers) {
		this.publishers = publishers;
	}

	/**
	 * Returns a paged list of publishers.
	 */
	public PublisherPage getPublishers() {
		return this.publishers;
	}

	/**
	 * Returns a publisher given its identifier.
	 */
	public void setPublisherById(Publisher publisherById) {
		this.publisherById = publisherById;
	}

	/**
	 * Returns a publisher given its identifier.
	 */
	public Publisher getPublisherById() {
		return this.publisherById;
	}

	/**
	 * Returns a paged list of quotations.
	 */
	public void setQuotations(QuotationPage quotations) {
		this.quotations = quotations;
	}

	/**
	 * Returns a paged list of quotations.
	 */
	public QuotationPage getQuotations() {
		return this.quotations;
	}

	/**
	 * Returns a quotation given its identifier.
	 */
	public void setQuotationById(Quotation quotationById) {
		this.quotationById = quotationById;
	}

	/**
	 * Returns a quotation given its identifier.
	 */
	public Quotation getQuotationById() {
		return this.quotationById;
	}

	/**
	 * Returns a paged list of topics or sub-topics.
	 */
	public void setTopics(TopicPage topics) {
		this.topics = topics;
	}

	/**
	 * Returns a paged list of topics or sub-topics.
	 */
	public TopicPage getTopics() {
		return this.topics;
	}

	/**
	 * Returns a topic given its identifier.
	 */
	public void setTopicById(Topic topicById) {
		this.topicById = topicById;
	}

	/**
	 * Returns a topic given its identifier.
	 */
	public Topic getTopicById() {
		return this.topicById;
	}

	public void setTopicRefs(TopicRefPage topicRefs) {
		this.topicRefs = topicRefs;
	}

	public TopicRefPage getTopicRefs() {
		return this.topicRefs;
	}

	/**
	 * Returns a topic reference given its identifier.
	 */
	public void setTopicRefById(TopicRef topicRefById) {
		this.topicRefById = topicRefById;
	}

	/**
	 * Returns a topic reference given its identifier.
	 */
	public TopicRef getTopicRefById() {
		return this.topicRefById;
	}

	/**
	 * Returns a paged list of users.
	 */
	public void setUsers(UserPage users) {
		this.users = users;
	}

	/**
	 * Returns a paged list of users.
	 */
	public UserPage getUsers() {
		return this.users;
	}

	/**
	 * Returns a user given its identifier.
	 */
	public void setUserById(User userById) {
		this.userById = userById;
	}

	/**
	 * Returns a user given its identifier.
	 */
	public User getUserById() {
		return this.userById;
	}

	/**
	 * Returns a user given its login.
	 */
	public void setUserByLogin(User userByLogin) {
		this.userByLogin = userByLogin;
	}

	/**
	 * Returns a user given its login.
	 */
	public User getUserByLogin() {
		return this.userByLogin;
	}

	public String toString() {
		return "Query {" //$NON-NLS-1$
			+ "claims: " + this.claims //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "claimById: " + this.claimById //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "declarations: " + this.declarations //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "declarationById: " + this.declarationById //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "journals: " + this.journals //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "journalById: " + this.journalById //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "log: " + this.log //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "persons: " + this.persons //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "personById: " + this.personById //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "publications: " + this.publications //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "publicationById: " + this.publicationById //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "publishers: " + this.publishers //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "publisherById: " + this.publisherById //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "quotations: " + this.quotations //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "quotationById: " + this.quotationById //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "topics: " + this.topics //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "topicById: " + this.topicById //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "topicRefs: " + this.topicRefs //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "topicRefById: " + this.topicRefById //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "users: " + this.users //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "userById: " + this.userById //$NON-NLS-1$
			+ ", " //$NON-NLS-1$
			+ "userByLogin: " + this.userByLogin //$NON-NLS-1$
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

		private ClaimPage claims;
		private Claim claimById;
		private DeclarationPage declarations;
		private Declaration declarationById;
		private JournalPage journals;
		private Journal journalById;
		private LogPage log;
		private PersonPage persons;
		private Person personById;
		private PublicationPage publications;
		private Publication publicationById;
		private PublisherPage publishers;
		private Publisher publisherById;
		private QuotationPage quotations;
		private Quotation quotationById;
		private TopicPage topics;
		private Topic topicById;
		private TopicRefPage topicRefs;
		private TopicRef topicRefById;
		private UserPage users;
		private User userById;
		private User userByLogin;

		/**
		 * Returns a paged list of claims.
		 */
		public Builder withClaims(ClaimPage claimsParam) {
			this.claims = claimsParam;
			return this;
		}

		/**
		 * Returns a claim given its identifier.
		 */
		public Builder withClaimById(Claim claimByIdParam) {
			this.claimById = claimByIdParam;
			return this;
		}

		/**
		 * Returns a paged list of declarations.
		 */
		public Builder withDeclarations(DeclarationPage declarationsParam) {
			this.declarations = declarationsParam;
			return this;
		}

		/**
		 * Returns a declaration given its identifier.
		 */
		public Builder withDeclarationById(Declaration declarationByIdParam) {
			this.declarationById = declarationByIdParam;
			return this;
		}

		/**
		 * Returns a paged list of journals.
		 */
		public Builder withJournals(JournalPage journalsParam) {
			this.journals = journalsParam;
			return this;
		}

		/**
		 * Returns a journal given its identifier.
		 */
		public Builder withJournalById(Journal journalByIdParam) {
			this.journalById = journalByIdParam;
			return this;
		}

		/**
		 * Returns a paged list of log entries.
		 */
		public Builder withLog(LogPage logParam) {
			this.log = logParam;
			return this;
		}

		/**
		 * Returns a paged list of persons.
		 */
		public Builder withPersons(PersonPage personsParam) {
			this.persons = personsParam;
			return this;
		}

		/**
		 * Returns a person given its identifier.
		 */
		public Builder withPersonById(Person personByIdParam) {
			this.personById = personByIdParam;
			return this;
		}

		/**
		 * Returns a paged list of publications.
		 */
		public Builder withPublications(PublicationPage publicationsParam) {
			this.publications = publicationsParam;
			return this;
		}

		/**
		 * Returns a publication given its identifier.
		 */
		public Builder withPublicationById(Publication publicationByIdParam) {
			this.publicationById = publicationByIdParam;
			return this;
		}

		/**
		 * Returns a paged list of publishers.
		 */
		public Builder withPublishers(PublisherPage publishersParam) {
			this.publishers = publishersParam;
			return this;
		}

		/**
		 * Returns a publisher given its identifier.
		 */
		public Builder withPublisherById(Publisher publisherByIdParam) {
			this.publisherById = publisherByIdParam;
			return this;
		}

		/**
		 * Returns a paged list of quotations.
		 */
		public Builder withQuotations(QuotationPage quotationsParam) {
			this.quotations = quotationsParam;
			return this;
		}

		/**
		 * Returns a quotation given its identifier.
		 */
		public Builder withQuotationById(Quotation quotationByIdParam) {
			this.quotationById = quotationByIdParam;
			return this;
		}

		/**
		 * Returns a paged list of topics or sub-topics.
		 */
		public Builder withTopics(TopicPage topicsParam) {
			this.topics = topicsParam;
			return this;
		}

		/**
		 * Returns a topic given its identifier.
		 */
		public Builder withTopicById(Topic topicByIdParam) {
			this.topicById = topicByIdParam;
			return this;
		}

		public Builder withTopicRefs(TopicRefPage topicRefsParam) {
			this.topicRefs = topicRefsParam;
			return this;
		}

		/**
		 * Returns a topic reference given its identifier.
		 */
		public Builder withTopicRefById(TopicRef topicRefByIdParam) {
			this.topicRefById = topicRefByIdParam;
			return this;
		}

		/**
		 * Returns a paged list of users.
		 */
		public Builder withUsers(UserPage usersParam) {
			this.users = usersParam;
			return this;
		}

		/**
		 * Returns a user given its identifier.
		 */
		public Builder withUserById(User userByIdParam) {
			this.userById = userByIdParam;
			return this;
		}

		/**
		 * Returns a user given its login.
		 */
		public Builder withUserByLogin(User userByLoginParam) {
			this.userByLogin = userByLoginParam;
			return this;
		}

		public Query build() {
			Query _object = new Query();
			_object.setClaims(this.claims);
			_object.setClaimById(this.claimById);
			_object.setDeclarations(this.declarations);
			_object.setDeclarationById(this.declarationById);
			_object.setJournals(this.journals);
			_object.setJournalById(this.journalById);
			_object.setLog(this.log);
			_object.setPersons(this.persons);
			_object.setPersonById(this.personById);
			_object.setPublications(this.publications);
			_object.setPublicationById(this.publicationById);
			_object.setPublishers(this.publishers);
			_object.setPublisherById(this.publisherById);
			_object.setQuotations(this.quotations);
			_object.setQuotationById(this.quotationById);
			_object.setTopics(this.topics);
			_object.setTopicById(this.topicById);
			_object.setTopicRefs(this.topicRefs);
			_object.setTopicRefById(this.topicRefById);
			_object.setUsers(this.users);
			_object.setUserById(this.userById);
			_object.setUserByLogin(this.userByLogin);
			return _object;
		}

	}

}
