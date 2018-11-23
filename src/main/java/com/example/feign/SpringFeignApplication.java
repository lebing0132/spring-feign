package com.example.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.example.feign.service"})
@EnableEurekaClient
public class SpringFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignApplication.class, args);
	}
}
