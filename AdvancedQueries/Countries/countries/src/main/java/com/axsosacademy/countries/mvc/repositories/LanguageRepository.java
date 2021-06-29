package com.axsosacademy.countries.mvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.countries.mvc.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	@Query(value="SELECT countries.name, languages.language, languages.percentage FROM countries "
			+ "JOIN languages ON countries.id = languages.country_id "
			+ "WHERE languages.language = ?1 "
			+ "ORDER BY languages.percentage DESC", nativeQuery = true)
	List<Object[]> findAllCountryByLanguage(String language);
	
}
