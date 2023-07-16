package com.webapp.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")
public class Login {

	@Id
	private String username;
	private String password;

	// public Login(String username, String password) {
	// this.username = username;
	// this.password = password;
	// }
	//
	// public Login() {
	//
	// }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
