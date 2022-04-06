var usernameTextBox = document.querySelector('#username')

// usernameTextBox = text box in tamami, icinde girdigimiz deger degil

// THIS IS FOR DEMONSTRATION!!!!
// function myPromise = new Promise(function(resolve, reject){})
// function mypromise(){
//		 return new Promise( (resolve, reject) => {
	// let  is like var...var global davranir, let local davranir.var function scope da davranir. let daha loal
	// ornegin if block ornergi...function scoped
	//if(true){
		//var i =1 // java da bu degere if blogunun disinda ulasamazsin
		// let i = 1  ise bu block icinde kalir.asagidaki log da ulasilamaz
//	}
//	if(true){
//		console.log(i)
//	}
//	let i = 1
	
//	if(i === 1){
//		resolve("hey, i ===1, so we are cool!")
//	}else {
//		reject("Absolute fail. i is not 1, booo")
//	}
	
// })
// }
// mypromise().then((message) =>{
// 	console.log(message)
// }).catch( (message) => {
// 	console.log(message)
// })

// fetch aslinda returs promise object

var eyeIcons = document.querySelectorAll('.fa-eye') //selecting by class

eyeIcons.forEach( (eyeIcon) => {
	eyeIcon.addEventListener( 'click', () => {
		//console.log(eyeIcon)
		//console.log(eyeIcon.classList)
		if(eyeIcon.classList.contains('fa-eye')){
			eyeIcon.classList.replace('fa-eye', 'fa-eye-slash') // fa-eye-slash ismini siteden aldik.fontawesome.com dan
			//console.log(eyeIcon.getAttribute('id')) // register.html den id ye gore cekiyoruz ve hangi elemente tikladigimizi console da gosteriyo
			if(eyeIcon.getAttribute('id') === 'passwordEyeIcon'){
				document.querySelector("#password").type = 'text'
			} else {
				document.querySelector('#confirmPassword').type = 'text' 
			}
				
		}else {
			eyeIcon.classList.replace('fa-eye-slash', 'fa-eye')  //else blogunda iconlari reverse ediyoruz
			
			if(eyeIcon.getAttribute('id') === 'passwordEyeIcon'){
				document.querySelector("#password").type = 'password'
			} else {
				document.querySelector('#confirmPassword').type = 'password' 
			}
		}
	})
})

usernameTextBox.addEventListener('blur', () => {
	var user = {
		'username': usernameTextBox.value
	}
	// call the asynch function
		checkIfUserExists(user)
		console.log("here we are after the fetch has completed")  // normal akista fetch once tamamlamasi lazim akisi.once yazilmasinin sebebi js in asych olmasi
})
// asynch code for promise
async function checkIfUserExists(user) { 
	let responseEntity = await fetch('/users/exists', { //wait for it to complete it
		method: 'POST',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(user)
	})
	let userExists = await responseEntity.json()
	// .then( (responseEntity) => responseEntity.json() ) // return body of the responds - await kullandigimiz icin gerek kalmiyor	
	//	.then( (data) => {
	//	if (data === true) {
		if (userExists === true) {
			// this users already exists!
			console.log("username already exists")
			usernameTextBox.focus()
			usernameTextBox.select()
			showErrorAnimation().then( (message) => {
				//animation is completed at this point
			console.log("we are now in the callback function")	
				console.log(message)
			usernameTextBox.style.backgroundColor = 'rgb(255,255,255)'
			})
		}
}

function showErrorAnimation(){
	return new Promise( (resolve, reject) => {
	
	console.log("We are in the showErrorAnimation function")
	var i = 0
	var animationInterval = setInterval( () => {
		i++
		usernameTextBox.style.backgroundColor = `rgb(${i},0,0)`
		if(i >= 255) {
			clearInterval(animationInterval)
				resolve("Done executing animation code")
		}	
	}, 5)

})
	
}












// PROMISES ********************

/*var usernameTextBox = document.querySelector('#username')

// usernameTextBox = text box in tamami, icinde girdigimiz deger degil

// THIS IS FOR DEMONSTRATION!!!!
// function myPromise = new Promise(function(resolve, reject){})
// function mypromise(){
//		 return new Promise( (resolve, reject) => {
	// let  is like var...var global davranir, let local davranir.var function scope da davranir. let daha loal
	// ornegin if block ornergi...function scoped
	//if(true){
		//var i =1 // java da bu degere if blogunun disinda ulasamazsin
		// let i = 1  ise bu block icinde kalir.asagidaki log da ulasilamaz
//	}
//	if(true){
//		console.log(i)
//	}
//	let i = 1
	
//	if(i === 1){
//		resolve("hey, i ===1, so we are cool!")
//	}else {
//		reject("Absolute fail. i is not 1, booo")
//	}
	
// })
// }
// mypromise().then((message) =>{
// 	console.log(message)
// }).catch( (message) => {
// 	console.log(message)
// })

// fetch aslinda returs promise object

var eyeIcons = document.querySelectorAll('.fa-eye') //selecting by class

eyeIcons.forEach( (eyeIcon) => {
	eyeIcon.addEventListener( 'click', () => {
		//console.log(eyeIcon)
		//console.log(eyeIcon.classList)
		if(eyeIcon.classList.contains('fa-eye')){
			eyeIcon.classList.replace('fa-eye', 'fa-eye-slash') // fa-eye-slash ismini siteden aldik.fontawesome.com dan
			//console.log(eyeIcon.getAttribute('id')) // register.html den id ye gore cekiyoruz ve hangi elemente tikladigimizi console da gosteriyo
			if(eyeIcon.getAttribute('id') === 'passwordEyeIcon'){
				document.querySelector("#password").type = 'text'
			} else {
				document.querySelector('#confirmPassword').type = 'text' 
			}
				
		}else {
			eyeIcon.classList.replace('fa-eye-slash', 'fa-eye')  //else blogunda iconlari reverse ediyoruz
			
			if(eyeIcon.getAttribute('id') === 'passwordEyeIcon'){
				document.querySelector("#password").type = 'password'
			} else {
				document.querySelector('#confirmPassword').type = 'password' 
			}
		}
	})
	console.log("here we are after the fetch has completed")  // normal akista fetch once tamamlamasi lazim akisi.once yazilmasinin sebebi js in asych olmasi
})

usernameTextBox.addEventListener('blur', () => {
	var user = {
		'username': usernameTextBox.value
	}
	//The Fetch API interface allows web browser to make HTTP requests to web servers.

	fetch('/users/exists', {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(user)
	})
	.then( (responseEntity) => responseEntity.json() ) // return body of the responds
	.then( (data) => {
		if (data === true) {
			// this users already exists!
			console.log("username already exists")
			usernameTextBox.focus()
			usernameTextBox.select()
			showErrorAnimation().then( (message) => {
				//animation is completed at this point
			console.log("we are now in the callback function")	
				console.log(message)
			usernameTextBox.style.backgroundColor = 'rgb(255,255,255)'
			})
		}
	})
})
function showErrorAnimation(){
	return new Promise( (resolve, reject) => {
	
	console.log("We are in the showErrorAnimation function")
	var i = 0
	var animationInterval = setInterval( () => {
		i++
		usernameTextBox.style.backgroundColor = `rgb(${i},0,0)`
		if(i >= 255) {
			clearInterval(animationInterval)
				resolve("Done executing animation code")
		}	
	}, 5)

})
	
}*/








// *********************************************


// BEFORE PROMISES


/*
var usernameTextBox = document.querySelector('#username')
// usernameTextBox = text box in tamami, icinde girdigimiz deger degil
usernameTextBox.addEventListener('blur', () => {
	var user = {
		'username': usernameTextBox.value
	}
	//The Fetch API interface allows web browser to make HTTP requests to web servers.

	fetch('/users/exists', {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(user)
	})
	.then( (responseEntity) => responseEntity.json() ) // return body of the responds
	.then( (data) => {
		if (data === true) {
			// this users already exists!
			console.log("username already exists")
			usernameTextBox.focus()
			usernameTextBox.select()
			showErrorAnimation( () => {
				//animation is completed at this point
			console.log("we are now in the callback function")	
			usernameTextBox.style.backgroundColor = 'rgb(255,255,255)'
			})
		}
	})
})

function showErrorAnimation(callback){
	
	console.log("We are in the showErrorAnimation function")
	var i = 0
	var animationInterval = setInterval( () => {
		i++
		usernameTextBox.style.backgroundColor = `rgb(${i},0,0)`
		if(i >= 255){
			clearInterval(animationInterval)
				console.log("Done executing animation code")
					callback()
		}	
	}, 5)

}

*/