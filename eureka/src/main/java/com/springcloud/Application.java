package com.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by xuwushun on 2016/11/25.
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
}
