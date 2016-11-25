package com.springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xuwushun on 2016/11/25.
 */
@RestController
public class ConsumerController {
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(){
		return restTemplate.getForEntity("http://COMPUTE/add?a=10&b=20", String.class).getBody();
	}
}