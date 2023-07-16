package com.webapp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.demo.Model.Login;

public interface Logindao extends JpaRepository<Login, String> {

}