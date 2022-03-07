package com.coderscampus.Week15_Spring_MVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week15SpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week15SpringMvcApplication.class, args);
	}

}

/*// Lesseon 1
 * 
 * Controllers return views which means HTML side
 * 
 * MVC = Model View Controller
 *
 *
 *Thymeleaf is a java technology that allows us to create plain old html files
 *and have them interface with our conrollers  such that we can pass data 
 *to the html files from java, and java to html
 * 
 */


/*//Lesson 2
 * 
 * Model is essentially HashMap = keys and values
 * 
 * <html xmlns:th="http://thymeleaf.org">
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<h1>Welcome</h1>
		<div style="color: gray;" th:inline="text">Hi there, [[${firstName}]] [[${lastName}]]</div>
	div yerine a,spn gibi tagler de kullanilabilir
		<div th:text="|Hi there, ${firstName} ${lastName}|">SDLKFJKLSDJF LKSJDFLKJSDKLF J</div>
		 div tag  div scope da yazdigin yazinin ustune override yapar.
		
	</body>
</html> 
 * 
 * 
 *    th = thymelead in kisaltilmis hali.namespace dir.
 *    th:inline div e ait bit attribute, sttle gibi
 *    get the inline attribut efrom this th namespace.
 *    inline attribute allows us to inject our data from the model into our tag [[${firstName}]] 
 *    
 * 	server i her defasinda yeniden baslatmaamk icin, html deki update i hemen gormek icin 
 *  proverties de cache i false yap.
 *  
 *  html dosyasinda bir degisiklik yapinca serveri yeniden baslatmadan degisikligi gorebilirsin.
 *  server de live calisiyosanverimli olur.
 * 
 * */


/*Lesson 3
 * 
 * <html xmlns:th="http://thymeleaf.org">
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<h1>Welcome</h1>
		<form action="" method="post">
			<button>Submit</button>
		</form>

	</body>
</html> 
 * 
 * to sumbit data html to data = form(baskada var)
 * 
 * action = maens where am i sending this data. bos birakirsan bulundugun url uzerinde islem yapar.ayni sayfatda kalir yani
 * method = http request(get,post,put, delete)
 * bu kodda submit e basinca datayi post edeicek.
 * 
 * 
 * 
 * */



/*LESSON 4
 * 
 *   <html xmlns:th="http://thymeleaf.org">
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<h1>Welcome</h1>

		<form action="" method="post">
			<div>
				<label>First Name: </label>
				mapping data with th field
				<input type="text" th:field="${person.firstName}"/>bunu yap!!    //person.setfirstName gibi dusun
				***key = person
				 inputta id ="", name+"" yerine thymeleaf tecj kullaniyoruz.
				 
			</div>
			<div>
				<label>Last Name: </label>
				<input type="text" th:field="${person.lastName}"/>
			</div>
			<div>
				<button>Submit</button>
			</div>
		</form>
	</body>
</html> 
 * 
 * 
 * 
 * 
 */


/*LESSON 6
 * 
 * <html xmlns:th="http://thymeleaf.org">
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<h1>Welcome</h1>

		<form action="" method="post">
		--> burada id ye bagli bir islem serisi yaptigimiz icin person u mayleyip id degerini almamiz gerekiyor.
		--> post da post edilen id degeri buraya geliyor ve islem yapabiliyoruz. input type hidden olursa sayfa da gozukmez
		--> ama kaynaklar kisminda deger gorulur, islem yapabilirsin.
			<input type="hidden" th:field="${person.id}"/>
			<div>
				<label>First Name: </label>
				<input type="text" th:field="${person.firstName}"/>
			</div>
			<div>
				<label>Last Name: </label>
				<input type="text" th:field="${person.lastName}"/>
			</div>
			<div>
				<button>Submit</button>
			</div>
		</form>
	</body>
</html> 
 * 
 * 

 */


/*LESSON 8
 * 
 * <html xmlns:th="http://thymeleaf.org">
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<h1>Welcome</h1>
		
		<div>
		
		******----->  for each gibi dusun th:each i. people listesinde ne kadar person varsa 
		*o kadar her birinde span tag i olan div kuracak.span icinde inline kurarsan eger
		*yan yana yazdirir.
		*div block tipi dir span degildir. 
			<div th:each = "storedPerson : ${people}">
				<span th:inline="text">
				 Person #[[${storedPerson.id}]] : [[${storedPerson.firstName}]] [[${storedPerson.lastName}]]
				</span>
			</div> 

		<form action="" method="post">
		
			<input type="hidden" th:field="${person.id}"/>
			<div>
				<label>First Name: </label>
				<input type="text" th:field="${person.firstName}"/>
			</div>
			<div>
				<label>Last Name: </label>
				<input type="text" th:field="${person.lastName}"/>
			</div>
			<div>
				<button>Submit</button>
			</div>
		</form>
	</body>
 * 
 * 
 * 
 * 
 */


/* LESSON 9 DELETE
 * 
 * 
 * <html xmlns:th="http://thymeleaf.org">
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<h1>Welcome</h1>
		
		<div th:each="storedPerson : ${people}">
			<span th:inline="text">
				Person #[[${storedPerson.id}]]: [[${storedPerson.firstName}]] [[${storedPerson.lastName}]]
			</span>
		</div>

		<hr/>
		<form action="" method="post">
			<input type="hidden" th:field="${person.id}"/>
			<div>
				<label>First Name: </label>
				<input type="text" th:field="${person.firstName}"/>
			</div>
			<div>
				<label>Last Name: </label>
				<input type="text" th:field="${person.lastName}"/>
			</div>
			<div>
				<button>Submit</button>

			</div>
			
		--> listeden istigimiz people u silemek icin yeni bir form ve button ekliyoruz.burda js olsa daha farkli olabilirdi ama halaa gormedigmiz icin yeni form kuruyoruz.
		th:if = block icindeki expression true ise delete button u gozukecek. deger false ise
		delete button u gozukmeyecek.bu dinamik olarak calisiyo anlamina gelir.if icerisinde person id var ise gozukecek demek bu.
		@ ile daha duzgun url yaziliyoruz.
		
		</form>
		
		-->action = @ ole donamik url kuruyoruz.
		
		<form th:action="@{/persons/{personId}/delete(personId=${person.id})}" method="post" th:if="${person.id != null}">
		<form th:action="@{/persons/{personId}/delete/{someVar}(personId=${person.id}, someVar=${person.someVar})}" method="post" th:if="${person.id != null}">
			<button>Delete</button>
		</form>
	</body>
</html> 
 * 
 */



/*LESSON 10 Adding Extra Navigation Links
 * 
 * <html xmlns:th="http://thymeleaf.org">
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<h1>Welcome</h1>

		--> isim ve soy isime tiklanabilmesi icin <a> tah i icine aldik.
		<div th:each="storedPerson : ${people}">
			<span th:inline="text">
				Person #[[${storedPerson.id}]]: <a th:href="@{/persons/{personId}(personId=${storedPerson.id})}">[[${storedPerson.firstName}]] [[${storedPerson.lastName}]]</a>
			</span>
		</div>
		<hr/>
		<form action="" method="post">
			<input type="hidden" th:field="${person.id}"/>
			<div>
				<label>First Name: </label>
				<input type="text" th:field="${person.firstName}"/>
			</div>
			<div>
				<label>Last Name: </label>
				<input type="text" th:field="${person.lastName}"/>
			</div>
			<div>
				<a href="/persons" th:if="${person.id != null}" style="margin-right: 2em;">Back</a>
				<button>Submit</button>

			</div>
		</form>
		<form th:action="@{/persons/{personId}/delete(personId=${person.id})}" method="post" th:if="${person.id != null}">
			<button>Delete</button>
		</form>
	</body>
</html>
 * 
 * 
 */

 