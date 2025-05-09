# Step 1: Build using Maven with JDK 8
FROM maven:3.8.5-openjdk-8 AS build
WORKDIR /build

# Copy all files (including pom.xml and src folder)
COPY . .

# Build the application
RUN mvn clean package -DskipTests

# Step 2: Run the application using a lighter JDK image
FROM openjdk:8-jdk-alpine
WORKDIR /app

# Copy the built jar from the previous stage
COPY --from=build /build/target/*.jar app.jar

# Expose the Spring Boot port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
