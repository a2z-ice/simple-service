FROM eclipse-temurin:17-jdk-alpine
ADD target/simple-service-0.0.1-SNAPSHOT.jar simple-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "simple-service-0.0.1-SNAPSHOT.jar"]
