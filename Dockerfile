FROM ubuntu
RUN apt update
RUN apt -y install default-jdk
RUN apt -y install maven
WORKDIR /home/myapp
#COPY pom.xml ./ #to copy file
#COPY mvnw /home/myapp #to copy file
COPY . ./
COPY Hello.java /home/app
RUN javac Hello.java
RUN java Hello
RUN mvn springboot:run
EXPOSE 8080:9090
