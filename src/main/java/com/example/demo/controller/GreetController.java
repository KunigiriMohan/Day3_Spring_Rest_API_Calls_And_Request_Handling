package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Greeting;
import com.example.demo.model.User;
import com.example.demo.service.IGreetingService;


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
	
	@Autowired
	private IGreetingService greetingService;
	
	@PostMapping("/greeting/post")
	public Greeting greeting(@RequestBody User user) {
		return greetingService.addGreeting(user);
	}
}
