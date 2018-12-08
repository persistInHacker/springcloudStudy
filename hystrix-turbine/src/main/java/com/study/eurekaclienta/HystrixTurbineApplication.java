package com.study.eurekaclienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableTurbine
public class HystrixTurbineApplication {

	//http://localhost:4003/hystrix 监控主页
	//http://localhost:4003/turbine.stream 主页中输入的URL
	public static void main(String[] args) {
		SpringApplication.run(HystrixTurbineApplication.class, args);
	}
	
	
}
