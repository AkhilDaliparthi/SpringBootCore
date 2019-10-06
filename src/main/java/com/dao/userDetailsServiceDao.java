package com.dao;

import com.model.UserDetails;

import java.util.List;

public interface userDetailsServiceDao {
    public List<UserDetails> getData();
    public UserDetails verifyLogin(String username,String password);
}
