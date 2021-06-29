package com.axsosacademy.countries.mvc.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.axsosacademy.countries.mvc.repositories.CityRepository;
import com.axsosacademy.countries.mvc.repositories.CountryRepository;
import com.axsosacademy.countries.mvc.repositories.LanguageRepository;

@Service
public class ApiService {
	 private final CountryRepository countryRepository;
	 private final LanguageRepository languageRepository;
	 private final CityRepository cityRepository;
	 
	 public ApiService(CountryRepository countryRepository,
			 LanguageRepository languageRepository,
			 CityRepository cityRepository) {
		 this.countryRepository=countryRepository;
		 this.languageRepository=languageRepository;
		 this.cityRepository = cityRepository;
	 }
	 
	 public List<Object[]> retrieveCountriesThatSpeakSlovene(String language){
		 return this.languageRepository.findAllCountryByLanguage(language);
	 }
	 
	 public List<Object[]> retrieveCountriesByNumberOfCities(){
		 return this.countryRepository.findAllByCities();
	 }
	 
	 public List<Object[]> retrieveCitiesByCountryName(String name){
		 return this.cityRepository.findAllByCountryName(name);
	 }
	 
	 public List<Object[]> retrieveCountriesAndCitiesByPercentage(){
		 return this.countryRepository.findCountriesAndCitiesByPercentage();
	 }
	 
	 public List<Object[]> retrieveCountriesBySurfaceAreaAndPopulation(float surfaceArea, int population) {
		 return this.countryRepository.findAllBySurfaceAreaAndPopulation(surfaceArea, population);
	 }
	 
	 public List<Object[]> retrieveCountriesByGovernmentFormAndSurfaceAreaAndLifeExpectancy(String governmnetForm, 
			 float surfaceArea, 
			 float lifeExpectancy){
		 return this.countryRepository.findAllByGovernmentFormAndSurfaceAreaAndLifeExpectancy(governmnetForm, surfaceArea, lifeExpectancy);
	 }
	 
	 public List<Object[]> retrieveCountriesAndCitiesByNameAndPopulation(String countryName, String cityDistrict, int cityPopulation){
		 return this.cityRepository.findCountriesAndCitiesByNameAndPopulation(countryName, cityDistrict, cityPopulation);
	 }
	 
	 public List<Object[]> retrieveAllRegionAndNumberOfCountries(){
		 return this.countryRepository.findByRegion();
	 }
}
