FROM maven:3.6-jdk-8-alpine
MAINTAINER Luis Peralta (luis_peralta_000@hotmail.com)

WORKDIR /app

COPY . .

RUN mvn install

VOLUME maven-repo:/root/.m2

