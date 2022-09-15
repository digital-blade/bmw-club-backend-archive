FROM gradle:jdk18-alpine AS build

WORKDIR /home/gradle/project
COPY --chown=gradle:gradle . .

RUN gradle bootJar

FROM openjdk:18-jdk-alpine3.14

WORKDIR app

COPY --from=build /home/gradle/project/build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]