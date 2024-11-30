package com.rohit.springbootdemo.service;

import com.rohit.springbootdemo.entity.UserEntity;
import com.rohit.springbootdemo.model.User;

public interface UserService {
	
	public void registerService(User user);
	public boolean loginService(String email, String pass);
	public User convertToDto(UserEntity userEntity);
	public UserEntity convertToEntity(User user);
}