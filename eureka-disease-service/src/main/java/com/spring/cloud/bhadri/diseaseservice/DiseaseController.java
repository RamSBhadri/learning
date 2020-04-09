package com.spring.cloud.bhadri.diseaseservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiseaseController {
	
	@Value("${spring.application.name: no name}")
	private String appName;
	
	@Value("${server.port: no port}")
	private String port;
	
	@GetMapping("/diseases")
	public String doctors()
	{
		return "List of Disaeses";
	}
	
	@GetMapping("/location")
	public String getDiseaseServiceLocation()
	{
		return appName + ":" + port;
	}

}
