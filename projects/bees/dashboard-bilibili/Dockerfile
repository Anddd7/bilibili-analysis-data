FROM openjdk:8-jdk-alpine
VOLUME /tmp

ARG version
COPY build/libs/dashboard-bilibili-$version.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=uat","-jar","/app.jar"]