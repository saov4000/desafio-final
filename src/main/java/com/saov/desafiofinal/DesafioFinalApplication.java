package com.saov.desafiofinal;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.annotations.OpenAPI30;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description="Default Server  URL")})
@SpringBootApplication
public class DesafioFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioFinalApplication.class, args);
	}

}
