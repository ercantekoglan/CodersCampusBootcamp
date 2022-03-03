package com.springframework.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.spring.service.UserService;

@RestController
public class UserController {

	//@Autowired injection olmadan calisti
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	//spring genelde no arg const cagirir ama tek arg li oldugunda da bunu algilayip 1 arg liyi cagirir
	}
	
	@GetMapping("/users")
	public String getUsers() {
		return userService.getMessage();
	}
}
