package com.axsosacademy.goldninjaassignment;

import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class GoldNinjaApplication {
	private int gold = 0;
	private ArrayList<String> status = new ArrayList<String>();
	
	public static void main(String[] args) {
		SpringApplication.run(GoldNinjaApplication.class, args);
	}
	
	public int getGold() {
		return gold;
	}
	
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public ArrayList<String> getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status.add(status);
	}

	@RequestMapping(value="", method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("golds", this.getGold());
		model.addAttribute("status", this.getStatus());
		return "index.jsp";
	}
	
	@RequestMapping(value="/place", method=RequestMethod.POST)
	public String place(@RequestParam(value="hidden") int hiddenValue) {
		Random r = new Random();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		LocalDateTime ldt = LocalDateTime.now();
		if(hiddenValue == 1) {
			int value = r.nextInt(20-10)+10;
			setStatus("You entered a farm and earned "+value+" gold. ("+dtf.format(ldt)+")");
			setGold(this.getGold()+value);
		}else if(hiddenValue == 2){
			int value = r.nextInt(10-5)+5;
			setStatus("You entered a cave and earned "+value+" gold. ("+dtf.format(ldt)+")");
			setGold(this.getGold()+value);
		}else if(hiddenValue == 3){
			int value = r.nextInt(5-2)+2;
			setStatus("You entered a house and earned "+value+" gold. ("+dtf.format(ldt)+")");
			setGold(this.getGold()+value);
		}else if(hiddenValue == 4){
			int value = r.nextInt(100)-50;
			if(value >= 0) {
				setStatus("You entered a casino and earned "+value+" gold. ("+dtf.format(ldt)+")");
			}else {
				setStatus("You entered a casino and lost "+value+" gold..Ouch. ("+dtf.format(ldt)+")");
			}
			setGold(this.getGold()+value);
		}
		return("redirect:/");
	}

}
