package com.springframework.spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springframework.spring.Domain.User;
import com.springframework.spring.service.FileService;

//@SpringBootApplication - farkli package de classin varsa springin taramasi icin eklenir
//@ComponentScan("com.coderscampus") - parent package dan taratmaya basliyor

@Configuration
@Profile("dev")
//@PropertySource(value={"application-dev.properties"})
public class Week13DevConfiguration {

	@Bean
	public FileService fileService () {
		return new FileService("test.txt");
	}
	
	@Bean
	public User superUser() {
	//public User user () {
		return new User("trevor@craftycodr.com", "asdfasdf", "Trevor Page");

	}
	
	//this is for an illusturation of 2 different beans that have the same type (User) 
	@Bean
	public User regularUser () {
		return new User("regular_trevor@craftycodr.com", "asdfasdf", "Trevor Page");

	}
}
