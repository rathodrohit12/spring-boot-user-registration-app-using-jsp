package com.rohit.springbootdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {


	private int id;

	private String name;
	private String email;
	private String mobile;
	private String pass;

	

}
