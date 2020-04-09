package com.spring.cloud.bhadri.loadbalancerdoctorserviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoadbalancerDoctorServiceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadbalancerDoctorServiceEurekaApplication.class, args);
	}

}
