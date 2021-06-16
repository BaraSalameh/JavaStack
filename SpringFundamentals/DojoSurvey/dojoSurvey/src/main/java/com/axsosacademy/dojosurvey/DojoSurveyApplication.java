package com.axsosacademy.dojosurvey;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@Controller
public class DojoSurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojoSurveyApplication.class, args);
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/checkForm", method=RequestMethod.POST)
	public String checkForm(@RequestParam(value="name") String name,
			@RequestParam(value="dojoLocation") String dojoLocation,
			@RequestParam(value="favoriteLanguage") String favoriteLanguage,
			@RequestParam(value="comment") String comment,
			HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("dojoLocation", dojoLocation);
		session.setAttribute("favoriteLanguage", favoriteLanguage);
		session.setAttribute("comment", comment);
		return "redirect:result";
	}
	
	@RequestMapping(value="/result", method=RequestMethod.GET)
	public String result(Model model, HttpSession session) {
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("dojoLocation", session.getAttribute("dojoLocation"));
		model.addAttribute("favoriteLanguage", session.getAttribute("favoriteLanguage"));
		model.addAttribute("comment", session.getAttribute("comment"));
		return "result.jsp";
	}
}
