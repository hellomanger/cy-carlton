package com.carlton.cycarltoneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CyCarltonEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CyCarltonEurekaApplication.class, args);
	}
}
