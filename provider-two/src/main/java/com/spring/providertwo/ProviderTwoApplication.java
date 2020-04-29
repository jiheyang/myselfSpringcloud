package com.spring.providertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProviderTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderTwoApplication.class, args);
		System.out.println("providerTwo服务端启动成功!");
	}

}
