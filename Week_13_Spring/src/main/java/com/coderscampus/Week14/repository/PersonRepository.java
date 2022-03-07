package com.coderscampus.Week14.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.coderscampus.Week14.dto.Person;


//@Repository datadabase baglantisi icin kullanilir
@Repository
public class PersonRepository {
	
	private Map<Long, Person> personsData = new HashMap<>();

	public void save(Person person) {
		personsData.put(person.getPersonId(), person);
	}
	
	public Person findById (Long personId) {
		return personsData.get(personId);
	}
	

}
