var submitBtn = document.querySelector("#submitBtn")
//var another Array = new Array(), assagidaki daha kisa bir yontem

var users = []

submitBtn.addEventListener('click', () => {
	var username = document.querySelector("#username")
	var password = document.querySelector("#password")

	if (username.value == '' || password.value == '') {
		alert("Please enter a valid username and a password")
	} else {
		console.log("Inputs look valid, proceed with form submission")
		
		//keep login attemps as long as valid login
		var user = {
			"username": username.value,
			"password": password.value
		}
		
		//how to add user to users array
		users.push(user);
	}
})

username.addEventListener('blur', () => {
	var username = document.querySelector("#username")
	var password = document.querySelector("#password")
	
	//when we post data we sholdnt pass data via url parameters
	//fetch 2 arg var, 1 url-string 2 object
	
	//body e ojbe gondermek icin user obje kuruyoruz ve girilen degerleri icine atiyoz
	var user = {
		"username": username.value,
		"password": password.value
	}
	// fetch(endpoint,obj)
	// fetch(`http://localhost:8080/users/exists?username=${username.value}&password=${password.value}` = username text box daki degeri grab yap
	// getmapping cagirir bu da url ye data gondermemiz anlamina gelir.bunu istemeyiz.get ile body ye gondermezsin data
	// response object olarak gelir
	fetch(`http://localhost:8080/users/exists`, { // objects have key value pairs
		method:"POST",
		headers: {
			"Content-Type": "application/json" // bunu eklemezsen plain text olarak gonderir datayi, biz JSON olarak gondermemiz lazim - networkde request header e e bak
		},
		body: JSON.stringify(user) //body of the request
		// postmaooing e aslinda 2 key value lu bir obje gonderiyoruz - 
//		body: `{
//			"username": "${username.value}",
//			"password": "${password.value}"
//		}`  => bu uzun hali kisa hali icin yukarida user objesi kurduk
	})
	
		// uzun hali
		//.then((response) => {
		//	return response.json()
		//})
		
		.then((response) => response.json()) //response.json dedigimizde response objesinin body sini gorebiliyoruz.it takes the entire body and turs the json
		.then((Jsondata) => {
			console.log(Jsondata) // true or false doner.donen derei de controller da ki method a gonderir
		})
})