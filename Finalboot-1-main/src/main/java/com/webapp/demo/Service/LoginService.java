package com.webapp.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.demo.Model.Login;
import com.webapp.demo.Repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository repo;

	public Login usercheck(String username) {
		Login user = repo.findByUsername(username);
		return user;
	}

	public Login logincheck(String username, String password) {
		Login user = repo.findByUsernameAndPassword(username, password);
		return user;
	}

}