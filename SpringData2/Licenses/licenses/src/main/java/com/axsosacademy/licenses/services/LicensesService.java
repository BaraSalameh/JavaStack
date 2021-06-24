package com.axsosacademy.licenses.services;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.axsosacademy.licenses.models.Licenses;
import com.axsosacademy.licenses.models.Persons;
import com.axsosacademy.licenses.repositories.LicensesRepository;

@Service
public class LicensesService {
	private final LicensesRepository lr;
	
	public LicensesService(LicensesRepository lr) {
		this.lr = lr;
	}
	
	public void addNewLicense(Date expirationDate, String state, Persons person) {
		Licenses license = new Licenses(expirationDate, state, person);
		this.lr.save(license);
	}
}
