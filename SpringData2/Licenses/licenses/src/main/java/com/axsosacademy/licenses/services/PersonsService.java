package com.axsosacademy.licenses.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsosacademy.licenses.models.Persons;
import com.axsosacademy.licenses.repositories.PersonsRepository;


@Service
public class PersonsService {
	private final PersonsRepository pr;
	
	public PersonsService(PersonsRepository pr) {
		this.pr = pr;
	}
	
	public void addNewPerson(String firstName, String lastName) {
		Persons p = new Persons(firstName, lastName);
		this.pr.save(p);
	}
	
	public List<Persons> retrievePersons(){
		return this.pr.findAll();
	}
	
	public Persons retrievePerson(Long id) {
		Optional<Persons> optional = this.pr.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
}
