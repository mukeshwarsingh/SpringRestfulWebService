package com.vst.trc.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan("com.vst.trc.controller")
public class SwaggerAdminConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SPRING_WEB).select().apis(RequestHandlerSelectors.any())

				.build().pathMapping("/api").apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("Learning Field REST API", "This is a description of Learning Field REST API.",
				"API TOS", "admin@vst.com", "API License", "API License URL", "API License URL");
		return apiInfo;
	}

}
