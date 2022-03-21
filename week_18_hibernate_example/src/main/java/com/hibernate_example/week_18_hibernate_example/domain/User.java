package com.hibernate_example.week_18_hibernate_example.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity // Class name = User, DB Table name = user
@Table(name = "users")
public class User {
	private Long userId;
	private String username;
	private String password;
	private String name;
	private LocalDate createdDate;
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	private List<Account> accounts = new ArrayList<>();
	private Address address;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// when we map the ManyToMany on parent side where we define Join Table.because ManyToMAny means implies the join table
	// ******ManyToMany ve OneToMany = by default lazly fetched*******
	// performans acisindan lazy yapmanda yarar var.sadece ihtiyacin olan biliyi sec. server i bosu bosuna yorma
	// fetch tablolardan veri cekme olayidir.lazy ve eager yaparak bunu yonlendirirsin.lazy de sadece ihtiyacin oldugunda cekersin
	// @ManyToMany(fetch = FetchType.EAGER)
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_account",
	           joinColumns = @JoinColumn(name = "user_id"), 
	           inverseJoinColumns = @JoinColumn(name = "account_id"))
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	//by default one to one is eager
	// OneToOne relationship by defult eagerly fech data which means 
	// anytime you fetch parent object, the child object will be also fetched by default without you do anthing
	@OneToOne(mappedBy = "user", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true  )
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", accounts=" + accounts + ", address=" + address + "]";
	}
	// dublica onlemek icin
	@Override
	public int hashCode() {
		return Objects.hash(userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userId, other.userId);
	}
	
	
	
	
}
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.apache.tomcat.jni.Address;
//
//// many-to-many user -account / parent -> user, child -> account
//
//@Entity // Class name = User, DB Table name = user
//@Table(name = "users")
//public class User {
//	private Long userId;
//	private String username;
//	private String password;
//	private String name;
//	private List<Account> accounts = new ArrayList<>();
//	
//	//one to one oldugu icin collection kullaniyoruz, 1 user 1 adres
//	private Address address;
//
//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//	public Long getUserId() {
//		return userId;
//	}
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	@ManyToMany //join table demek. join table i parentte kodla
//	@JoinTable(name = "user_account", //name of the join table
//					   joinColumns = @JoinColumn(name = "user_id"), // parent side
//					   inverseJoinColumns = @JoinColumn(name = "account_id")) //child side
//	public List<Account> getAccounts() {
//		return accounts;
//	}
//	public void setAccounts(List<Account> accounts) {
//		this.accounts = accounts;
//	}
//	
//	@OneToOne(mappedBy = "user")
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//}
//
//
//
//lesson 3 


///*
//* domain package = database table
//* domain represents objects that represents database tables
//* 
//* this is User table table
//* 
//* hibernate(JPA) = is the process of mapping a java objects to database table such that we can read from it and write to it.or update or delete
//* hibernate is mapping
//* 2 yonde de calisir
//* 
//*/
//
////@Entity annotation is class level
////entity means an object represents a table = domain object = database table
////@Entity = this class represents a table
//
//package com.coderscampus.week18.domain;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;

////JPA = java persistence API bu yuzden persistence i seciyoruz
////JPA is s interface
////hibernate is technology that implements JPA
//
//@Entity // class name = User, DB Table name = user
////entity yaptigimiz class da, class ismi ile ayni isimde table ismi var demek
////iki isimde olura "online_name" seklinde olur.
////User burada reserved word oldugu icin sorun olur.bunun icin override yapmamiz lazim. Users yapicaz
//@Table (name = "users") // isimler ayni olursa bunu yazmana gerek yok
//public class User {
//	
//	private Long userId; // primary key
//	private String username;
//	private String password;
//	private String name;
//	
//	// ustteki degerler column ile eslesiyo.isim ve type olarak
//	
//	//@Id // pk ekliyoruz
//	//@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increment gerekli degil ama iyi olur kullanmak
//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//	public Long getUserId() {
//		return userId;
//	}
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//}