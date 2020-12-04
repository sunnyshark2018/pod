FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD sentinel-dashboard-1.8.0.jar sentinel-dashboard.jar
CMD java ${JAVA_OPTS} -jar sentinel-dashboard.jar
EXPOSE 8080
