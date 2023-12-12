package com.example.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USER_CART")
public class UserCart {

    @Column(name="CART_ID")
    @Id
    private Integer id;
    @Column(name="COURSE_ID")
    private Integer course_id;
    @Column(name = "USER_ID")
    private Integer user_id;
}
