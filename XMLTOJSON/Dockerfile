FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} convert-xml-to-json-spring-boot-docker-img.jar
ENTRYPOINT ["java","-jar","convert-xml-to-json-spring-boot-docker-img.jar"]
EXPOSE  7781