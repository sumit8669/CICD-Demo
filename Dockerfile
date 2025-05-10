FROM openjdk:17
LABEL authors="sumit"
EXPOSE 8080
ADD target/cicd-demo-image.jar cicd-demo-image.jar

ENTRYPOINT ["java", "-jar", "/cicd-demo-image.jar"]