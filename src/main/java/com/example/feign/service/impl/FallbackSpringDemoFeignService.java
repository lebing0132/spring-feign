package com.example.feign.service.impl;

import org.springframework.stereotype.Component;

import com.example.feign.service.SpringDemoFeignService;

@Component
public class FallbackSpringDemoFeignService implements SpringDemoFeignService{
	
	@Override
	public String hello() {
		System.out.println("rush fallback-hello");
		return "rush fallback-hello";
	}

}
