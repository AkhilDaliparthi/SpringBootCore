package com.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dao.userDetailsServiceDao;
import com.repository.UserRepository;
import com.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class UserRepositoryImpl implements userDetailsServiceDao {

    @Autowired
    UserRepository userRepository;

	private static final String SQL = "select * from userdetails";

	public List<UserDetails> getData() {
        List<UserDetails> users = userRepository.findAll();
       return users;
   }

   public UserDetails verifyLogin(String username,String password){
		return userRepository.findByUsernameAndPassword(username,password);
   }

}
