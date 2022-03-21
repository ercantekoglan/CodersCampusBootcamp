package com.hibernate_example.week_18_hibernate_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week18HibernateExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week18HibernateExampleApplication.class, args);
	}

}
/*
spring.datasource.driverClassName = com.mysql.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/hibernate_example
spring.datasource.username = root
spring.datasource.password = 1074701

# ddl-auto settings =  none, create, create-drop, update
# create, create-drop = very similar, use them carefully. 
# hibernate to do fiziseel olarak create database tables when you boot up your application.
# but it will also do it will drop them as well as you boot up so it will try to drop any tables that you have creadted, entities, 
#it will delete everything and will create everyting from scratch.it will re create them. it is greate for when you are in dev.
#while chanciong your da schema. want to start from frest datase etc etc    
# never use it while production. sahip oldugun butun verileri silersin.DIKKATLI KULLAN!!!!!!!!!!
# update = tarama sonucun da herhangi bir farklilik varsa kodunda, (java ile data arasinda) onu ayarlar ozellikle db tarafinda
spring.jpa.hibernate.ddl-auto = create
spring.jpa.show-sql = true 
# consolda scriptleri gormeni saglar
 * 
 */