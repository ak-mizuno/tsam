FROM gradle:jdk11 AS build

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle shadowJar --no-daemon 


FROM openjdk:11-jre-slim

EXPOSE 80
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/dx-0.0.1-SNAPSHOT-all.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
