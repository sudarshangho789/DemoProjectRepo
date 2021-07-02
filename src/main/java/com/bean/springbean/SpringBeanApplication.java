package com.bean.springbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanApplication.class, args);
		System.out.println("Bean Started...!!!");
	}

}
