package com.study.eurekaclienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	//http://localhost:6001/my-config/dev
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
