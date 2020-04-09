package com.spring.cloud.bhadri.loadbalancerdoctorportalwitheureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DoctorPortalController {
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/def")
	public String getDoctors()
	{
		
		
		
		String url = "http://DOCTOR-SERVICE/allDoctors"; // With Eureka Server
		String data = restTemplate.getForObject(url, String.class);
		return data;
	}
	
	

}