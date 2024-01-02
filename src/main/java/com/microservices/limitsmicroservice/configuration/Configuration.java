package com.microservices.limitsmicroservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties("limits-service")
@Component
public class Configuration 
{
	private int minimum;
    private int maximum;
}
