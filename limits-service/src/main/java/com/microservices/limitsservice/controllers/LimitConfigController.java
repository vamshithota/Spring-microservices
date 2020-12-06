package com.microservices.limitsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.configurations.LimitsBean;
import com.microservices.limitsservice.configurations.LimitsConfiguration;

@RestController
public class LimitConfigController {

	@Autowired
	LimitsConfiguration limitsConfiguration;
	
	@GetMapping("/api/v1/limits-data")
	public LimitsBean getConfigData() {
		return new LimitsBean(limitsConfiguration.getMinimum(), limitsConfiguration.getMaximum());
	}
}
