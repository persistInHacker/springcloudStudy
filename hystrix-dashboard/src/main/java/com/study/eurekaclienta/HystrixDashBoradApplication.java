package com.study.eurekaclienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableHystrix
public class HystrixDashBoradApplication {


	//http://localhost:4002/hystrix 监控主页
	//http://localhost:4002/hystrix.stream 主页中输入的URL
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashBoradApplication.class, args);
	}
}
