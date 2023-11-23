FROM openjdk:21-jdk
COPY target/spring-webflux-task-organizer-api-*.jar spring-webflux-task-organizer-api.jar
COPY src/main/resources/db/migration/ db/migration/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-webflux-task-organizer-api.jar"]
