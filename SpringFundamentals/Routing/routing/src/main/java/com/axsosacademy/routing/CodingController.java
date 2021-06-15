package com.axsosacademy.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodingController {

	public static void main(String[] args) {
		SpringApplication.run(CodingController.class, args);
	}
	@RequestMapping(value="/coding", method=RequestMethod.GET)
	public String coding() {
		return "Hello Coding Dojo!";	
	}
	
	@RequestMapping(value="/coding/python" , method=RequestMethod.GET)
	public String codingPython() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping(value="/coding/java" , method=RequestMethod.GET)
	public String codingJava() {
		return "Java/Spring is better!";
	}
}
