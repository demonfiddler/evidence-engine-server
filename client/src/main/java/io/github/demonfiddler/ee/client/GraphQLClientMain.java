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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author generated by graphql-java-generator
 * @see <a href=
 * "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@SpringBootApplication()
@ComponentScan(basePackages = { "io.github.demonfiddler.ee.client",
	"com.graphql_java_generator.client" })
@EnableConfigurationProperties
public class GraphQLClientMain extends SpringBootServletInitializer {

	@Autowired
	protected ApplicationContext applicationContext;

	// @Autowired
	// GraphqlClientUtils graphqlClientUtils;

	public static void main(String[] args) {
		SpringApplication.run(GraphQLClientMain.class, args);
	}

	// /**
	//  * This {@link GraphQlSourceBuilderCustomizer} configures stuff that is mandatory for plugin. Other
	//  * {@link GraphQlSourceBuilderCustomizer} may be registered to add other customization to the Spring
	//  * {@link GraphQlSource}. The only constraint is that other such beans must have different names.
	//  * @return
	//  */
	// @Bean
	// public GraphQlSourceBuilderCustomizer defaultSourceBuilderCustomizer() {
	// 	ClassNameTypeResolver classNameTypeResolver = new ClassNameTypeResolver();
	// 	classNameTypeResolver.setClassNameExtractor((cls) -> {
	// 		return this.graphqlClientUtils.getGraphQLTypeNameFromClass(cls);
	// 	});
	// 	return (builder) -> builder.defaultTypeResolver(classNameTypeResolver);
	// }

}