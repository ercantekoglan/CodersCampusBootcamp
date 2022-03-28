
package com.coderscampus.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.domain.User;

@Controller
public class DashboardController {
  @GetMapping("/dashboard")
  public String getDashboard (@AuthenticationPrincipal User user, ModelMap model) {
	  // @AuthenticationPrincipal ile user i model e getiriyoruz
	  // passing the user object to in my controller
	  //izinlendirmeden sonra gelen kullaniciyi cekip manipule ediyoruz
	  System.out.println(user);
	  model.put("user", user);
    return "dashboard";
  }
}