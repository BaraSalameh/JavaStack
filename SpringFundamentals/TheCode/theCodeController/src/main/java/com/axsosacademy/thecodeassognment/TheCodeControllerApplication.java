package com.axsosacademy.thecodeassognment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SpringBootApplication
@Controller
public class TheCodeControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCodeControllerApplication.class, args);
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/checkCode", method=RequestMethod.POST)
	public String checkCode(@RequestParam(value="code") String code, RedirectAttributes ra) {
		if(code.equals("bushido"))
			return "redirect:/code";
		ra.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}
	
	@RequestMapping(value="/code", method=RequestMethod.GET)
	public String code() {
		return "code.jsp";
	}

}
