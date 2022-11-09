#docker file for backend spring boot
FROM openjdk:8
EXPOSE 8080
ADD /target/springBackend.jar springBackend.jar 
ENTRYPOINT ["java","-jar","/springBackend.jar"]
