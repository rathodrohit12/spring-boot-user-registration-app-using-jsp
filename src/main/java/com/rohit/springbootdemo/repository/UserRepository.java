package com.rohit.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rohit.springbootdemo.model.UserDto;

@Repository
public interface UserRepository extends JpaRepository<UserDto, Integer> {
	UserDto findByEmail(String email);
}
