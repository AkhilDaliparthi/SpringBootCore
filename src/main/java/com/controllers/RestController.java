package com.controllers;

import com.daoImpl.UserRepositoryImpl;
import com.model.UserDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*")
@org.springframework.web.bind.annotation.RestController
public class RestController {

    private static final Logger logger = LogManager.getLogger(RestController.class);

	@Autowired
	public UserRepositoryImpl userRepositoryImpl;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public String myData() {
	    logger.info("Testing the logger");
		return "Hello Spring Boot";
	}
	
	@RequestMapping("/login")
    public UserDetails getUserDetails(@RequestParam("username") String username, @RequestParam("password") String password) {
        UserDetails user = userRepositoryImpl.verifyLogin(username,password);
        return user;
    }
}
