package com.github.nishadnijam.springwebfluxtaskorganizerapi.configuration;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.TestcontainersConfiguration;

public class BaseIntegrationTest implements BeforeAllCallback {

    private static PostgreSQLContainer<?> postgreSQLContainer;

    @Override
    public void beforeAll(ExtensionContext context) {
        if (postgreSQLContainer == null) {
            TestcontainersConfiguration.getInstance()
                    .updateUserConfig("testcontainers.reuse.enable", "true");
            postgreSQLContainer = new PostgreSQLContainer<>("postgres:latest");
            postgreSQLContainer.withReuse(false);
            postgreSQLContainer.start();
            System.setProperty("spring.r2dbc.url", "r2dbc:postgresql://" +
                    postgreSQLContainer.getHost() + ":" +
                    postgreSQLContainer.getFirstMappedPort() + "/" +
                    postgreSQLContainer.getDatabaseName() + "?loggerLevel=OFF");
            System.setProperty("spring.r2dbc.username", postgreSQLContainer.getUsername());
            System.setProperty("spring.r2dbc.password", postgreSQLContainer.getPassword());
            System.setProperty("spring.flyway.url", postgreSQLContainer.getJdbcUrl());
            System.setProperty("spring.flyway.user", postgreSQLContainer.getUsername());
            System.setProperty("spring.flyway.password", postgreSQLContainer.getPassword());
        }
    }
}
