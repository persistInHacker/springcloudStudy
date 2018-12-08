package com.study.eurekaclienta;

import java.util.concurrent.CountDownLatch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaClientAApplicationTests {
	
	private CountDownLatch count = new CountDownLatch(20);
	private RestTemplate rest = new RestTemplate();
	
	/**
	 * 测试限流，20个线程同时请求一个接口，其中只有10个可以使用，其他接口则全部被限制访问，此值需配置
	 */
	@Test
	public void contextLoads() {
		for (int i = 0; i <20 ; i++) {
			doSomeThring();
			count.countDown();
		}
		System.out.println("end...............");
	}
	
	
	

	private void doSomeThring() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				String result = rest.getForObject("http://localhost:4001/hello", String.class);
				System.out.println(result);
			}
		}).start();
	}
	
	

}
