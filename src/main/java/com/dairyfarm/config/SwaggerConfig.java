package com.dairyfarm.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SwaggerConfig {

	private Components components() {
		return new Components().addSecuritySchemes("Authorization",
				new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT"));
	}

	@Bean
	public OpenAPI dairyFarmOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Dairy Farm REST APIs").description("Dairy Farm REST API Documentation")
						.version("0.0.1-SNAPSHOT")
						.license(new License().name("Apache 2.0").url("http://www.sdairyfarm.com")))
				.components(components());
	}

	@Bean
	public GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder().group("public-apis").pathsToMatch("/**")
				.packagesToScan("com.dairyfarm.controller").build();
	}
}
