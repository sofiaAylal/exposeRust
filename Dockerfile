FROM openjdk:11-jre-slim

WORKDIR /app

COPY src /app/src

COPY out/artifacts/exposeRust_jar/exposeRust.jar /app/exposeRust.jar

CMD ["java", "-jar", "exposeRust.jar"]
