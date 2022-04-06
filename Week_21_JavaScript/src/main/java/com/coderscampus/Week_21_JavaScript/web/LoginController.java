package com.coderscampus.Week_21_JavaScript.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.Week_21_JavaScript.domain.User;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String getLogin (ModelMap model) {
		User user = new User();
		
		model.put("user", user);
		return "login";
	}

}
