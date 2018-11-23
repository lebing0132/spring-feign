package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVICE-ZUUL")
public interface FeignZuulFindClinet {
	
	@RequestMapping(value = "/eureka-client/hello", method = RequestMethod.GET)
    String hello();

}
