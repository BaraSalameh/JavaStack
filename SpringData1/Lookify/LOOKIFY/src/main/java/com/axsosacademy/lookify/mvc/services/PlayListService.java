package com.axsosacademy.lookify.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsosacademy.lookify.mvc.models.PlayLists;
import com.axsosacademy.lookify.mvc.repositories.PlayListRepository;



@Service
public class PlayListService {
	private PlayListRepository plr;
	
	public PlayListService(PlayListRepository plr) {
		this.plr = plr;
	}
	
	public List<PlayLists> retrieveSongs(){
		return this.plr.findAll();
	}
	
	public List<PlayLists> retrievePlayList(String artist) {
		return this.plr.findByArtist(artist);
	}
	
	public void deletePlayList(Long id) {
		Optional<PlayLists> op = this.plr.findById(id);
		if(op.isPresent()) {
			this.plr.delete(op.get());
		}
	}
	
	public void createNewSong(String title, String artist, int rating) {
		PlayLists pls = new PlayLists(title, artist, rating);
		this.plr.save(pls);
	}
	
	public PlayLists retrieveSong(Long titleId) {
		Optional<PlayLists> opt = this.plr.findById(titleId);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
}
