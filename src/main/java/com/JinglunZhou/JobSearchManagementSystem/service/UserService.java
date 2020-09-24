package com.JinglunZhou.JobSearchManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.JinglunZhou.JobSearchManagementSystem.models.User;
import com.JinglunZhou.JobSearchManagementSystem.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired private BCryptPasswordEncoder encoder;
	
	@Autowired private UserRepository userRepository;

	public void save(User user) {
		String temp = user.getPassword();
		
		user.setPassword(encoder.encode(temp));
		
		userRepository.save(user);
	}

}
