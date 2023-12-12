package com.example.userservice.entity.course;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    private Integer id;
    private String name;
    private String image;
    private String description;
    private String price;
    private Highlights highlights;
}
