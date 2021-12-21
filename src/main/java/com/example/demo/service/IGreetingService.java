package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Greeting;
import com.example.demo.model.User;

/**
 * 
 * Creating IGreeting Interface to perform operations in service layer
 *
 */
public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(long Id);
	List<Greeting> getGreetingALL();
}
