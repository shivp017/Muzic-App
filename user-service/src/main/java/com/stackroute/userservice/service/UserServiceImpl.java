package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.exceptions.UserAlreadyExistsExeption;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

 private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) throws UserAlreadyExistsExeption {
        if (userRepository.existsById(user.getId())) {
            throw new UserAlreadyExistsExeption("user already exists");
        }
    User savedUser= userRepository.save(user);
        if (savedUser==null) {
        throw new UserAlreadyExistsExeption("user already exists");
        }

     return savedUser;
    }

    @Override
    public User getUserById(int id) {
        User user=userRepository.findById(id).get();
        return user;
    }


}
