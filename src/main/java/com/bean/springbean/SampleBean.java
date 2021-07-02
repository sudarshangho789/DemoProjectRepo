package com.bean.springbean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class SampleBean {

	@Bean
	public String getBean() {

		return "This is Inject Bean..!!";
	}
}
