FROM openjdk:11 as build
MAINTAINER Aleksandr Philimonov
COPY target/pastebox-0.0.1-SNAPSHOT.jar pastebox.jar
ENTRYPOINT ["java", "-jar", "/pastebox.jar"]