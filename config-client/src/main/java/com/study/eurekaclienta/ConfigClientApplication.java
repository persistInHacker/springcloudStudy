package com.study.eurekaclienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClientApplication {

	//http://localhost:6001/my-config/dev
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
