package com.springcloud.feign.client;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xuwushun on 2016/11/30.
 */
@Service
public class ComputeClientHystrix implements ComputeClient{
	@Override
	public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return -11111;
	}
}
