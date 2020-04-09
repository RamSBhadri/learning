package com.spring.cloud.bhadri.doctorportal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class Controller {
	
	@Autowired
	RestTemplateBuilder rtBuilder;
	
	@Autowired
	EurekaClient eurekaClient;
	
	/*@Autowired
	DiscoveryClient discoveryClient;*/
	
	@GetMapping("doctorportal/doctors")
	public String getDoctors()
	{
		// It picks the next instance in round robin fassion. 
		InstanceInfo doctorServiceInstance = eurekaClient.getNextServerFromEureka("doctor-service", false);
		
		String baseUrl = doctorServiceInstance.getHomePageUrl(); // http://localhost:9822
		
		
		/*List<ServiceInstance> instances = discoveryClient.getInstances("doctor-service");
		baseUrl = instances.get(0).getUri().toString();
		*/
		
		
		RestTemplate restTemplate = rtBuilder.build();
		String doctorsList = restTemplate.getForObject(baseUrl+"/location", String.class);
		
		return doctorsList;
	}

}
