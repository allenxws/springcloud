package com.springcloud.compute.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuwushun on 2016/11/25.
 */
@RestController
public class ComputeController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	DiscoveryClient discoveryClient;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Integer add(@RequestParam Integer a, @RequestParam Integer b){
		ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
		Integer r = a + b;
		logger.info("/add, host:" + serviceInstance.getHost() + ", service_id:" + serviceInstance.getServiceId() + ", result:" + r);
		return r;
	}
}
