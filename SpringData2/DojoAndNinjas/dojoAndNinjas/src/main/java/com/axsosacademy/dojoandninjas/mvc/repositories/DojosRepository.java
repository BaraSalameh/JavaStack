package com.axsosacademy.dojoandninjas.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.dojoandninjas.mvc.models.Dojos;

@Repository
public interface DojosRepository extends CrudRepository<Dojos, Long>{
	List<Dojos> findAll();
}
