FROM openjdk:17-alpine
COPY ./target/pc2-u20201c069-0.0.1-SNAPSHOT.jar /
RUN sh -c 'touch pc2-u20201c069-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar", "/pc2-u20201c069-0.0.1-SNAPSHOT.jar"]
RUN chmod +x /pc2-u20201c069-0.0.1-SNAPSHOT.jar