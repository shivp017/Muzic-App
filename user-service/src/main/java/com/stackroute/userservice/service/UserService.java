package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.exceptions.UserAlreadyExistsExeption;

import java.util.List;

public interface UserService {
    public User saveUser(User user) throws UserAlreadyExistsExeption;

    public User getUserById(int id);
    // public List<User> getAllUser();


}
