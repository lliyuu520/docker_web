FROM java:8
VOLUME /tmp
MAINTAINER llliyuu520 lliyuu520@gmail.com
EXPOSE 8094
ADD /target/docker_web-0.0.1.jar /docker_web/docker_web-0.0.1.jar
WORKDIR /docker_web
CMD   java -Djava.security.egd=file:/dev/.urandom -jar docker_web-0.0.1.jar