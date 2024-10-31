FROM eclipse-temurin:21

LABEL authors="wassmd@gmail.com"

COPY ./target/polling-job.jar opt/paxier/app.jar

ENTRYPOINT ["java", "-jar","opt/paxier/app.jar"]