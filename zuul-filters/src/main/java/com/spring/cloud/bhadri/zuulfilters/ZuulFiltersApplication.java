package com.spring.cloud.bhadri.zuulfilters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulFiltersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulFiltersApplication.class, args);
	}

}
