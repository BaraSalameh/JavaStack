package com.axsosacademy.dojoandninjas.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsosacademy.dojoandninjas.mvc.models.Dojos;
import com.axsosacademy.dojoandninjas.mvc.repositories.DojosRepository;

@Service
public class DojosService {
	private final DojosRepository dr;
	
	public DojosService(DojosRepository dr) {
		this.dr = dr;
	}
	
	public void createDojo(String name) {
		Dojos dojo = new Dojos(name);
		this.dr.save(dojo);
	}
	
	public List<Dojos> retrieveDojos(){
		return this.dr.findAll();
	}
	
	public Dojos retrieveDojo(Long id) {
		Optional<Dojos> opt = this.dr.findById(id);
		if(opt.isPresent()) {
			return opt.get();		
		}
		return null;
	}
	
}
