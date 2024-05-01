FROM amazoncorretto:17-alpine

ARG BASE_PATH=development/java/diceroller-server/
ARG MVN_FOLDER_PATH=$BASE_PATH".mvn"
ARG MVN_CMD_PATH=$BASE_PATH"mvnw"
ARG POM_PATH=$BASE_PATH"pom.xml"

WORKDIR /app
COPY .m2/settings.xml /root/.m2/
COPY $MVN_FOLDER_PATH ./.mvn
COPY $MVN_CMD_PATH $POM_PATH ./

RUN ./mvnw compile

COPY development/java/diceroller-server/src ./src

CMD ["./mvnw", "spring-boot:run"]