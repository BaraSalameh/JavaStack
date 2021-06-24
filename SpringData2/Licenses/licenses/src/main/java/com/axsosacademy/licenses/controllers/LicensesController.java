package com.axsosacademy.licenses.controllers;

import java.sql.Date;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsosacademy.licenses.models.Licenses;
import com.axsosacademy.licenses.models.Persons;
import com.axsosacademy.licenses.services.LicensesService;

@Controller
public class LicensesController {
	private final LicensesService ls;
	
	public LicensesController(LicensesService ls) {
		this.ls = ls;
	}
	
	@RequestMapping(value="/addNewLicense", method=RequestMethod.POST)
	public String addNewLicence(@Valid @ModelAttribute("licenses") Licenses l,
			@RequestParam(value="person") Persons person,
			@RequestParam(value="state") String state,
			@RequestParam(value="expirationDate") Date expirationDate,
			BindingResult result) {
		this.ls.addNewLicense(expirationDate, state, person);
		return "redirect:/licenses/new";
	}
}
