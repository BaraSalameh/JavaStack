package com.axsosacademy.displaydateassignment;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@SpringBootApplication
@Controller
public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "timeDashboard.jsp";
	}
	
	@RequestMapping(value="/date", method=RequestMethod.GET)
	public String date(Model model) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/DD/YY");
		LocalDateTime now = LocalDateTime.now();
		model.addAttribute("date", dtf.format(now));
		return "date.jsp";
	}
	
	@RequestMapping(value="time", method=RequestMethod.GET)
	public String time(Model model) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:MM aa");
		LocalDateTime now = LocalDateTime.now();
		model.addAttribute("time",java.time.LocalTime.now());
		return "time.jsp";
	}
}
