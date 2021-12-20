package com.example.demo.service;

import org.springframework.stereotype.Service;
/**
 * 
 * @Service : to Create GreetingService Class 
 *
 */
@Service
public class GreetingService implements IGreetingService {

	@Override
	public String getGreetingById() {
		String message= "Hello World";
		return message;
	}
}
