FROM openjdk:21
ADD ./docker-spring-boot.jar docker-spring-boot.jar
ENTRYPOINT [“java”, “-jar”, “docker-spring-boot.jar”]

RUN apt-get update && \
    apt-get install -y openjdk-21-jre-headless && \
    apt-get clean;