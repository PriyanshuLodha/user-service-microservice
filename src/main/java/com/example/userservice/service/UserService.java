package com.example.userservice.service;


import com.example.userservice.entity.User;

import com.example.userservice.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Autowired
    UserRepo userRepo;
    public User saveUser(User responseUser){
        return userRepo.save(responseUser);
    }
    public User getUser(Integer id)
    {
        return userRepo.findById(id).orElse(null);
    }


}
