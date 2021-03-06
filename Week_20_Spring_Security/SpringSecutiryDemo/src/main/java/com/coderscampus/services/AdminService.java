package com.coderscampus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.coderscampus.domain.User;
import com.coderscampus.repositories.UserRepository;

@Service
public class AdminService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private AdminService adminService;

	// method level security....i.r securing your administrative areas.
	// normal kullanicilarin admin icin design edilen yerlere ulasmamasini garantiler
	//kullanmak icin spring security kisminda enable etmemiz gerekli
	// hangi rollerin erisebilecegini belirtiyoruz
	//(hata almamak icin database e kullaniciya admin olarak rol verdik)
	@Secured({"ROLE_ADMIN","ROLE_SUPERUSER"}) 
	public List<User> getAllUserAccounts(){
		List<User> allUserAccounts = adminService.getAllUserAccounts();
		
		return userRepo.findAll();
	}
}
