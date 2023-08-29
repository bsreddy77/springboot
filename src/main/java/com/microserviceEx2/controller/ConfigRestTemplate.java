package com.microserviceEx2.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigRestTemplate {

	@Bean
	RestTemplate getObject(){
		RestTemplate rt =new RestTemplate();
		return rt;
		
	}
}
