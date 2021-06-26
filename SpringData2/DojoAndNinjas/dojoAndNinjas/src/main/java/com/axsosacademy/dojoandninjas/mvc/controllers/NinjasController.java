package com.axsosacademy.dojoandninjas.mvc.controllers;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsosacademy.dojoandninjas.mvc.models.Dojos;
import com.axsosacademy.dojoandninjas.mvc.models.Ninjas;
import com.axsosacademy.dojoandninjas.mvc.services.NinjasService;

@Controller
public class NinjasController {
	private final NinjasService ns;
	
	public NinjasController(NinjasService ns) {
		this.ns = ns;
	}
	
	@RequestMapping(value="/addNewNinja", method=RequestMethod.POST)
	public String addNewNinja(@Valid @ModelAttribute("ninjas") Ninjas ninjas,
			@RequestParam(value="dojo") Dojos dojo,
			@RequestParam(value="firstName") String firstName,
			@RequestParam(value="lastName") String lastName,
			@RequestParam(value="age") int age,
			BindingResult result) {
		System.out.println(dojo);
		if(result.hasErrors()) {
			return "ninja.jsp";
		}else {
			this.ns.createNinja(firstName, lastName, age, dojo);
			return "redirect:/ninjas/new";
		}
		
	}
}
