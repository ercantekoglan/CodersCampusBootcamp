package com.coderscampus.Week15_Spring_MVC.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderscampus.Week15_Spring_MVC.domain.Person;
import com.coderscampus.Week15_Spring_MVC.service.PersonService;

//Controller .web de yer alir

@Controller
public class PersonController {

// Lesseon 1
//	@GetMapping("")
//	public String getRootWebpage() {
//		
//		//String you are returning is going to represent of your view/html file
//		//html files src/main/resourches kisminda yer alir
//		
//		
//		//   This is what gets returned / resolved when we
//		//     return a String inside of a regular Controller GetMapping method
//		//   /src/main/resources/templates/welcome.html
//		return "welcome";
//	}
	
//	//Lesson 2
//		@GetMapping("")
//		public String getRootWebpage(ModelMap model) {
//			
//			//Model map ozel bir obje = spring frameforkdan gelen bir LinkedHashMap dir.
//			String firstName = "ercan";
//			String lastName = "tekoglan";
//			model.put("firstName", firstName);
//			model.put("lastName", lastName);
//			//ModelMap ile html deki degerlere ulasiyoruz.
//			return "welcome";
//		}
	
	
	
	//Lesson 3
//	@GetMapping("")
//	public String getRootWebpage(ModelMap model) {
//		
//		Person person = new Person();
//		
//		
		// bu sekilde calistirirsan form da isim ve soyisim default deger olarak doner,kayitli kalir.
//		person.setFirstName("ercan");
//		person.getClass("tekoglan");
//		model.put("person", person);
//		System.out.println(person);
//		return "welcome";
//	}
	//html form da herhangi bir datayi populate etmedigimiz icin - tanimlamadigimiz icin sayfa hata vermiyo ama consol da null onuyo.
	
	
//	@PostMapping("")
//	public String postRootWebpage (Person person) {
//		System.out.println(person);
//		person.getFirstName();
		//return "welcome";
		//return welcome olarak kalirsa model-view degismiyo.dolayisi ile sayfa yenilendiginde degerler yerinde kaliyo.
		//form dolu.
		//people halaa modelde durdugu icin degerler dolu gozukuyo.
		//normalde submit ettiginde sayfanin yonlenmesi gerekir.
//		return "redirect:/";
		//return "redirect:/somewhere";
		//hit the submit, send the data to server adn then do something with the data in server side adn refresh the webpage
		//with brandnew model
		//**************Whenever you are doing postmapping DONT RETURN VIEW , return REDIRECT
		//this is kinf of mimicing get request.
		//IT IS GOING TO TELL IT TO LOAD THE ROOT = rood da @GetMapping("") burada
		
		//bunu yaptigimizda redirect, root a get request yapacak. it is going to get request to root.
		//and we have a GetMapping listening fo rget request on root.so, it will go back into the page adn grab 
		//brand new model, populate it brand new person on t he model then return welcome view
		//
		
//	}
	
	
	
	
	//LESSON 5 ********************ONEMLIIII**************************

//		@Autowired
//		private PersonService personService;
//
//		@GetMapping("")
//		public String getRootWebpage (ModelMap model) {
//			//   This is what gets returned / resolved when we
//			//     return a String inside of a regular Controller GetMapping method
//			//   /src/main/resources/templates/welcome.html
//			Person person = new Person();
//			
//			model.put("person", person);
//			
//			return "welcome";
//		}
//
//		@PostMapping("")
//		public String postRootWebpage (Person person) {
//			
////			Controllers should just deal with routing stuff around.
////			Controllers interact with Services and return data via model into view.
////			personRepo.save(person) bu sekilde yapma, controller i direk etkilesime sokma
//			Person savedPerson = personService.save(person);
//			System.out.println(savedPerson);
//			return "redirect:/";
//		}
		
		
	//LESSON 6 ********************ONEMLIIII**************************

	@Autowired
	private PersonService personService;


		@GetMapping("/persons")
		public String getPeople (ModelMap model) {
			
			List<Person> people = personService.findAll();
			Person person = new Person();
		
			//lesson 8
			model.put("people", people);
				
			model.put("person", person);			
			return "people";
		}
		
		@GetMapping("/persons/{personId}")
		public String getPerson(@PathVariable Integer personId, ModelMap model) {
			Person person = personService.findById(personId);
			model.put("person", person);
			return "people";
			
		}
		
		
		@PostMapping("/persons")
		public String postPeople  (Person person) {
			Person savedPerson = personService.save(person);
			System.out.println(savedPerson);
			return "redirect:/persons";
		}
		
		//id ye bakli(id arttirimi olmadan) kisiyi editlemek icin
		@PostMapping("/persons/{personId}")
		public String postPerson (Person person) {
			Person savedPerson = personService.save(person);
			System.out.println(savedPerson);
			return "redirect:/persons/" + savedPerson.getId();
		}
		
		//Lesson 9 Delete
		
		@PostMapping("/persons/{personId}/delete")
		public String deletePerson (@PathVariable Integer personId) {
			personService.delete(personId);
			return "redirect:/persons";
		}
		
}
