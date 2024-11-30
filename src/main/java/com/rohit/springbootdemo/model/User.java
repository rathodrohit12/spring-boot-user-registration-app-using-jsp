package com.rohit.springbootdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


	private int id;

	private String name;
	private String email;
	private String mobile;
	private String pass;

	

}
