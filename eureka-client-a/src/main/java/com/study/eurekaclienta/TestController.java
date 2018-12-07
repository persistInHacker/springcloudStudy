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
		Thread.sleep(500);
		return "hello1";
	}
	/**
	 * 限流熔断
	 * @param id
	 * @return
	 */
	@RequestMapping("/test/{id}")
	public String test(@PathVariable Integer id) {
		System.out.println("-----------------客户端aaaaa test---------------");
		if(id == 10)
			throw new NullPointerException("hello111");
		return "test aa";
	}
}
