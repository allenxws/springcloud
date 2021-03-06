package com.springcloud.consumer.controller;

import com.springcloud.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuwushun on 2016/11/25.
 */
@RestController
public class ConsumerController {
	@Autowired
	ConsumerService consumerService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return consumerService.addService();
	}
}
