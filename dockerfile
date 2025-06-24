FROM openjdk:17-jdk-slim
COPY build/libs/orderService-0.0.1-SNAPSHOT.war /app/orderService.war
CMD ["java", "-jar", "/app/orderService.war"]
