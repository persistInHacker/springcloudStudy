package com.study.eurekaclienta;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class FeignClientInterfaceImpl implements FeignClientInterface {

	@Override
	public String hello() {
		return "error";
	}

	@Override
	public String test(Integer id) {
		return "test error";
	}

}
