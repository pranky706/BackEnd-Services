FROM maven:3.6.1-jdk-11
WORKDIR /app
VOLUME /tmp
COPY src ./src
COPY pom.xml .
RUN mvn package
ADD /app/target/BackEnd-Services-1.0.SANPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]