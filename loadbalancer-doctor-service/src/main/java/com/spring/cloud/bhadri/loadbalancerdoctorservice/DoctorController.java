package com.spring.cloud.bhadri.loadbalancerdoctorservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

	@Value("${spring.application.name: no name}")
	private String appName;
	
	@Value("${server.port: no port}")
	private String port;
	
	private int counter;
	
	@GetMapping("/allDoctors")
	public String doctors()
	{
		return "List of all doctors from : " + port + "and count is : " + ++counter;
	}
	
}
