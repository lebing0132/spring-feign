package com.example.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.service.FeignZuulFindClinet;
import com.example.feign.service.SpringDemoFeignService;

@RestController
public class FeignController {
	
	@Autowired
	private SpringDemoFeignService springDemoFeignService;
	
	@Autowired
	private FeignZuulFindClinet feignZuulFindClinet;
	
	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String feign() {
		return springDemoFeignService.hello();
	}
	
	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public String feignZuul() {
		return feignZuulFindClinet.hello();
	}

}
