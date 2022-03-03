package com.springframework.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springframework.spring.Domain.User;
import com.springframework.spring.service.FileService;


@Configuration
@Profile("qa")
public class Week13QaConfiguration {

	// For illustration purposes only as an example of a real
	//  world type scenario of connecting to a database
//	@Bean
//	public Datasource datasource () {
//		Datasource db = new Datasource();
//		db.setConnectionString("http://aslkdfj.sdkfjhsd.com:3360");
//		db.setUsername("dev01dbblahblah")
//		
//		return db;
//	}

	@Value("${superuser.username}")
	private String username;
	@Value("${superuser.password}")
	private String password;
	@Value("${superuser.name}")
	private String name;

	@Bean
	public FileService fileService () {
		return new FileService("test.txt");
	}

	@Bean
	public User user () {
		//return new User("trevor@craftycodr.com", "asdfasdf", "Trevor Page");
		return new User(username, password, name);
	}
	
}




/*@Controller: no arg consructor cagirir.asil kontrol springde 
 * 
 * @Bean istedigimiz sekilde constructor cagirabiliriz. obje uzerinde daha cok kontrolun var.

 * */

