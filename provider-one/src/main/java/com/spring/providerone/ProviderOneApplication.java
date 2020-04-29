package com.spring.providerone;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.spring.providerone.*.mapper")
public class ProviderOneApplication {



	public static void main(String[] args) {
		SpringApplication.run(ProviderOneApplication.class, args);
		System.out.println("providerOne服务端启动成功!");
	}

}
