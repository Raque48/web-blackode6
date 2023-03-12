FROM eclipse-temurin:17-alpine

RUN akdir /app

WORKDIR /app

COPY target/zanjar-0.0.1-SNAPSHOT.jar /app/zanjar.jar

EXPOSE 8088

CMD java -jar zanjar.jar