package com.axsosacademy.dojoandninjas.mvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.dojoandninjas.mvc.models.Ninjas;

@Repository
public interface NinjasRepository extends CrudRepository<Ninjas, Long>{

}
