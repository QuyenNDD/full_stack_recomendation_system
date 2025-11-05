package com.example.myApp.repository;

import com.example.myApp.enity.UserProductActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProductActivityRepository extends JpaRepository<UserProductActivity, Integer> {
}
