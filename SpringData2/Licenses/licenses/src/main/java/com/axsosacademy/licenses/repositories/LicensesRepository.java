package com.axsosacademy.licenses.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.licenses.models.Licenses;

@Repository
public interface LicensesRepository extends CrudRepository<Licenses, Long>{

}
