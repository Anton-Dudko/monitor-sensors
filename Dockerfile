FROM maven:3.6.3-openjdk-17-slim AS build

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:jdk-oracle

COPY  --from=build app/target/monitor-sensors-0.0.1-SNAPSHOT.jar /opt/monitor-sensors-0.0.1-SNAPSHOT.jar

CMD ["java", "-Dspring.profiles.active=cloud", "-jar", "/opt/monitor-sensors-0.0.1-SNAPSHOT.jar"]

EXPOSE 8088