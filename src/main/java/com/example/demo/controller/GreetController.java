package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
 * @GetMapping : to map URL to Particular API
 *
 */
@RestController
@RequestMapping("/greeting")
public class GreetController {
	public static final String template = "Hello, %s";
	
	@Autowired
	private IGreetingService greetingService;
	
	/**
	 * API for Adding message to Repository
	 * @param user
	 * @return
	 */
	/**
	 * API to Show Greeting Message by sending name as a parameter
	 * @param name
	 * @return : Json object with message id and message.
	 */
	@GetMapping("/getmessage/")
	public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet() , String.format(template, name));
	}
	
	/**
	 * API to show Greeting message by sending name as pathvariable
	 * @param name
	 * @return : Greeting message in Json with id and message.
	 */
	
	@GetMapping ("/param/{name}")
	public Greeting greeting2(@PathVariable String name) {
		return new Greeting(counter.incrementAndGet() , String.format(template, name));	
	}
	
	/**
	 * API for Adding message to Repository
	 * @param user
	 * @return creted user Object
	 */
	@PostMapping("/post")
	public Greeting greeting(@RequestBody User user) {
		return greetingService.addGreeting(user);
	}
	
	/**
	 * API for returning message by Id
	 * @param id
	 * @return : Greeting message of particular id
	 */
	@GetMapping("/get/Id/{id}")
	public Greeting gretting2(@PathVariable Long id){
		return greetingService.getGreetingById(id);
	}
}
