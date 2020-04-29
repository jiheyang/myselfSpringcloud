package com.spring.consumerribben;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ConsumerRibbenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerRibbenApplication.class, args);
		System.out.println("consumerRibben负载均衡，策略默认为轮询启动成功");
	}

	/**
	 * 开启负载均衡
	 * @return
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
