package com.core.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.UserDetails;

@Repository
public class UserDetailsDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SQL = "select * from userdetails";
	
	public List<UserDetails> getData() {

        List<UserDetails> users = new ArrayList<UserDetails>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

        for (Map<String, Object> row : rows) 
        {
        	UserDetails userdetails = new UserDetails();
        	userdetails.setPkUserId((int)row.get("pkUserId"));
        	userdetails.setUsername((String)row.get("username"));
        	
        	users.add(userdetails);
         }

       return users;
   }
	
}
