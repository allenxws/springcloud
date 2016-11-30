package com.springcloud.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xuwushun on 2016/11/30.
 */
@Service
public class ConsumerService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "addServiceFallback")
	public String addService() {
		return restTemplate.getForEntity("http://compute/add?a=10&b=20", String.class).getBody();
	}

	public String addServiceFallback() {
		return "error xuwushun";
	}
}
