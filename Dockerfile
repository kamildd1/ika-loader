FROM openjdk:11
VOLUME tmp
COPY target/*.jar loader-1.0.1.jar
VOLUME 8084:8084
ENTRYPOINT ["java","-jar","/loader-1.0.1.jar"]