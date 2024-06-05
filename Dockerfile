FROM openjdk:23-slim
WORKDIR /app
COPY target/Fourth-Milestone-jenkins-0.0.1-SNAPSHOT.jar .
EXPOSE 9099
ENTRYPOINT ["java","-jar", "Fourth-Milestone-jenkins-0.0.1-SNAPSHOT.jar"]