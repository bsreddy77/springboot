package com.microserviceEx2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController2 {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	 @GetMapping("/message1")
     public String get() {
		
		String path ="http://localhost:1991/message";
		ResponseEntity<String> memssage=restTemplate.getForEntity(path, String.class);
		
		return memssage.getBody();
	}

}
