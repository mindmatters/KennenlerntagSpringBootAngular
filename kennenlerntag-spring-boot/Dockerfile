FROM gradle:7.1.0-jdk11 as build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

RUN  ls -la /home/gradle/src/build/libs/
FROM openjdk:11-jre-slim

RUN mkdir /app


COPY --from=build /home/gradle/src/build/libs/kennenlerntag-0.0.1-SNAPSHOT.jar /app/spring-boot-application.jar

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]
