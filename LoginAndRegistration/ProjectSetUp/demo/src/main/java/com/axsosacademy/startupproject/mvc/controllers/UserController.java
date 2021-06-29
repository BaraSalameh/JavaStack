package com.axsosacademy.startupproject.mvc.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsosacademy.startupproject.mvc.models.User;
import com.axsosacademy.startupproject.mvc.services.UserService;

@Controller
public class UserController {
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/login";
	}
	
	@RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user,
    		HttpSession session) {
		if(session.getAttribute("userId") != null) {
			return "redirect:/home";
		}else
			return "registration.jsp";
    }
	
    @RequestMapping("/login")
    public String login(HttpSession session) {
    	if(session.getAttribute("userId") != null) {
			return "redirect:/home";
    	}else
    		return "login.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, 
    		BindingResult result, 
    		HttpSession session) {
        // if result has errors, return the registration page (don't worry about validations just now)
        // else, save the user in the database, save the user id in session, and redirect them to the /home route
    	if(result.hasErrors()) {
    		return "registration.jsp";
    	}else {
    		this.userService.registerUser(user);
    		session.setAttribute("userId", user.getId());
    		return "redirect:/home";
    	}
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, 
    		Model model) {
        // get user from session, save them in the model and return the home page
    	if(session.getAttribute("userId") != null) {
    		model.addAttribute("user", this.userService.retrieveUserById((Long) session.getAttribute("userId")));
        	return "index.jsp";
    	}else
    		return "redirect:/registration";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, 
    		@RequestParam("password") String password, 
    		Model model, 
    		HttpSession session) {
        // if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
    	if(this.userService.authenticateUser(email, password)) {
    		User user = this.userService.retrieveUserByEmail(email);
    		session.setAttribute("userId", user.getId());
    		model.addAttribute("user", user);
    		return "index.jsp";
    	}else {
    		return "redirect:/login";
    	}
    }
//    
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
        // redirect to login page
    	session.invalidate();
    	return "redirect:/registration";
    }
}
