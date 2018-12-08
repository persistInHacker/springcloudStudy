package com.study.eurekaclienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class EurekaAdminApplication {

	//localhost:2003  监控页面
	public static void main(String[] args) {
		SpringApplication.run(EurekaAdminApplication.class, args);
	}
}
