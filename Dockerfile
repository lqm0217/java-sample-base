FROM openjdk:8
MAINTAINER qiming.lu
LABEL app="sample" version="0.0.1" by="qiming.lu"
COPY ./target/sample-0.0.1-SNAPSHOT.jar sample.jar
#CMD chmod 777 sample.jar
ENTRYPOINT ["java","-jar","sample.jar","--spring.profiles.active=dev"]
