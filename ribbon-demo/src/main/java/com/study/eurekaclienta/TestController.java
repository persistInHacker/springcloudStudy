package com.study.eurekaclienta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@GetMapping("/hello")
	public String hello() {
		ServiceInstance serviceInstance = this.loadBalancerClient.choose("EUREKA-CLIENT");
		// 打印当前选择的是哪个节点
		System.out.println("serviceId : " + serviceInstance.getServiceId());
		System.out.println("hoost : " + serviceInstance.getHost());
		System.out.println("port : " + serviceInstance.getPort());
		System.out.println("============================================================");
		return  this.restTemplate.getForObject("http://EUREKA-CLIENT/hello", String.class);
	}
	
	
}
