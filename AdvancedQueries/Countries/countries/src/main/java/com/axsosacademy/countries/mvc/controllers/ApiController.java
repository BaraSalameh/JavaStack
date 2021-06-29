package com.axsosacademy.countries.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsosacademy.countries.mvc.services.ApiService;

@Controller
public class ApiController {
	private ApiService service;
	
	public ApiController(ApiService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("firstQuestion", this.service.retrieveCountriesThatSpeakSlovene("Slovene"));
		model.addAttribute("secondQuestion", this.service.retrieveCountriesByNumberOfCities());
		model.addAttribute("thirdQuestion", this.service.retrieveCitiesByCountryName("Mexico"));
		model.addAttribute("fourthQuestion", this.service.retrieveCountriesAndCitiesByPercentage());
		model.addAttribute("fifthQuestion", this.service.retrieveCountriesBySurfaceAreaAndPopulation(501, 100000));
		model.addAttribute("sixthQuestion", this.service.retrieveCountriesByGovernmentFormAndSurfaceAreaAndLifeExpectancy("Constitutional Monarchy", 200, 75));
		model.addAttribute("seventhQuestion", this.service.retrieveCountriesAndCitiesByNameAndPopulation("Argentina", "Buenos Aires", 500000));
		model.addAttribute("eighthQuestion", this.service.retrieveAllRegionAndNumberOfCountries());
		return "result.jsp";
	}
}
