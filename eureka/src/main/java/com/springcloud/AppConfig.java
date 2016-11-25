package com.springcloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Created by xuwushun on 2016/9/27.
 */
@Configuration
@ComponentScan(basePackages = "com.springcloud")
@EnableWebMvc
public class AppConfig {
	@Bean
	public ScheduledThreadPoolExecutor scheduledThreadPoolExecutor() {
		return new ScheduledThreadPoolExecutor(10);
	}

	@Bean
	public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
		return new ThreadPoolTaskScheduler();
	}
}
