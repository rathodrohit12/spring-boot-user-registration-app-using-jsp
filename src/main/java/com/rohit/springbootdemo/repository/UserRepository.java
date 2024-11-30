package com.rohit.springbootdemo.repository;

import com.rohit.springbootdemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rohit.springbootdemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	UserEntity findByEmail(String email);
}
