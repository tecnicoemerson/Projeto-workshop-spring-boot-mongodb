package com.tecnicoemerson.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnicoemerson.workshopmongodb.domain.User;
import com.tecnicoemerson.workshopmongodb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){		
		return repo.findAll();
	}
}
