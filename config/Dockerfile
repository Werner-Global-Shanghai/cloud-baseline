FROM java:8-jre
MAINTAINER Jerry Jiang <jjiang@werner.com>

ADD ./target/config.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config.jar"]

HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://jerry.wernerds.net:8888/health || exit 1

EXPOSE 8888