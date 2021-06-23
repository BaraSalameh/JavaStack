package com.axsosacademy.lookify.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsosacademy.lookify.mvc.models.PlayLists;
import com.axsosacademy.lookify.mvc.services.PlayListService;

@Controller
public class PlayListController {
	private PlayListService pls;
	
	public PlayListController(PlayListService pls) {
		this.pls = pls;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("playLists", this.pls.retrieveSongs());
		return "dashboard.jsp";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String Search(@RequestParam(value="artist") String artist) {
		System.out.println("search method good!");
			return "redirect:/search/"+artist;
	}
	
	@RequestMapping(value="/search/{artist}", method=RequestMethod.GET)
	public String searchArtist(@PathVariable("artist") String artist,
			Model model) {
		System.out.println("searchArtist method is good!");
		model.addAttribute("artist", this.pls.retrievePlayList(artist));
		return "search.jsp";
	}
	
	@RequestMapping("/delete/{id}/{artist}")
	public String deletePlayList(@PathVariable("id") Long id,
			@PathVariable("artist") String artist) {
		this.pls.deletePlayList(id);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/songs/new")
	public String renderAddNewSong(@ModelAttribute("playlists") PlayLists pl) {
		return "addNewSong.jsp";
	}
	
	@RequestMapping(value="/addNewSong", method=RequestMethod.POST)
	public String addNewSong(@Valid @ModelAttribute("playlists") PlayLists pl,
			BindingResult result,
			@RequestParam("title") String title,
			@RequestParam("artist") String artist,
			@RequestParam("rating") int rating
			) {
		if(result.hasErrors()) {
			return "dashboard.jsp";
		}else {
			this.pls.createNewSong(title, artist, rating);
			return "redirect:/songs/new";
		}
	}
	
	@RequestMapping("/details/{titleId}")
	public String details(@ModelAttribute("playlists") PlayLists pls,
			@PathVariable("titleId") Long titleId,
			Model model) {
		model.addAttribute("artist", this.pls.retrieveSong(titleId));
		return "details.jsp";
	}
}
