package com.webapp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.demo.Model.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

	Login findByUsername(String username);

	Login findByUsernameAndPassword(String username, String password);

}