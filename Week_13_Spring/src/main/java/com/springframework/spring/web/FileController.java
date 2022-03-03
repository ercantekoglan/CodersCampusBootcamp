package com.springframework.spring.web;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.spring.Domain.User;
import com.springframework.spring.service.FileService;

//web ile ilgili olanlari web paketine koy.controllers web ile ilgili.services service gider.

//Controller listens - and respond...does function to serve responses from requests.
// bir web sitesine  bar dan enter dedigin anda server a istek gider. adres satirinda istenen seyin donmesini saglar.
//Controller - class level - return wab rage -html
//Restcontroller return raw date
@RestController
public class FileController {

	
	//application properties - injecting the values
		@Value(value = "${superuser.username}")
		private String superUsername;
		@Value(value = "${superuser.password}")
		private String superUserPassword;
		@Value(value = "${superuser.name}")
		private String superUserName;
		
	
	//never do that private Integer sum = 0;
	
	//Autowired is for anything do with injection -belirtilen satiri inject eder.
	@Autowired
	private FileService fileService;

	@Autowired
	@Qualifier("superUser") //2 bean den hangisini istedigimizi belirtiyoruz.we are telling to which one to grab.grab by method not type
	private User user;
	
	@Autowired
	private ApplicationContext ApplicationContext;
	
	//never do that sum++;
	
	//GetMapping - Controllerin parcasidir.Controller listens for requests. Listen for a request on
	// certain path, and directed to certain method.
	//GetMapping fetches data from server.
	//@GetMapping("") =  @GetMapping("localhost:8080")
	
	
	
	
	@GetMapping("/read-lines")
	public List<String> readLines () throws IOException {
		System.out.println(user);
		System.out.println("********************");
		System.out.println(superUsername);
		System.out.println(superUserPassword);
		System.out.println(superUserName);
		
//		return fileService.readFile("test.txt");
		return fileService.readFile();
	}
	
	@GetMapping("/hello-world")
	public String Hello () throws IOException {
		return "Hello World!";
	}
	
//	@GetMapping("/appcontext")
//	public List<String> readLiness () throws IOException {
//		FileService fileService = ApplicationContext.getBean(FileService.class);
//		System.out.println(fileService);
//		fileService = ApplicationContext.getBean(FileService.class);
//		System.out.println(fileService);
//		fileService = ApplicationContext.getBean(FileService.class);
//		System.out.println(fileService);
//		fileService = ApplicationContext.getBean(FileService.class);
//		System.out.println(fileService);
//		fileService = ApplicationContext.getBean(FileService.class);
//		System.out.println(fileService);
//		//olusturulan butun objeler aynidir.birden cok cagirmamiza ragmen tek obje var.
//		
//		// if work with singleton
//		return fileService.readFile("test.txt");
//	}
	
	//@PostMapping = serva a veri gonderir.method a parametre gonderiyomus gibi dusun
	@PostMapping("/hello-world")
	public String postHello () throws IOException {
		return "Posted data";
	}
}

