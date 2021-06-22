package com.axsosacademy.languages.mvc.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsosacademy.languages.mvc.models.Languages;
import com.axsosacademy.languages.mvc.repositories.LanguagesRepository;





@Service
public class LanguagesService {
	private final LanguagesRepository languagesRepository;
	
	public LanguagesService(LanguagesRepository languagesRepository) {
		this.languagesRepository = languagesRepository;
	}
	
	public List<Languages> allLanguages(){
		return this.languagesRepository.findAll();
	}
	
	public void addLanguage(Languages language) {
		this.languagesRepository.save(language);
	}
	
	public void deleteLanguage(Long id) {
		this.languagesRepository.deleteById(id);
	}
	
	public Languages getLanguage(Long id) {
		Optional<Languages> language = this.languagesRepository.findById(id);
		if(language.isPresent()) {
			return language.get();
		}
		return null;
	}
	
	public void updateLanguage(Long id, String name, String creator, double version) {
		Optional<Languages> language = this.languagesRepository.findById(id);
		if(language.isPresent()) {
			language.get().setName(name);
			language.get().setCreator(creator);
			language.get().setVersion(version);
			this.languagesRepository.save(language.get());
		}
	}
}
