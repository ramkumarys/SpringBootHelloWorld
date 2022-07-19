#Base Image
FROM openjdk:8-jdk-alpine

#Variables
ARG JAR_FILE=target/*.war


#Copy Jar
COPY ${JAR_FILE} ./app.war

#Entry Point
ENTRYPOINT ["java","-jar","app.war"]


