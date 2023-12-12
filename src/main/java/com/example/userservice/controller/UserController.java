package com.example.userservice.controller;


import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/adduser")
    @ResponseStatus(HttpStatus.OK)
    void addUser(@RequestBody User responseUser){
      userService.saveUser(responseUser);
    }
    @GetMapping("/getuser/{id}")
    @ResponseStatus(HttpStatus.OK)
    User getUser(@PathVariable Integer id)
    {
        return userService.getUser(id);
    }
}
