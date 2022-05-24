FROM maven:3.6-jdk-8-alpine
MAINTAINER Luis Peralta (luis_peralta_000@hotmail.com)

WORKDIR /app

COPY pom.xml .

RUN mvn install

COPY . .

VOLUME /root/.m2/repository

