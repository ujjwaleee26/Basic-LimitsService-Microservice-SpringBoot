package com.microservices.limitsmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsmicroservice.bean.Limits;
import com.microservices.limitsmicroservice.configuration.Configuration;

@RestController
public class LimitsController 
{
	 @Autowired
	 private Configuration configuration;
	 
     @GetMapping("/limits")
     public Limits retrieveLimits()
     {
    	 //return newLimits(2,100);
    	 return new Limits(configuration.getMinimum(),configuration.getMaximum());
     }
}
