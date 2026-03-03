FROM eclipse-temurin:21-jre
LABEL authors="irakump"
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","app.jar"]
