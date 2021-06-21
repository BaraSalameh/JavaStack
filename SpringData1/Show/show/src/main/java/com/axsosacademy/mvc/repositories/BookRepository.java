package com.axsosacademy.mvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.mvc.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

}
