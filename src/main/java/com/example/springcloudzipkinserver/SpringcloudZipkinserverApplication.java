package com.example.springcloudzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class SpringcloudZipkinserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZipkinserverApplication.class, args);
	}

}

