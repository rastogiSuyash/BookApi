#base image

FROM openjdk:11
Label maintener="SuyashRastogi"
ADD target/BookRestApi-0.0.1-SNAPSHOT.jar bookrestapi-docker.jar
ENTRYPOINT ["java","-jar","/bookrestapi-docker.jar"]