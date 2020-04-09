package com.spring.cloud.bhadri.loadbalancerdoctorportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RibbonClient(name="doctor-portal-ribbon-client",configuration=com.spring.cloud.bhadri.configuration.MyRibbonConfiguration.class)
public class LoadbalancerDoctorPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadbalancerDoctorPortalApplication.class, args);
	}

	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
