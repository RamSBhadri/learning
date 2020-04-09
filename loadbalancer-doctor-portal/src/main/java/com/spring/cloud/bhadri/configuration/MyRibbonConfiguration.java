package com.spring.cloud.bhadri.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MyRibbonConfiguration {
	
	@Bean
	public IRule irule()
	{
		return new RandomRule();
	}
	
	@Bean
	public IPing iping()
	{
		return new PingUrl(false,"http:dgvaghjd.com");
	}

}
