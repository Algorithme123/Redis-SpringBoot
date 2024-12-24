package com.gkd.redis_spring.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact =  @Contact(
                        name = "API- Project Management",
                        email = "soleililimiter123@gmail.com",
                        url = "..."

                ),
                description = "Notre API de Gestion des Produits et Categiories",
                title = "API- Project Management",
                version = "2.0"

        ),
        servers = @Server(
                description = "Server 1",
                url = "http://localhost:8080"
        )
)
public class OpenApiConfig {
}