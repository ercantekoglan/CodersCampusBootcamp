package com.hibernate_example.week_18_hibernate_example.web;

import java.util.Arrays;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hibernate_example.week_18_hibernate_example.domain.User;
import com.hibernate_example.week_18_hibernate_example.service.UserService;
	
	
	@Controller
	public class UserController {
		
		@Autowired
		private UserService userService;
		//create
		@GetMapping("/register")
		public String createUser(ModelMap model) {
			// User user = new User();
			model.put("user", new User());
			
		return "register";
		}
		//create
		@PostMapping("/register")
		public String postCreateUser(User user) {
			userService.saveUser(user);
			
			return "redirect:/register";
		}
		
		@GetMapping("/users")
		public String getAllUsers(ModelMap model) {
			
			// List<User> users = userService.findByUsername("ercantekoglan@gmail.com");
			// List<User> users = userService.findByCreatedDateBetween(LocalDate.of(2020, 01, 01), LocalDate.of(2020, 01, 02));
			// List<User> users = userService.fildAll();
			Set<User> users = userService.fildAll();
			model.put("users", users);
			// normalde kullanilan bir yol degil
			if(users.size() ==1) {
				// model.put("user", users.get(0));
				model.put("user", users.iterator().next());
			}
			return "users";
		}
		//update
		@GetMapping("/users/{userId}")
		public String getOneUser (ModelMap model, @PathVariable Long userId) {
			User user = userService.findById(userId);
		//	User user = userService.findExactlyOneUserByUsername("ercantekoglan@gmail.com"); 

			model.put("users", Arrays.asList(user));
			model.put("user", user);
			return "users";
// 				Password With "Text": <input type = "text" th:field="${user.password}"/>	
		}
		//update
		@PostMapping("/users/{userId}")
			public String postOneUser  (User user) {
				 userService.saveUser(user);
			return "redirect:/users/" + user.getUserId();
		}
		
		//delete
		@PostMapping("/users/{userId}/delete")
		public String deleteOneUser(@PathVariable Long userId) {
			userService.delete(userId);
			return "redirect:/users";
			
		}
}
