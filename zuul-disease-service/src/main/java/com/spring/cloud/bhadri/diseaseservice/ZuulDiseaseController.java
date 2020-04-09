package com.spring.cloud.bhadri.diseaseservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulDiseaseController {

	@GetMapping("/diseases")
	public String getDiseases()
	{
		return "Zuul List of Diseases";
	}
	
}
