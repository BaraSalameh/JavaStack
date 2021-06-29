package com.axsosacademy.startupproject.mvc.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.axsosacademy.startupproject.mvc.models.User;
import com.axsosacademy.startupproject.mvc.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public User retrieveUserByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}
	
	public User registerUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return this.userRepository.save(user);
	}
	
	public User retrieveUserById(Long id) {
		return this.userRepository.findById(id).orElse(null);
	}
	
	public boolean authenticateUser(String email, String password) {
		User user = retrieveUserByEmail(email);
		if(user == null) 
			return false;
		else 
			if(BCrypt.checkpw(password, user.getPassword()))
				return true;
			return false;	
	}
}
