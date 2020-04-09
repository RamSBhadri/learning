package com.spring.cloud.bhadri.loadbalancereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LoadbalancerEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadbalancerEurekaServerApplication.class, args);
	}

}
