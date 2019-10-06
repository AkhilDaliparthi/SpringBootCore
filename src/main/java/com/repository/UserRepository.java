package com.repository;

import com.model.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserDetails,Integer> {
    public UserDetails findByUsernameAndPassword(String username,String password);
    public List<UserDetails> findAll();
}
