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

package io.github.demonfiddler.ee.server.datafetcher;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.dataloader.BatchLoaderEnvironment;
import org.dataloader.DataLoader;

import graphql.GraphQLContext;
import graphql.schema.DataFetchingEnvironment;
import io.github.demonfiddler.ee.server.model.FormatKind;
import io.github.demonfiddler.ee.server.model.ITrackedEntity;
import io.github.demonfiddler.ee.server.model.LogPage;
import io.github.demonfiddler.ee.server.model.LogQueryFilter;
import io.github.demonfiddler.ee.server.model.PageableInput;
import io.github.demonfiddler.ee.server.model.User;

/**
 * This interface contains the fata fetchers that are delegated in the bean that the implementation has to provide, when
 * fetching fields for the ITrackedEntity GraphQL type, as defined in the provided GraphQL schema. Please read the
 * <a href= "https://github.com/graphql-java-generator/graphql-maven-plugin-project/wiki/server"> wiki server page</a>
 * for more information on this.
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */

public interface DataFetchersDelegateITrackedEntity {

	/**
	 * Description for the status field: <br/>
	 * The entity status. <br/>
	 * This method loads the data for ITrackedEntity.status. It may return whatever is accepted by the Spring
	 * Controller, that is:
	 * <ul>
	 * <li>A resolved value of any type (typically, a String)</li>
	 * <li>Mono and Flux for asynchronous value(s). Supported for controller methods and for any DataFetcher as
	 * described in Reactive DataFetcher. This would typically be a Mono&lt;String&gt; or a Flux&lt;String&gt;</li>
	 * <li>Kotlin coroutine and Flow are adapted to Mono and Flux</li>
	 * <li>java.util.concurrent.Callable to have the value(s) produced asynchronously. For this to work,
	 * AnnotatedControllerConfigurer must be configured with an Executor. This would typically by a
	 * Callable&lt;String&gt;</li>
	 * </ul>
	 * As a complement to the spring-graphql documentation, you may also return:
	 * <ul>
	 * <li>A CompletableFuture<?>, for instance CompletableFuture<String>. This allows to use
	 * <A HREF="https://github.com/graphql-java/java-dataloader">graphql-java java-dataloader</A> to highly optimize the
	 * number of requests to the server. The principle is this one: The data loader collects all the data to load, avoid
	 * to load several times the same data, and allows parallel execution of the queries, if multiple queries are to be
	 * run.</li>
	 * <li>A Publisher (instead of a Flux), for Subscription for instance</li>
	 * </ul>
	 * @param dataFetchingEnvironment The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full
	 * GraphQL context for this DataFetcher
	 * @param origin The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch
	 * the status attribute of the <I>origin</I>, which is an instance of {InterfaceType {name:ITrackedEntity,
	 * fields:{Field{name:status, type:String, params:[format:FormatKind]},Field{name:created, type:DateTime,
	 * params:[]},Field{name:createdByUser, type:User, params:[]},Field{name:updated, type:DateTime,
	 * params:[]},Field{name:updatedByUser, type:User, params:[]},Field{name:log, type:LogPage!,
	 * params:[filter:LogQueryFilter,pageSort:PageableInput]}}, comments ""}. It depends on your data modle, but it
	 * typically contains the id to use in the query.
	 * @param format The input parameter sent in the query by the GraphQL consumer, as defined in the GraphQL schema.
	 * @throws NoSuchElementException This method may return a {@link NoSuchElementException} exception. In this case,
	 * the exception is trapped by the calling method, and the return is consider as null. This allows to use the
	 * {@link Optional#get()} method directly, without caring of whether or not there is a value. The generated code
	 * will take care of the {@link NoSuchElementException} exception.
	 */
	Object status(DataFetchingEnvironment dataFetchingEnvironment, ITrackedEntity origin, FormatKind format);

	/**
	 * This methods loads the data for ${dataFetcher.graphQLType}.createdByUser. It is generated as the
	 * <code>generateBatchMappingDataFetchers</code> plugin parameter is true. <br/>
	 * @param batchLoaderEnvironment The environement for this batch loaded. You can extract the GraphQLContext from
	 * this parameter.
	 * @param graphQLContext
	 * @param keys The objects for which the value for the createdByUser field must be retrieved.
	 * @return This method returns <code>${dataFetcher.batchMappingReturnType.value}</code>, as defined by the
	 * <code>batchMappingDataFetcherReturnType</code> plugin parameter. <br/>
	 * Please look at the spring-graphql annotation for a documentation on how to return the proper values
	 */
	Map<ITrackedEntity, User> createdByUser(BatchLoaderEnvironment batchLoaderEnvironment,
		GraphQLContext graphQLContext, List<ITrackedEntity> keys);

	/**
	 * This methods loads the data for ${dataFetcher.graphQLType}.updatedByUser. It is generated as the
	 * <code>generateBatchMappingDataFetchers</code> plugin parameter is true. <br/>
	 * @param batchLoaderEnvironment The environement for this batch loaded. You can extract the GraphQLContext from
	 * this parameter.
	 * @param graphQLContext
	 * @param keys The objects for which the value for the updatedByUser field must be retrieved.
	 * @return This method returns <code>${dataFetcher.batchMappingReturnType.value}</code>, as defined by the
	 * <code>batchMappingDataFetcherReturnType</code> plugin parameter. <br/>
	 * Please look at the spring-graphql annotation for a documentation on how to return the proper values
	 */
	Map<ITrackedEntity, User> updatedByUser(BatchLoaderEnvironment batchLoaderEnvironment,
		GraphQLContext graphQLContext, List<ITrackedEntity> keys);

	/**
	 * Description for the log field: <br/>
	 * Log of transactions involving the record. <br/>
	 * This method loads the data for ITrackedEntity.log. It may return whatever is accepted by the Spring Controller,
	 * that is:
	 * <ul>
	 * <li>A resolved value of any type (typically, a io.github.demonfiddler.ee.server.LogPage)</li>
	 * <li>Mono and Flux for asynchronous value(s). Supported for controller methods and for any DataFetcher as
	 * described in Reactive DataFetcher. This would typically be a Mono&lt;io.github.demonfiddler.ee.server.LogPage&gt;
	 * or a Flux&lt;io.github.demonfiddler.ee.server.LogPage&gt;</li>
	 * <li>Kotlin coroutine and Flow are adapted to Mono and Flux</li>
	 * <li>java.util.concurrent.Callable to have the value(s) produced asynchronously. For this to work,
	 * AnnotatedControllerConfigurer must be configured with an Executor. This would typically by a
	 * Callable&lt;io.github.demonfiddler.ee.server.LogPage&gt;</li>
	 * </ul>
	 * As a complement to the spring-graphql documentation, you may also return:
	 * <ul>
	 * <li>A CompletableFuture<?>, for instance CompletableFuture<io.github.demonfiddler.ee.server.LogPage>. This allows
	 * to use <A HREF="https://github.com/graphql-java/java-dataloader">graphql-java java-dataloader</A> to highly
	 * optimize the number of requests to the server. The principle is this one: The data loader collects all the data
	 * to load, avoid to load several times the same data, and allows parallel execution of the queries, if multiple
	 * queries are to be run.</li>
	 * <li>A Publisher (instead of a Flux), for Subscription for instance</li>
	 * </ul>
	 * @param dataFetchingEnvironment The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full
	 * GraphQL context for this DataFetcher
	 * @param dataLoader The {@link DataLoader} allows to load several data in one query. It allows to solve the (n+1)
	 * queries issues, and greatly optimizes the response time.<BR/>
	 * You'll find more informations here:
	 * <A HREF= "https://github.com/graphql-java/java-dataloader">https://github.com/graphql-java/java-dataloader</A>
	 * @param origin The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch
	 * the log attribute of the <I>origin</I>, which is an instance of {InterfaceType {name:ITrackedEntity,
	 * fields:{Field{name:status, type:String, params:[format:FormatKind]},Field{name:created, type:DateTime,
	 * params:[]},Field{name:createdByUser, type:User, params:[]},Field{name:updated, type:DateTime,
	 * params:[]},Field{name:updatedByUser, type:User, params:[]},Field{name:log, type:LogPage!,
	 * params:[filter:LogQueryFilter,pageSort:PageableInput]}}, comments ""}. It depends on your data modle, but it
	 * typically contains the id to use in the query.
	 * @param filter The input parameter sent in the query by the GraphQL consumer, as defined in the GraphQL schema.
	 * @param pageSort The input parameter sent in the query by the GraphQL consumer, as defined in the GraphQL schema.
	 * @throws NoSuchElementException This method may return a {@link NoSuchElementException} exception. In this case,
	 * the exception is trapped by the calling method, and the return is consider as null. This allows to use the
	 * {@link Optional#get()} method directly, without caring of whether or not there is a value. The generated code
	 * will take care of the {@link NoSuchElementException} exception.
	 */
	Object log(DataFetchingEnvironment dataFetchingEnvironment, DataLoader<Long, LogPage> dataLoader,
		ITrackedEntity origin, LogQueryFilter filter, PageableInput pageSort);

}
