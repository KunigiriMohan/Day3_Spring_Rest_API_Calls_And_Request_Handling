package com.example.demo.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Greeting;
import com.example.demo.model.User;
import com.example.demo.Repository.GreatingRepository;
/**
 * 
 * @Service : to Create GreetingService Class
 * @Autowired : to crete new object of class 
 * @Override : overriding method
 *
 */
@Service
public class GreetingService implements IGreetingService {
	public static final String template = "Hello  %s";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private GreatingRepository greetingRepository;
	/**
	 * method to create Greeting message and save in Local Repository.
	 */
	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template, (user.toString().isEmpty()) ? " World " : user.toString());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
	}

	/**
	 * method to Greeting message by ID
	 */
	@Override
	public Greeting getGreetingById(long Id) {
		return greetingRepository.findById(Id).get();
	}

	/**
	 * method to get all user method
	 */
	@Override
	public List<Greeting> getGreetingALL() {
		return greetingRepository.findAll();
	}

	/**
	 * method to update Greeting message
	 */
	@Override
	public Greeting saveUpdate(Greeting greetingObj) {
		return greetingRepository.save(greetingObj);
	}

	/**
	 * method to Delete Greeting message by ID
	 */

	@Override
	public List<Greeting> deletebyID(Long Id) {
		greetingRepository.deleteById(Id);
		return greetingRepository.findAll();
	}	
}
