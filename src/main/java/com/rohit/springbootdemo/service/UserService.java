package com.rohit.springbootdemo.service;

import com.rohit.springbootdemo.model.UserDto;

public interface UserService {
	
	public void registerService(UserDto user);
	public boolean loginService(String email, String pass);
		
}