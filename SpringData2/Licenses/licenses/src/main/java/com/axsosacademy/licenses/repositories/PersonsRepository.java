package com.axsosacademy.licenses.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.licenses.models.Persons;

@Repository
public interface PersonsRepository extends CrudRepository<Persons, Long>{
	List<Persons> findAll();
}
