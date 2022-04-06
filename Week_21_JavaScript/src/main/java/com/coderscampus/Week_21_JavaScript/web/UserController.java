package com.coderscampus.Week_21_JavaScript.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderscampus.Week_21_JavaScript.domain.User;
import com.coderscampus.Week_21_JavaScript.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
//	// @GetMapping("/users/exists") => @RequestiMapping den once boyle yapiyorduk
//	// requestmapping ile parent path olusturuyoruz users icin
//	@GetMapping("/exists")
//	public Boolean getExists(String username, String password) {
//		System.out.println("Username = " + username + ", Password = " + password);
//		return true;
//	}
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/exists")
	@ResponseBody //tells spring this method to behave not regular controller, behave as proper RestController.it is going to return an object instead of view
	//public Boolean postExists(String username, String password) {
	public Boolean postExists(@RequestBody User user) {
		// @RequestBody = request body de oldugunu soyluyoruz.look for user object for request body
		// js de uusername ve password icin toplu bir sekilde user objesi kurup onu gonderdigimiz icin parametre olarak user user geciyoruz.
		//System.out.println("Username = " + user.getUsername() + ", Password = " + user.getPassword());
		user = userService.findByUsername(user.getUsername());
		return (user != null);
	}
	// error status = 500 = server side hatasi
	
	@GetMapping("/validateUsername")
	@ResponseBody
	public Boolean getValidUsername(String name) {
		return true;
	}
	
	@GetMapping("/validatePassword")
	@ResponseBody
	public Boolean getValidPassword(String password) {
		return true;
	}
	
	@GetMapping("/register")
	public String getRegister(ModelMap model) {
		User user = new User();
		
		model.put("user", user);
		
		return "register";
	}
	
	@PostMapping("/register")
	public String postRegister(User user) {
		userService.save(user);
		return "redirect:/login";
	}
}
