package com.github.nishadnijam.springwebfluxtaskorganizerapi.configuration;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
@EnableConfigurationProperties({R2dbcProperties.class, FlywayProperties.class})
class FlywayDBConfiguration {
  @Bean(initMethod = "migrate")
  public Flyway flyway(FlywayProperties flywayProperties, R2dbcProperties r2dbcProperties) {
    return Flyway.configure()
        .dataSource(
            flywayProperties.getUrl(), r2dbcProperties.getUsername(), r2dbcProperties.getPassword())
        .locations(flywayProperties.getLocations().stream().toArray(String[]::new))
        .baselineOnMigrate(true)
        .load();
  }
}
