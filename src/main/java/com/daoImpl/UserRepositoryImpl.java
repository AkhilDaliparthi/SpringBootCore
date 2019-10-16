package com.daoImpl;

import com.dao.userDetailsServiceDao;
import com.model.UserDetails;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
