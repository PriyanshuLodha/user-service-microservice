package com.example.userservice.feign;

import com.example.userservice.entity.course.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "COURSE-SERVICE",url = "http://localhost:9191/api/course/")
public interface CourseInterface {

    @PostMapping("getUserItems")
    List<Course> getUserItems(@RequestBody List<Integer> userItems);

}
