package com.saov.desafiofinal.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.saov.desafiofinal.model.User;
import com.saov.desafiofinal.repository.UserRepository;
import com.saov.desafiofinal.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User findById(Long id) {

		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User user) {

		if(user.getId() != null && userRepository.existsById(user.getId())) {
			throw new IllegalArgumentException("Já existe este Id");
		}
		/*if(userRepository.existisAccountNumero(user.getAccount().getNumero())) {
			throw new IllegalArgumentException("Já existe este account numero");
		}*/
		
		return userRepository.save(user);
	}

}
