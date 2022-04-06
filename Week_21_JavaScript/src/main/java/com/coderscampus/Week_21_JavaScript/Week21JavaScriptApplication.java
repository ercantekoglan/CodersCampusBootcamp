package com.coderscampus.Week_21_JavaScript;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week21JavaScriptApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week21JavaScriptApplication.class, args);
	}

}

//The Fetch API interface allows web browser to make HTTP requests to web servers.

// CALL BACKs = 
/*
 * "I will call back later!"

A callback is a function passed as an argument to another function

This technique allows a function to call another function

A callback function can run after another function has finished
 */

/* LESSON 1-7
 *
 * <!DOCTYPE html>
<html xmlns:th = "http://thymeleaf.org">
	<head >
		<title>Login</title>
		<!-- JS i head de tanimlarsak nail olur ile basliyoruz.Sonra body kismina bakicaz. -->
		<!-- script js tanimlamana yarar , tag icin de tanimlarsin-->
		<!-- type="text/javascript" = browserin isini kolaylastirip, browser e ne oldugunu tanimlarsin -->
		<!--Bu sekilde body e koysanda ayni sey olur ama js i nereye koyup koymadigin onemlidir.  -->
		<!-- statementlerin sonuna ; kullanma ama serbesttir -->
		<!-- Stringler icin " yerine ' kullan, ikiside calisir ama tek tirnak kullan -->
		<!-- you dont explicitly create data type. var tipi kendi otomatik algilar tipi -->
		<!--  ikinci alert daha kisa. alta geciginde otomatikmen alta gecer. -->
		<!-- JS is dynamic typing  = JS will try to figure out the data type based on what is assigned to it-->
		<!--  ===  not only checks value the  but also checks the type -->
		<!--  console.log sysout ile ayni -->
		<!-- 	alert('Hello World! My name is ' + name + ' and I am ' +  age + ' years old.')
			alert(`Hello World! My name is ${name} and 
					I am ${age} years old...`)   script icinde olacak -->
		<script type="text/javascript">
		
			var name = 'Ercan'
			var age = 34
		
					
			var car
			var tesla = null
			
			console.log(`The value of 'car' is ${car}, the data type is ${typeof car}`) //undefined
			console.log(`The value of 'tesla' is ${tesla}, the data type is ${typeof tesla}`) // object
			console.log(`The value of 'name' is ${tesla}, the data type is ${typeof name}`) // string
			console.log(`The value of 'age' is ${tesla}, the data type is ${typeof age}`) // number
			console.log(`WHat is 5 + 10 = ${5+10}`)
			
			var addition = 5 + 16
			console.log(`addition = ${addition}`)
			
			var person= {
					'firstName': 'Ercan',
					'lastNmae': 'Tekoglan',
					'age': 34,
					'address':{
						'line1':'123 fake st',
						'line2': 'Unit 34',
						'city': 'Midland',
						'state': 'texas'
					}
			}
			
			console.log(`The value of 'person' is: ${person}, the data type is ${typeof person}'`)
			console.log(person)
			
			var submitBtn = document.querySelector("#submitBtn")
			console.log(`Submitbtn value is ${submitBtn}`)
		</script>
		<!-- sayfa acildigin da yukaridan asagiya okuma olur.once head kismi okundugu icin submitBtn null doner.cnuku deger assagida.  -->
	</head>
	
	<body>
		<h1>Login Below</h1>
		<div>
			Username: <input type="text" id="username" th:filed="${user.username}"/> 
		</div>
		<div>
			Password: <input type="password" th:field="${user.password}" />
		</div>
		<div>
			<button type="button" id="submitBtn">Submit</button>
			<script type="text/javascript">
			var submitBtn = document.querySelector("#submitBtn")
			console.log(`Submitbtn value is ${submitBtn}`)	
			console.log(submitBtn)
			
			//bir cok yerde referance edeceksen bu sekilde kullanmak daha uygun
			submitBtn.addEventListener('click',submitBtnClick)
			
			submitBtn.addEventListener('mouseover', function (){
				alert("Hey! I've been mouse overed")
			})
			
			// var usernameTextbox = document.querySelector("#username")
			// usernameTextbox.addEventListener('focus', function(){  
			//			console.log("The username textbox now has focus"))}
			
			var usernameTextbox = document.querySelector("#username")
			usernameTextbox.addEventListener('focus', () => 
						console.log("The username textbox now has focus"))
			
			// public void myMethod(){}
			 function submitBtnClick() {
				alert(`Hey! I've been clicked`)
			}
			</script>
		</div>
	</body>

</html>

 * 
 * 
 * */
 



/* LESSON 8
 * 
 * <!DOCTYPE html>
<html xmlns:th = "http://thymeleaf.org">
	<head >
		<title>Login</title>
	</head>
	
	<body>
		<h1>Login Below</h1>
		<div>
			Username: <input type="text" id="username" th:filed="${user.username}"/> 
		</div>
		<div>
			Password: <input type="password" th:field="${user.password}" />
		</div>
		<div>
			<button type="button" id="submitBtn">Submit</button>
			<script type="text/javascript">
			var submitBtn = document.querySelector("#submitBtn")	
			submitBtn.addEventListener('click',() =>{
				var username = document.querySelector("#username")
				var password = document.querySelector("#password")
				
				if (username.value == '' || password.value == '') {
					alert("Please enter a valid username and a password")
				} else {
					console.log("Inputs look valid, proceed with form submission")
				}
			})
			</script>
		</div>
	</body>

</html>

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
