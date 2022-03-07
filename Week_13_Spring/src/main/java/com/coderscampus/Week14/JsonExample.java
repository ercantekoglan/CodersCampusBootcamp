package com.coderscampus.Week14;

import org.junit.jupiter.api.Test;

import com.coderscampus.Week14.dto.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExample {
	/**
	 * JSON JavaScript Object Notation A simple String based way to notate data -
	 * Key : Value pairs 
	 * - Key : Value pairs are separated by commas 
	 * - Objects are represented by { } 
	 * - Arrays are represented by [ ]
	 * 
	 * Important note: JSON is NOT tied to JavaScript... it is language agnostic
	 * (meaning it'll work in any language)
	 * 
	 * Person: name, age, gender
	 * 
	 * { 
	 * 		"name" : "Trevor Page",
	 * 		"age" : 37, 
	 * 		"gender" : "Male" 
	 * }
	 * 
	 * List<Person> people
	 * 
	 * [ 
	 * 		{ "name" : "Trevor Page", "age" : 37, "gender" : "Male" }, 
	 * 		{ "name" : "Jane Doe", "age" : 29, "gender" : "Female" }
	 * ]
	 * 
	 * 
	 * JSON is how we communicate across the internet.
	 * 
	 * 
	 * XML
	 * 
	 * <people> <person> <name>Trevor Page</name> <age>37</age>
	 * <gender>Male</gender> </person> <person> <name>Jane Doe</name> <age>29</age>
	 * <gender>Female</gender> </person> </people>
	 * 
	 * 
	 * 
	 * Java Objects -> JSON Strings // JSON Strings -> Java objects
	 * 
	 * JSON is is used to pass data around to internet (server to client / client to server or one language to another language
	 * via API endpoint (REST)
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void convertJsonStringToJavaObj() {

		// String jsonString = "{"name" : "ercan", "age" : 33, "gender" : "Male" }";
		// string in icini kesip geri yapistirinca
		// eclipse otomatik kendi ayarlama yapar.escape the double quoutes

		String jsonString = "{\"name\" : \"ercan\", \"age\" : 33, \"gender\" : \"Male\" }";

		ObjectMapper mapper = new ObjectMapper();
		try {
			Person person = mapper.readValue(jsonString, Person.class);
			System.out.println(person);
			System.out.println("*************");
			celebrateBirthday(person);
			System.out.println("*************");
			System.out.println(mapper.writeValueAsString(person));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	private void celebrateBirthday(Person person) {
		person.setAge(person.getAge() + 1);
	}
}