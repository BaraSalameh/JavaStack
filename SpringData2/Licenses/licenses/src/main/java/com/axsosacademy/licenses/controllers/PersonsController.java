package com.axsosacademy.licenses.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsosacademy.licenses.models.Licenses;
import com.axsosacademy.licenses.models.Persons;
import com.axsosacademy.licenses.services.PersonsService;

@Controller
public class PersonsController {
	private final PersonsService ps;
	
	public PersonsController(PersonsService ps) {
		this.ps = ps;
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/persons/new";
	}
	
	@RequestMapping("/persons/new")
	public String showPerson(@ModelAttribute("persons") Persons p) {
		return "person.jsp";
	}
	
	@RequestMapping(value="/addNewPerson", method=RequestMethod.POST)
	public String addNewPerson(@Valid @ModelAttribute("persons") Persons p,
			@RequestParam(value="firstName") String firstName,
			@RequestParam(value="lastName") String lastName,
			BindingResult result) {
		if(result.hasErrors()) {
			return "person.jsp";
		}else {
			this.ps.addNewPerson(firstName, lastName);
			return "redirect:/persons/new";
		}
	}
	
	@RequestMapping("/licenses/new")
	public String addNewLicense(@ModelAttribute("licenses") Licenses l,
			Model model) {
		model.addAttribute("persons", this.ps.retrievePersons());
		return "license.jsp";
	}
	
	@RequestMapping("/profile/{personId}")
	public String personProfile(@PathVariable("personId") Long id,
			Model model) {
		model.addAttribute("person", this.ps.retrievePerson(id));
		return "profile.jsp";
	}
}
