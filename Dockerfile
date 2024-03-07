FROM eclipse-temurin:17
COPY target/gt.jar webapp.jar
CMD [ "java","-jar","webapp.jar" ]