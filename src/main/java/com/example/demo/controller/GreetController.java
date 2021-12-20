package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Greeting;


/**
 * @RestController : Rest Controller Class of Application.
 * @GetMapping : to define path in URL to particular API.
 * @RequestMapping : to define path in URL to particular API.
 * @RequestMethod : to define method.
 * @RequestParam : Requesting Parameter in URL.
 * @PathVariable : to get value from URL of a Variable.
 *
 */
@RestController
public class GreetController {
	public static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet() , String.format(template, name));
	}
	
	@RequestMapping(value= {"/query"}, method = RequestMethod.GET)
	public Greeting greeting1(@RequestParam(value = "name") String name) {
		return new Greeting(counter.incrementAndGet() , String.format(template, name));
	}
	
	@GetMapping ("/param/{name}")
	public Greeting greeting2(@PathVariable String name) {
		return new Greeting(counter.incrementAndGet() , String.format(template, name));
		
	}
}
