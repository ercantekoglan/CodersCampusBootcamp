package com.coderscampus.Week15_Spring_MVC.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.coderscampus.Week15_Spring_MVC.domain.Person;

@Repository
public class PersonRepository {
	private Map<Integer, Person> people = new HashMap<>();
	
	public Person save (Person person) {
		people.put(person.getId(), person);
		
		return person;
	}
	

	public Person findById (Integer personId) {
		return people.get(personId);
	}

//lesson 8
	public List<Person> findAll() {
		
		//hashmap i direk stream leyemezsin, once entryset cagirman gerek
		//people.entrySet().stream().map(entry -> entry.getValue()).collect(Collectors.toList());
		return people.entrySet().stream().map(Entry::getValue).collect(Collectors.toList());
		 
	}
	
	//Lesson 9 Delete
	
	public void delete(Integer personId) {
		people.remove(personId);
	}

}

//Repository ler genelde interface olur ve baska bir class dan extend edilir.

//Controller in direk repoyu cagirmasi iyi degildir.
//Controller interact with Services and return a view.