FROM openjdk:8-jdk-alpine
FROM maven:3.5-jdk-8 AS build  
COPY src /usr/src/app/src  
COPY pom.xml /usr/src/app  
RUN mvn -f /usr/src/app/pom.xml clean package -DskipTests



#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
#ARG JAR_FILE=target/*.jar
COPY target/spring-docker-0.1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
