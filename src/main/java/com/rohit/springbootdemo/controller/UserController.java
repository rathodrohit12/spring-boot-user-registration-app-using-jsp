package com.rohit.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rohit.springbootdemo.model.UserDto;
import com.rohit.springbootdemo.service.UserService;

@Controller
public class UserController {

	private UserService userService;
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@GetMapping("/")
	public String showLoginForm() {
		return "index";
	}

	@PostMapping("/login")
	public String loginUser(@RequestParam String email, @RequestParam String pass, Model model) {
		boolean isValid = userService.loginService(email, pass);

		if (isValid) {
			model.addAttribute("msg", "Login successful!");
			return "welcome";
		} else {
			model.addAttribute("msg", "Invalid email or password");
			//return "index";
			return "welcome";
		}
	}

//	@GetMapping("/{id}")
//	public UserDto getUserById(@PathVariable Long id) {
//		// Example: Fetch user from DB, map to DTO, return DTO (mocked for now)
//		User user = new User();
//		user.setId(id);
//		user.setName("John Doe");
//		user.setEmail("john.doe@example.com");
//
//		return userService.convertToDto(user);
//	}
//
//	@PostMapping
//	public String createUser(@RequestBody UserDto userDto) {
//		User user = userService.convertToEntity(userDto);
//		// Save the user entity to the database (mocked for now)
//		return "User created: " + user.getName();
//	}










	@GetMapping("/reg")
	public String showRegistrationForm() {
		return "registerPage";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute UserDto user, Model model) {
		try {
			userService.registerService(user);
			model.addAttribute("msg", "Registration successful!");
			//return "index";
			return "welcome";
		} catch (Exception e) {
			model.addAttribute("msg", "Registration failed. Please try again.");
			//return "registerPage";
			return "welcome";
		}
	}

}
