package com.example.demo.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.model.Greeting;
import com.example.demo.model.User;
/**
 * 
 * @Service : to Create GreetingService Class 
 *
 */
@Service
public class GreetingService implements IGreetingService {
	public static final String template = "Hello  %s";
	private final AtomicLong counter = new AtomicLong();
	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template, (user.toString().isEmpty()) ? " World " : user.toString());
		return (new Greeting(counter.incrementAndGet(),message));
	}
		
}
