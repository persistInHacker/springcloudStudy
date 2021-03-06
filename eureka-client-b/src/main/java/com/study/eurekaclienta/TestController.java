package com.study.eurekaclienta;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	/**
	 * 测试限流
	 * @return
	 * @throws InterruptedException 
	 */
	@RequestMapping("/hello")
	public String hello() throws InterruptedException {
		System.out.println("-----------------客户端aaaaa---------------");
		return "hello1";
	}
	
	@RequestMapping("/test/{id}")
	public String test(@PathVariable Integer id) {
		System.out.println("-----------------客户端bbbbb test---------------");
		if(id == 10)
			throw new NullPointerException("hello111");
		return "test bb";
	}
}
