package com.axsosacademy.dojoandninjas.mvc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsosacademy.dojoandninjas.mvc.models.Dojos;
import com.axsosacademy.dojoandninjas.mvc.models.Ninjas;
import com.axsosacademy.dojoandninjas.mvc.services.DojosService;

@Controller
public class DojosController {
	private final DojosService ds;
	
	public DojosController(DojosService ds) {
		this.ds = ds;
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/dojos/new";
	}
	
	@RequestMapping("/dojos/new")
	public String showDojoPaje(@ModelAttribute(value="dojos") Dojos dojos) {
		return "dojo.jsp";
	}
	
	@RequestMapping(value="/addNewDojo", method=RequestMethod.POST)
	public String addNewDojo(@Valid @ModelAttribute(value="dojos") Dojos dojos,
			@RequestParam(value="name") String name,
			BindingResult result) {
		if(result.hasErrors()) {
			return "dojo.jsp";
		}else {
			this.ds.createDojo(name);
			return "redirect:/dojos/new";
		}
	}
	
	@RequestMapping("/ninjas/new")
	public String showNinjaPaje(@ModelAttribute("ninjas") Ninjas ninjas,
			Model model) {
		model.addAttribute("dojos", this.ds.retrieveDojos());
		return "ninja.jsp";
	}
	
	@RequestMapping("/dojos/{id}")
	public String showDojoNinjas(@PathVariable("id") Long id,
			Model model) {
		model.addAttribute("dojo", this.ds.retrieveDojo(id));
		return "ninjasDojo.jsp";
	}
}
