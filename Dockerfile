FROM openjdk:8
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY . .
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar

#Example1
#FROM openjdk:8-jdk-alpine
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]