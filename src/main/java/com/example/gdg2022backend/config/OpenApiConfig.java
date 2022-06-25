package com.example.gdg2022backend.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import java.time.LocalDateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI openAPI() {
		final Info info = new Info()
				.version(LocalDateTime.now().toString())
				.title("칰픽")
				.description("");

		return new OpenAPI()
				.addServersItem(new Server().url("http://43.200.4.212:8080/"))
				.addServersItem(new Server().url("http://localhost:8080/"))
				.components(new Components())
				.info(info);
	}
}
