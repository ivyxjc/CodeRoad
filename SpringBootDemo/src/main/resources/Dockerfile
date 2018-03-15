FROM openjdk:slim
ENV JAVA_OPTS=""
ADD SpringBootDemo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
