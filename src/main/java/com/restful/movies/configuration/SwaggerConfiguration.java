package com.restful.movies.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.*;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    private static final Contact DEFAULT_CONTACT = new Contact(
        "Luis Montealegre",
        "http://montealegreluis.com/en",
        "montealegreluis@gmail.com"
    );
    private static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
        "RESTful Web Service for Movies",
        "Tired of not knowing what to watch? Look no further!",
        "1.0",
        "https://github.com/MontealegreLuis/restful-movies",
        DEFAULT_CONTACT,
        "BSD 3 Clause",
        "https://opensource.org/licenses/BSD-3-Clause",
        new ArrayList<>()
    );
    private static final Set<String> DEFAULT_PRODUCES = new HashSet<>(
        Collections.singletonList("application/json")
    );

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(DEFAULT_API_INFO)
            .produces(DEFAULT_PRODUCES)
            .consumes(DEFAULT_PRODUCES);
    }
}
