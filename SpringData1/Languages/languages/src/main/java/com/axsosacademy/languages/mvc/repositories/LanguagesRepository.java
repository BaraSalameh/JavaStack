package com.axsosacademy.languages.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.languages.mvc.models.Languages;

@Repository
public interface LanguagesRepository extends CrudRepository<Languages, Long>{
public List<Languages> findAll();
}
