# Spring WebFlux Task Organizer API

This project is a Spring WebFlux-based API for managing tasks. It utilizes the Spring Boot framework with R2DBC (Reactive Relational Database Connectivity) and integrates Flyway for database migration. The application is designed to provide reactive and non-blocking endpoints for creating, retrieving, updating, and deleting tasks.

## Table of Contents

- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Building and Running the Project](#building-and-running-the-project)
- [Configuration](#configuration)
- [Testing](#testing)

## Project Structure

The project follows a typical Spring Boot project structure with key components organized into packages:

- `com.github.nishadnijam.springwebfluxtaskorganizerapi`: Main package containing the application entry point and configuration.
- `com.github.nishadnijam.springwebfluxtaskorganizerapi.controller`: Controllers handling HTTP requests.
- `com.github.nishadnijam.springwebfluxtaskorganizerapi.exceptionhandler`: Global exception handling.
- `com.github.nishadnijam.springwebfluxtaskorganizerapi.model`: Data model and custom exceptions.
- `com.github.nishadnijam.springwebfluxtaskorganizerapi.repository`: R2DBC repository for database interaction.
- `com.github.nishadnijam.springwebfluxtaskorganizerapi.service`: Service layer for business logic.
- `com.github.nishadnijam.springwebfluxtaskorganizerapi.configuration`: Application and database configuration.
- `db/migration`: Flyway migration scripts for database schema evolution.

## Prerequisites

Ensure you have the following installed:

- [Docker](https://www.docker.com/) for containerization
- [Java Development Kit (JDK) 21](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/) for building and managing the project

## Building and Running the Project

To build the project, run the following Maven command in the project root directory:

```bash
mvn clean install
```

To run the application with Docker Compose:

```bash
docker-compose up
```

## Configuration

The application is configured through the `application.properties` file and uses the following key configurations:

- Database configuration for R2DBC with PostgreSQL.
- Flyway configuration for database migration.
- Spring profiles for active profiles, with the default being `production`.

## Testing

The project includes unit tests and integration tests. Run the tests with the following Maven command:

```bash
mvn test
```