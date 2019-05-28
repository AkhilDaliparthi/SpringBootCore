package com.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.core.dao.UserDetailsDAO;
import com.model.UserDetails;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	public UserDetailsDAO userDetailsDAO;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
	}
	
	@RequestMapping("/getUsersInfo")
    public List<UserDetails> getUserDetails() {
        List<UserDetails> users = userDetailsDAO.getData(); 
        return users;
    }
}
