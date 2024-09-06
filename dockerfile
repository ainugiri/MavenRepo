FROM openjdk:17-jdk-slim
WORKDIR / app
COPY target/*.jar app.jar
ENVIRONMENT ["java", "-jar", "app.jar"]
