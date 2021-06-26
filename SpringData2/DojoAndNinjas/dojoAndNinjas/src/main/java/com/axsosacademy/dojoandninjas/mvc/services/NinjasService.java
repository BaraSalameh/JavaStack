package com.axsosacademy.dojoandninjas.mvc.services;

import org.springframework.stereotype.Service;

import com.axsosacademy.dojoandninjas.mvc.models.Dojos;
import com.axsosacademy.dojoandninjas.mvc.models.Ninjas;
import com.axsosacademy.dojoandninjas.mvc.repositories.NinjasRepository;

@Service
public class NinjasService {
	private final NinjasRepository nr;
	
	public NinjasService(NinjasRepository nr) {
		this.nr = nr;
	}
	
	public void createNinja(String firstName, String lastName, int age, Dojos dojo) {
		Ninjas ninja = new Ninjas(firstName, lastName, age, dojo);
		this.nr.save(ninja);
	}
}
