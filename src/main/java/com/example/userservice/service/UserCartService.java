package com.example.userservice.service;

import com.example.userservice.entity.UserCart;
import com.example.userservice.entity.course.Course;
import com.example.userservice.feign.CourseInterface;
import com.example.userservice.repository.UserCartRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserCartService {
    @Autowired
    CourseInterface courseInterface;

    @Autowired
    UserCartRepo userCartRepo;

//    @Autowired
//    public UserCartService(CourseInterface courseInterface, UserCartRepo userCartRepo) {
//        this.courseInterface = courseInterface;
//        this.userCartRepo = userCartRepo;
//    }
/*
    @Autowired
    public UserCartService(UserCartRepo userCartRepo) {
        this.userCartRepo = userCartRepo;
    }*/

    public UserCart saveUserItem(UserCart userCart){
        return userCartRepo.save(userCart);
    }
    public List<Course> getUserItem(Integer userid){
        return  courseInterface.getUserItems(userCartRepo.getCourseList(userid));
    }
}
