package com.spring.cloud.bhadri.loadbalancerdoctorportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DoctorPortalController {
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/abc")
	public String getDoctors()
	{
		
		//String url = "http://localhost:9893/allDoctors";
		String url = "http://doctor-portal-ribbon-client/allDoctors";
		String data = restTemplate.getForObject(url, String.class);
		return data;
	}

}
