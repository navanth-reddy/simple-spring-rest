FROM openjdk:17-jdk-slim
EXPOSE 9010
ADD target/my-spring-app.jar my-spring-app.jar
CMD ["java", "-jar", "my-spring-app.jar"]