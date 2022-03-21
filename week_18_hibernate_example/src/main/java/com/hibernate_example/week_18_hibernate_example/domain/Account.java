package com.hibernate_example.week_18_hibernate_example.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//lesson2
@Entity
@Table(name = "accounts")
public class Account {
	
	private Long accountId;
	private String accountName;
	//lesson3 one to many
	private List<Transaction> transactions = new ArrayList<>();
	//lesson4 manyToMany
	private List<User> users = new ArrayList<>();
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	// column u getter ile kullan
	//varchar degerini degistiriyoruz
	@Column(length = 100)
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	// ***********************
	@OneToMany(mappedBy = "account")	
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	@ManyToMany(mappedBy = "accounts")
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	// one account can have many transactions - one to many
	// account is parent here
	// one account can mapped to many transactions
	
	//  mappedBy'ın aldığı değer owned entity içerisinde tanımlanan field'e referans eder.
	
	// Bu açıklamada dikkat edilmesi gereken bir nokta şu. Object Oriented dünyada "owning side" Parent iken, 
	// SQL dünyasında foreign key'i içeren taraf "owning side" oluyor (yani Child) . Bu durum burada daha iyi açıklanmış.
	
	/*
	 * MappedBy signals hibernate that the key for the relationship is on the other side.

		This means that although you link 2 tables together, only 1 of those tables has a foreign key constraint to the other one.
		 MappedBy allows you to still link from the table not containing the constraint to the other table
		 
		 
		 With the mappedBy, you directly tell Hibernate/JPA that one table owns the relationship, and therefore it is stored as a column of that table.
	 */
	
	
	/* The name in mappedBy is telling Hibernate where to find the configuration for the JoinColumn. 
	 * (On the getAirline() method of AirlineFlight.) 
	 * 
	 * The way you mapped it putting the JoinColumn on airline, 
	 * you are telling Airline that it is responsible for maintaining the values over in the other table. 
	 * 
	 */
	
	/*
	 * 
	 * The annotation @JoinColumn indicates that this entity is the owner of the relationship 
	 * (that is: the corresponding table has a column with a foreign key to the referenced table), 
	 * whereas the attribute mappedBy indicates that the entity in this side is the inverse of the relationship, and the owner resides in the "other" entity. 
	 * This also means that you can access the other table from the class which you've annotated with "mappedBy" (fully bidirectional relationship).

	 */
	
	/*Eğer join tablosu olmasın istiyorsak parent tarafında OneToMany ve mappedBy, child tarafında ise ManyToOne ve JoinColumn birlikte kullanılır. Bu normal kullanım ve performanslı

		Parent mappedBy="..." ile karşı sınıftaki attribute ismini belirtir. Child ise JoinColumn ile kendi tablosunda hangi sütunun foreign key olarak kullanılacağını belirtir.

		Veritabanına önce parent kaydedilir. Parent'ın PK değeri, child tabloda FK olarak kullanılır.
	 * 
	 * 
	 * 
	 * /
	 */
	
}
