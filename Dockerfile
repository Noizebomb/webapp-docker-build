
FROM openjdk:11-slim

RUN mkdir /opt/app

WORKDIR /opt/app 

ADD target/example.smallest-0.0.3-SNAPSHOT.jar /opt/app/springboot-app-2.jar

EXPOSE 8080

RUN ["chmod", "+x", "/opt/app/springboot-app-2.jar"] 

ENTRYPOINT ["java" , "-jar" , "springboot-app-2.jar"]
