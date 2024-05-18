package com.aqua.fake.configuracoes;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public GroupedOpenApi customOpenAPI() {
            return GroupedOpenApi.builder()
                .group("")
                .packagesToScan("com.aqua.fake.controllers")
                .build();
    }
}
    


