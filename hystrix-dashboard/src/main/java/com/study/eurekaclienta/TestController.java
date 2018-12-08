package com.study.eurekaclienta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


	@Autowired
	private FeignClientInterface feignClientInterface;
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("------------熔断器--------------");
		return  feignClientInterface.hello();
	}

	
	@RequestMapping("/test/{id}")
	public String test(@PathVariable Integer id) {
		System.out.println("------------熔断器 test --------------" + id);
		return  feignClientInterface.test(id);
	}
	
	
}
