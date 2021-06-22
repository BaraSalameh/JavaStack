package com.axsosacademy.languages.mvc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsosacademy.languages.mvc.models.Languages;
import com.axsosacademy.languages.mvc.services.LanguagesService;

@Controller
public class LanguagesController {
	private final LanguagesService languagesService;
	
	public LanguagesController(LanguagesService languagesService) {
		this.languagesService = languagesService;
	}
	
	@RequestMapping("/languages")
	public String languages(@ModelAttribute("language") Languages languages, Model model) {
		model.addAttribute("languages", this.languagesService.allLanguages());
		System.out.println(this.languagesService.allLanguages());
		return "languages.jsp";
	}
	
	@RequestMapping(value="/addLanguage", method=RequestMethod.POST)
	public String addBook(@Valid @ModelAttribute("language") Languages languages, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/languages";
		}else {
			this.languagesService.addLanguage(languages);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		this.languagesService.deleteLanguage(id);
		return "redirect:/languages";
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public String updateLanguage(@PathVariable("id") Long id,
			Model model) {
		model.addAttribute("language", this.languagesService.getLanguage(id));
		return "editLanguage.jsp";
	}
	
	@RequestMapping(value="/editLanguage", method=RequestMethod.POST)
	public String updateLanguage(@Valid @ModelAttribute(value="language") Languages laguage, BindingResult bindingResult,
			@RequestParam("name") String name,
			@RequestParam("creator") String creator,
			@RequestParam("version") double version,
			@RequestParam("id") Long id) {
		if(bindingResult.hasErrors()) {
			return "editLanguage.jsp";
		}else {
			this.languagesService.updateLanguage(id,name,creator,version);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.GET)
	public String showLanguage(@PathVariable("id") Long id,
			Model model) {
		model.addAttribute("language", this.languagesService.getLanguage(id));
		return "showLanguage.jsp";
	}
	
}
