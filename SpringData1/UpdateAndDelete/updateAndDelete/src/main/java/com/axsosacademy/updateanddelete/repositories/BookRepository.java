package com.axsosacademy.updateanddelete.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.updateanddelete.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {}
		