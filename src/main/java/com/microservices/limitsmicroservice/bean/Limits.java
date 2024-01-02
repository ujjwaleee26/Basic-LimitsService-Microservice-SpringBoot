package com.microservices.limitsmicroservice.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Limits 
{
    private int minimum;
    private int maximum;
}

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.cloud.config.server.EnableConfigServer;

// @EnableConfigServer
// @SpringBootApplication
// public class SpringCloudConfigServerApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
// 	}

// }

// spring.application.name=spring-cloud-config-server
// server.port=8888
// spring.cloud.config.server.git.uri=file:///Users/ujjwalsinha/git-localconfig-repo
