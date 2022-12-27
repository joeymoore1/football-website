FROM openjdk:8-jre-alpine

COPY target/scala-**/football-project.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]