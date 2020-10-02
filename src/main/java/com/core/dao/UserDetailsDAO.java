package com.core.dao;

import com.core.components.Person;
import com.core.model.User;
import com.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDetailsDAO {

    public List<Person> personList;

    @Autowired
    UserDetailsDAO(List<Person> personList){
        this.personList = personList;
    }

    @Autowired
    private UserRepository userRepository;

    public List<User> getData() {
        return userRepository.findAll();
    }

    public List<Person> getPersonList(){
        return this.personList;
    }
}
