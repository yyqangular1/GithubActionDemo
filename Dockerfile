# 基础镜像
#FROM java:8-jre
FROM apache/skywalking-java-agent:8.5.0-jdk8
MAINTAINER ncit.sol <yanqing.yang@nttdata.com>

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo "Asia/Shanghai" > /etc/timezone

# 服务名称
ENV SW_AGENT_NAME GithubActionDemo
ENV JAVA_OPTS "-Xms256m -Xmx256m -Xmn64m"

# SkyWalking的服务端地址
# ENV SW_AGENT_COLLECTOR_BACKEND_SERVICES 192.168.127.199:32599

ADD ./target/GithubActionDemo.jar /app/
CMD java -jar $JAVA_OPTS /app/GithubActionDemo.jar

EXPOSE 7701
