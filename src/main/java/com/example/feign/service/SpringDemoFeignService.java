package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.feign.service.impl.FallbackSpringDemoFeignService;

@FeignClient(value = "SERVICE-DEMO-CLIENT1", fallback = FallbackSpringDemoFeignService.class)
public interface SpringDemoFeignService {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello();

}
