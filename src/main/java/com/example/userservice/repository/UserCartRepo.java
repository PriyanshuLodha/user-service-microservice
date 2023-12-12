package com.example.userservice.repository;

import com.example.userservice.entity.UserCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserCartRepo extends JpaRepository<UserCart,Integer> {
    @Query(value = "SELECT COURSE_ID FROM USER_CART WHERE USER_ID = :id", nativeQuery = true)
    List<Integer> getCourseList(Integer id);
}
