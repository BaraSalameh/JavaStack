package com.axsosacademy.counter;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class CounterApplication {
	private static int counter;
	
	public CounterApplication() {
		counter = 0;
	}
	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
	
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(HttpSession session) {
		counter++;
		session.setAttribute("visits", counter);
		return "/index.jsp";
	}
	
	@RequestMapping(value="/counter", method=RequestMethod.GET)
	public String counter(Model model, HttpSession session) {
		model.addAttribute("visits", session.getAttribute("visits"));
		return "counter.jsp";
	}
	@RequestMapping(value="/thirdPage", method=RequestMethod.GET)
	public String thirdPage(HttpSession session) {
		counter+=2;
		session.setAttribute("visits", counter);
		return "/thirdPage.jsp";
	}

}
