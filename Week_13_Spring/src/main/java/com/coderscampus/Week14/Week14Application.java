package com.coderscampus.Week14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week14Application {

	public static void main(String[] args) {
		SpringApplication.run(Week14Application.class, args);
	}

}

/*
 * Wehnever we send http request across the internet, it actually comes in sort
 * of two parts -> Header and Body
 * 
 * 
 * Response header and body => comes from back from the java server
 * 
 * respons = method return
 * 
 * Request = header body
 * 
 * ---------------------------------------
 * PostMapping -> Past request certain body
 * GetMapping -> Get request doesnt contain body
 * 
 * Parametreler header de yer alirsa, url ule birlikte gelir.Bunu istemeyiz, o yuzden body de calisiriz
 * 
 * Post request => Send data along inside of the body of the request.
 *---------------------------------------------
 *
 *Getting data from the server to HTML
 *Post, sending data from HTML to server(java)
 *
 *-----------------------------------------------
 *Query parameter ? den sonrasidir. key value olarak ilerler
 *
 * ------------------------------------------------
 * 
 * Get request only ever makes use parameters in the URL. 
 * Post not send data inside of the query params, but instead as a body.
 * 
 * Post -> sending data, use we want to use the body of the post request.
 * 
 * Get Request has not  got body -only url(header)
 * Post request has body - send data to the server
 * 
 * ******************************************************
 * 
 * REST = communication between your app and someone elses app  via public API(application programming interface)
 * 
 * URL de ? den sonrakli seyler query parametreleridir. key= value seklinde ilerler ve & ile baglanirlar
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
