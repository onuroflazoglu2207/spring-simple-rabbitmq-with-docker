FROM openjdk:11
WORKDIR /project
COPY /simplerabbitmq .
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]