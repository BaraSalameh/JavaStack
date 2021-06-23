package com.axsosacademy.lookify.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.lookify.mvc.models.PlayLists;

@Repository
public interface PlayListRepository extends CrudRepository<PlayLists, Long>{
	
	List<PlayLists> findAll();
	List<PlayLists> findByArtist(String artist);
}
