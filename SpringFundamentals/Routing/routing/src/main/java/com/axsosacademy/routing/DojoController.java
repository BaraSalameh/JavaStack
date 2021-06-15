package com.axsosacademy.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping(value="/{word}", method=RequestMethod.GET)
	public String dojo(@PathVariable("word") String word) {
		return "The "+word+" is awesome!";
	}
	
	@RequestMapping(value="/{word}/{location}", method=RequestMethod.GET)
	public String wordLocation(@PathVariable("word") String word, @PathVariable("location") String location) {
		String firstLetter = word.substring(0, 1);
		String remainingString = word.substring(1);
		
		return firstLetter.toUpperCase()+remainingString+" "+"is located in "+location;
	}
	
	@RequestMapping(value="/{word}/{secondWord}/{thirdWord}", method=RequestMethod.GET)
	public String wordSecondWord(@PathVariable("word") String word, 
			@PathVariable("secondWord") String secondWord,
			@PathVariable("thirdWord") String thirdWord) {
		String firstLetter = word.substring(0,1);
		firstLetter = firstLetter.toUpperCase();
		
		String[] splitedArray = new String[2];
		splitedArray = word.split("-");
		String splitedWord = splitedArray[1];
		String secondLetter = splitedWord.substring(0,1);
		secondLetter = secondLetter.toUpperCase();
		
		
		return firstLetter+secondLetter+" "+secondWord+" is the "+thirdWord;
	}
}
