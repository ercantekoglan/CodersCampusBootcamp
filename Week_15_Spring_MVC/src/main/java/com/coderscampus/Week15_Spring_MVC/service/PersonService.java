package com.coderscampus.Week15_Spring_MVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Week15_Spring_MVC.domain.Person;
import com.coderscampus.Week15_Spring_MVC.repository.PersonRepository;

@Service
public class PersonService {
	private Integer personId = 1;
	
	@Autowired
	private PersonRepository personRepo;
	
	public Person save(Person person) {
		//if blogunu eklyerek, eger mevcutta bir id var ise yeni bir person id yartmak yerine mevcut olani editlememiz saglaniyor.s
		if (person.getId() == null)
		person.setId(personId++);
		return personRepo.save(person);
	}

	public Person findById(Integer personId) {
		return personRepo.findById(personId);
	}

	//lesson 8
	public List<Person> findAll() {
		
		return personRepo.findAll();
	}
	
	//lesson 9 delete
	public void delete(Integer personId) {
		personRepo.delete(personId);
	}

}
