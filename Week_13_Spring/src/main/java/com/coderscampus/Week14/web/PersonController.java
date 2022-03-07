package com.coderscampus.Week14.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Week14.alphaAdvantage.AlphaAdvantageIntegration;
import com.coderscampus.Week14.dto.Person;
import com.coderscampus.Week14.repository.PersonRepository;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository personRepo;
	
	//pluralize end points
	@PostMapping("/persons")
	public Person createPerson(String name, String gender, Integer age, Long personId) {
	
		//public Person createPerson(@RequestParam String name, @RequestParam String gender, 
		//				@RequestParam(required = false (optional demek)) Integer age) {
		//				@RequestParam  = olmasa da olur ama bi deger gerekli ise @RequestParam  kullan.
		//				eger deger gelmezse null doner

		
		//postman da body ye key- value gonderince calisir.
			Person person = new Person();
			person.setAge(age);
			person.setGender(gender);
			person.setName(name);
			person.setPersonId(personId);
			personRepo.save(person);
			
			return person;
	}
	
		// fetches the person with ID 1
		// http://localhost:8080/persons/1

		@GetMapping("/persons/{personId}")
		public Person getPerson (@PathVariable Long personId) {
			System.out.println("Person ID is: " + personId);
			return personRepo.findById(personId);

		}
		
	
}


/*REST CALLS
 * 
 * COmmunicate with other APIs
 * 
 * we built and request and responses
 * 
 * 200 serisi iyi demek.basarili.
 * 400 ise bad request 
 * 
 * postman represents wer request
 * 
 * ekledigin key value degerleri query parametreleridir. ? ile temsil edilir.
 * 
 * 
 * */
