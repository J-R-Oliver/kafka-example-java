FROM openjdk:17-alpine

LABEL application="kafka-example-java"
LABEL author="James Oliver"
LABEL description="Example backend service utilising Apache Kafka written in Java."
LABEL build-date=$BUILD_DATE

RUN adduser -D docker

USER docker

EXPOSE 8080
ENV PORT=8080
ARG WORKDIR=/app

WORKDIR ${WORKDIR}

COPY --chown=docker --chmod=500 HealthCheck.java ./
COPY --chown=docker --chmod=500 target/kafka-example-java-*-shaded.jar ./kafka-example-java.jar

HEALTHCHECK --interval=25s --timeout=3s --retries=2 CMD ["java", "HealthCheck.java", "||", "exit", "1"]

ENTRYPOINT [ "java", "-jar", "kafka-example-java.jar" ]
