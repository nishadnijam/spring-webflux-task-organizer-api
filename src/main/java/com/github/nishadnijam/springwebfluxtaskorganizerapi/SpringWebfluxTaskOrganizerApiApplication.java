package com.github.nishadnijam.springwebfluxtaskorganizerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class SpringWebfluxTaskOrganizerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebfluxTaskOrganizerApiApplication.class, args);
	}

}
