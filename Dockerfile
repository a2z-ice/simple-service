FROM eclipse-temurin:17.0.11_9-jdk-ubi9-minimal
ADD target/simple-service-0.0.1-SNAPSHOT.jar simple-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=prod", "simple-service-0.0.1-SNAPSHOT.jar"]