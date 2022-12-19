FROM mozilla/sbt:latest
ARG CACHEBUST=1
RUN "sbt assembly"
COPY target/scala-2.13/football-project.jar /app/my-service.jar
ENTRYPOINT ["java", "-jar", "/app/my-service.jar"]