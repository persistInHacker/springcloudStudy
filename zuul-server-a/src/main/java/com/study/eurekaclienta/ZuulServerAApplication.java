package com.study.eurekaclienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableEurekaClient
//@EnableZuulServer
@EnableZuulProxy
public class ZuulServerAApplication {

	//http://localhost:5001/eureka-client/test/1
	public static void main(String[] args) {
		SpringApplication.run(ZuulServerAApplication.class, args);
	}
}
