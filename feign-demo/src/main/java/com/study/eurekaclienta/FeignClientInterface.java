package com.study.eurekaclienta;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "EUREKA-CLIENT")
public interface FeignClientInterface {

	@RequestMapping("hello")
	public String hello();
	
	
}
