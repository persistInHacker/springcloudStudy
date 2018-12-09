package com.study.eurekaclienta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaClientAApplicationTests {
	
	/**
	 * 测试限流，20个线程同时请求一个接口，其中只有10个可以使用，其他接口则全部被限制访问，此值需配置
	 */
	@Test
	public void contextLoads() {
	}
	
	
	
	

}
