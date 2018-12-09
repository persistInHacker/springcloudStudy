package com.study.eurekaclienta;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${profile}")
	private String demo;
	
	/**
	 * 测试限流
	 * @return
	 * @throws InterruptedException 
	 */
	@RequestMapping("/hello")
	public String hello() throws InterruptedException {
		return demo;
	}
}
