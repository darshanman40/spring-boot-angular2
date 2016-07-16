package io.abnd.rest;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;


import io.abnd.entity.Greeting;
import io.abnd.repository.GreetRepository;

@RestController
public class GreetingController {
	
	@Autowired
	private GreetRepository greetRepository;
	
	@RequestMapping(value="/greeting",method=RequestMethod.GET)
	@ResponseBody
	public List<Greeting> greeting(){
		List<Greeting> greetings = new ArrayList<Greeting>();
		greetRepository.findAll().forEach(e->greetings.add(e));
		return greetings;
	}
	
}
