package com.controllers;

import com.daoImpl.UserRepositoryImpl;
import com.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@CrossOrigin(origins = "*")
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	public UserRepositoryImpl userRepositoryImpl;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
	}
	
	@RequestMapping("/login")
    public UserDetails getUserDetails(@RequestParam("username") String username, @RequestParam("password") String password) {
        UserDetails user = userRepositoryImpl.verifyLogin(username,password);
        return user;
    }
}
