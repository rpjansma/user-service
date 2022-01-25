FROM openjdk:8-jdk-alpine
MAINTAINER "linkedin.com/in/raul-paes"
COPY target/user-service-0.0.1-SNAPSHOT.jar user-service-1.0.0.jar
ENTRYPOINT ["java","-jar","/user-service-1.0.0.jar"]

