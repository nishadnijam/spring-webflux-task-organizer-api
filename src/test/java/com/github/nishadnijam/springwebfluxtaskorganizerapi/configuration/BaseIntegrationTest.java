package com.github.nishadnijam.springwebfluxtaskorganizerapi.configuration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
public abstract class BaseIntegrationTest {

    @Container
    protected static final PostgreSQLContainer<?> postgreSQLContainer =
            new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"))
                    .withDatabaseName("testdb")
                    .withUsername("testuser")
                    .withPassword("testpassword");

    @BeforeAll
    static void beforeAll() {
        postgreSQLContainer.start();
        System.setProperty("spring.flyway.url", postgreSQLContainer.getJdbcUrl());
        System.setProperty("spring.r2dbc.username", postgreSQLContainer.getUsername());
        System.setProperty("spring.r2dbc.password", postgreSQLContainer.getPassword());

    }

    @AfterAll
    static void afterAll() {
        postgreSQLContainer.stop();
    }
}
