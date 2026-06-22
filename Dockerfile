# Set the base image with Amazon Corretto Java 21
FROM amazoncorretto:21

# Set working directory inside the container
WORKDIR /app

# Copy Spring Boot JAR into the container
COPY target/*.jar app.jar

# App listens on port 8080 (not published)
EXPOSE 8080

# Start the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]