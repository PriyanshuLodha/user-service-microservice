package com.example.userservice.controller;

import com.example.userservice.entity.UserCart;
import com.example.userservice.entity.course.Course;
import com.example.userservice.service.UserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class UserCartController {
    @Autowired
    UserCartService userCartService;
    public UserCartController(UserCartService userCartService) {
        this.userCartService = userCartService;
    }

    @PostMapping("/addItem")
    void saveItem(UserCart userCart){
        userCartService.saveUserItem(userCart);
    }
    @GetMapping("/getUserItems/{user_id}")
    List<Course> getUserItems(@PathVariable(name = "user_id") Integer userid)
    {
       return userCartService.getUserItem(userid);
    }
}
