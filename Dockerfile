FROM openjdk:21-jdk-slim
WORKDIR /minecraft

EXPOSE 25565
CMD ["java", "-Xmx2G", "-Xms2G", "-jar", "server.jar", "nogui"]
