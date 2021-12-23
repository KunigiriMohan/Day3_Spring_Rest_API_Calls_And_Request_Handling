package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
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
 * @PuttMapping : to update values in repository
 *
 */
@RestController
@RequestMapping("/greeting/")
public class GreetController {
	public static final String template = "Hello, %s";
	
	@Autowired
	private IGreetingService greetingService;
		
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
	
	/**
	 * API for getting all values in Repository
	 * @return : returns all Greeting messages
	 */
	@GetMapping("/get/all")
	public List<Greeting> grettingAll(){
		return greetingService.getGreetingALL();
	}
	/**
	 * API for delete value by Id
	 * @param id
	 * @return : list of updated Greetings after deleting.
	 */
	@DeleteMapping("/delete/id/{id}")
	public List<Greeting> deleteGreeting(@PathVariable Long id){
		return greetingService.deletebyID(id);
	}
	/**
	 * API for updating value by Id
	 * @param greetingObj
	 * @return : update Greeting message.
	 */
	@PutMapping("/update/")
	public Greeting update(@RequestBody Greeting greetingObj){
		return greetingService.saveUpdate(greetingObj);
	}
}
