package com.axsosacademy.countries.mvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.countries.mvc.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long>{
	@Query(value="SELECT cities.name, cities.population FROM cities "
			+ "JOIN countries ON cities.country_id = countries.id "
			+ "WHERE countries.name = ?1 AND cities.population > 500000 "
			+ "ORDER BY cities.population DESC", nativeQuery = true)
	List<Object[]> findAllByCountryName(String name);
	
	@Query(value="SELECT cities.name, cities.district, cities.population FROM countries "
			+ "JOIN cities ON cities.country_id = countries.id "
			+ "WHERE countries.name = ?1 AND cities.district = ?2 AND cities.population > ?3", nativeQuery = true)
	List<Object[]> findCountriesAndCitiesByNameAndPopulation(String countryName, String cityDistrict, int cityPopulation);
}
