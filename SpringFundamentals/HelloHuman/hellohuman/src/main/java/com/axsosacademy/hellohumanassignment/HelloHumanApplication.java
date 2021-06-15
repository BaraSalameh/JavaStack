package com.axsosacademy.hellohumanassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(@RequestParam(value="name" , required=false) String firstName,
			@RequestParam(value="lastname" , required=false) String lastName) {
		if(firstName == null)
			return "Hello Human!";
		else if(lastName == null)
			return "Hello "+firstName+"!";
		else
			return "Hello "+firstName+" "+lastName+"!";
	}

}
