package com.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.repository.UserRepository;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	@PostMapping("/create")
	public  void createUser(@RequestBody final User user){
		user.setUserId(UUID.randomUUID().toString());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
	}

	
	@GetMapping("/{userId}")
	public Optional<User> getUser(@PathVariable final String userId){
		return userRepository.findById(userId);
	}

	
	public User getUserByEmail (String email) {
	    return userRepository.findByEmail(email);
	}
	
	public boolean checkPasswordMatches(String password, User user) {
		return passwordEncoder.matches(password, user.getPassword());
	}
	
}
