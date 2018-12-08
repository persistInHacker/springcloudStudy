package com.study.eurekaclienta;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "EUREKA-CLIENT" , 
	fallback = FeignClientInterfaceImpl.class)
public interface FeignClientInterface {

	@RequestMapping("hello")
	public String hello();

	@RequestMapping("test/{id}")
	public String test(@PathVariable("id") Integer id);
	
	
}
