FROM openjdk:21
ENV JAVA_HOME /C:/java/Program Files/SapMachine/JDK/21
ADD ./docker-spring-boot.jar docker-spring-boot.jar
ENTRYPOINT [“java”, “-jar”, “docker-spring-boot.jar”]