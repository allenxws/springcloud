package com.springcloud.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xuwushun on 2016/11/29.
 */
@FeignClient(value = "compute", fallback = ComputeClientHystrix.class)
public interface ComputeClient {
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
}
