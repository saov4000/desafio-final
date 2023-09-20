package com.saov.desafiofinal.service;

import org.springframework.stereotype.Service;

import com.saov.desafiofinal.model.User;

@Service
public interface UserService {
	
	User findById(Long id);
	
	User create(User user);	
}
