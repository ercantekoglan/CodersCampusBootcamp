package com.hibernate_example.week_18_hibernate_example.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate_example.week_18_hibernate_example.domain.Account;
import com.hibernate_example.week_18_hibernate_example.domain.Address;
import com.hibernate_example.week_18_hibernate_example.domain.User;
import com.hibernate_example.week_18_hibernate_example.repository.AccountRepository;
import com.hibernate_example.week_18_hibernate_example.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private AccountRepository accountRepo;
	
	public List<User> findByUsername(String username){
		return userRepo.findByUsername(username);
	}
	
	public List<User> findByName(String name){
		return userRepo.findByName(name);
	}
	
	public List<User> findByNameAndUsername(String name, String username){
		return userRepo.findByNameAndUsername(name, username);
	}
	
	public List<User> findByCreatedDateBetween(LocalDate date1, LocalDate date2){
		return userRepo.findByCreatedDateBetween(date1, date2);
	}
	
	public User findExactlyOneUserByUsername(String username) {
		List<User> users = userRepo.findExactlyOneUserByUsername(username);
		if(users.size() > 0)
			return users.get(0);
		else
		return new User();
	}
	
//	public List<User> fildAll(){
//		return userRepo.findAll();
//	}
	
	public Set<User> fildAll(){
		return userRepo.findAllUsersWithAccountsAndAddresses();
	}

	public User findById(Long userId) {
		Optional<User> userOpt = userRepo.findById(userId);
		return userOpt.orElse(new User());
	}

	public User saveUser(User user) {
		// kullanici olusturdugumuzda otomatikman account da olusturmak icin bunu yapmamiz lazim
		// ancak direk bu sekilde hata verir cunku henuz account icin bir repo olusturmadik henuz.
		// bilgiyi kaydedecek bir alanimiz olmasi lazim.
		if(user.getUserId() == null) {
			Account checking = new Account();
			checking.setAccountName("Checking Account");
			checking.getUsers().add(user);
			
			Account savings = new Account();
			savings.setAccountName("Savings Account");
			savings.getUsers().add(user);
			
			
			user.getAccounts().add(checking);
			user.getAccounts().add(savings);
			// repoyu olusturduktan sonra
			accountRepo.save(checking);
			accountRepo.save(savings);
		}
		//parent side a ekle
		// CASCADE TYPES => PERSIST, MERGE, REMOVE 
		// PERSIST new User() <-> new Adress() --> saveUser()
		//	User a bagimli address tablosu varsa, user i kaydettigimde, address tablosunda bu user icin satir ekler. input yoksa null kaydeder.
		// MERGE existingUser -> new/updating Adress() --> saveUser()
		//	var olan user icin, bagimli olan address tablosu icin ya yeni bir satir ekler ya da var olani update eder.
		// REMOVE existingUser -> setAdress(null) -- saveUser()
		// 	user i sildigimizde, bagimli olan tablodaki(address) veride silinir. One-to-One da  ve one-to-many de orphanRemoval da eklememiz lazim.
		if (user.getAddress() == null) {
			Address address = new Address();
			address.setAddressLine1("123 Fake St");
			address.setAddressLine2("Unit 4");
			address.setCity("Some City");
			address.setCountry("Some Country");
			address.setRegion("Some Region");
			address.setZipCode("12345");
			address.setUser(user);
			address.setUserId(user.getUserId());
			user.setAddress(address);
		} 
		return userRepo.save(user);
		
	}

	public void delete(Long userId) {
		userRepo.deleteById(userId);
		
	}
}
