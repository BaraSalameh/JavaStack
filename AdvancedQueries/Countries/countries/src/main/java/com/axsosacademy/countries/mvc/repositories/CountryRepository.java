package com.axsosacademy.countries.mvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.countries.mvc.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long>{
	@Query(value="SELECT countries.name, COUNT(cities.id) AS numberOfCities FROM countries "
			+ "JOIN cities ON cities.country_id = countries.id "
			+ "GROUP BY countries.name "
			+ "ORDER BY numberOfCities DESC", nativeQuery = true)
	List<Object[]> findAllByCities(); 
	
	@Query(value="SELECT countries.name, languages.language, languages.percentage FROM countries "
			+ "JOIN languages ON languages.country_id = countries.id "
			+ "WHERE languages.percentage > 89 "
			+ "GROUP BY countries.name "
			+ "ORDER BY languages.percentage DESC", nativeQuery = true)
	List<Object[]> findCountriesAndCitiesByPercentage();
	
	
	@Query(value="SELECT name, surface_area, population FROM countries "
			+ "WHERE surface_area < ?1 AND population > ?2", nativeQuery = true)
	List<Object[]> findAllBySurfaceAreaAndPopulation(float surfaceArea, int population);
	
	@Query(value="SELECT name, government_form, surface_area, life_expectancy FROM countries "
			+ "WHERE government_form = ?1 AND surface_area > ?2 AND life_expectancy > ?3", nativeQuery = true)
	List<Object[]> findAllByGovernmentFormAndSurfaceAreaAndLifeExpectancy(String governmentForm, float surfaceArea, float lifeExpectancy);
	
	@Query(value="SELECT region, COUNT(id) FROM countries "
			+ "GROUP BY region "
			+ "ORDER BY COUNT(id) DESC", nativeQuery = true)
	List<Object[]> findByRegion();
}
