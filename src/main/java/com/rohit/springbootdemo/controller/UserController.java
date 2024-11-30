package com.rohit.springbootdemo.controller;

import com.rohit.springbootdemo.entity.UserEntity;
import com.rohit.springbootdemo.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rohit.springbootdemo.model.User;
import com.rohit.springbootdemo.service.UserService;

@Controller
public class UserController {

	private final UserService userService;
	private final UserRepository userRepository;
	@Autowired
	public UserController(UserService userService, UserRepository userRepository) {
		this.userService = userService;
		this.userRepository = userRepository;
	}

	@GetMapping("/")
	public String showLoginForm() {
		return "index";
	}

	@PostMapping("/login")
	public String loginUser(@RequestParam String email, @RequestParam String pass, Model model, HttpServletRequest request) {
		boolean isValid = userService.loginService(email, pass);

		if (isValid) {
			UserEntity userEntity = userRepository.findByEmail(email);
			if (userEntity != null) {
				request.getSession().setAttribute("userName", userEntity.getName()); // Store the name in the session
			}
			request.getSession().setAttribute("userEmail", email);
			model.addAttribute("msg", "Login successful!");
			model.addAttribute("msgType", "alert-success");
			return "dashboard";
		} else {
			model.addAttribute("msg", "Invalid email or password");
			model.addAttribute("msgType", "alert-danger");
			return "index";
		}
	}






	@GetMapping("/reg")
	public String showRegistrationForm() {
		return "registerPage";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user, Model model) {
		try {
			userService.registerService(user);
			model.addAttribute("msg", "Registration successful!");
			model.addAttribute("msgType", "alert-success");
			return "registerPage";

		} catch (Exception e) {
			model.addAttribute("msg", "Registration failed. Please try again.");
			model.addAttribute("msgType", "alert-danger");
			return "registerPage";
		}
	}

	@PostMapping("/logout")
	public String logout(HttpServletRequest request, Model model) {
		request.getSession().invalidate();
		model.addAttribute("msg", "You have been logged out.");
		model.addAttribute("msgType", "alert-success");
		return "index";
	}

}
