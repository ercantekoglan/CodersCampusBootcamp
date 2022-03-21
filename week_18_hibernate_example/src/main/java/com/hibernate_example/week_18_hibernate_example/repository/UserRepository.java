package com.hibernate_example.week_18_hibernate_example.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hibernate_example.week_18_hibernate_example.domain.User;

//UserRepository  interface olarak alip Jpa dan extend ediyoruz.CRUD ozellikleri getiriyo.we need to map 2 things 
// T=type of domain objects (what is the entitiy we are working?)this repository is just for specific table 
// ID = type of the id 

//public interface UserRepository extends JpaRepository<T,ID>
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
	// select * from users where **username = :username
	// **username tabloda field olmali
	// User findByUsername(String name); we return only one user
	List<User> findByUsername(String username); // list yapiyoruz unku 1 den fazla deger donerse hata olusmasin
	
	// select * from users where name = :name
	List<User> findByName(String name);
	
	// select * from users where name = :name and username = :username
	List<User> findByNameAndUsername(String name , String username);
	
	List<User> findByCreatedDateBetween(LocalDate date1, LocalDate date2);
	
	//Custom Queries with JPQL
	//limit 1 = 1 row ile sinirla demek
	// @Query("select*from users where username = :username limit 1") == native sql bu runtime da error alirsin
	 @Query("select u from User u where username = :username") //users yerine class ismi gerekli, table ismi degil
	 List<User>  findExactlyOneUserByUsername(String username); // birden cok kayit cikarsa hata alinacak
	 
	 // ustteki querylerde sistem cok fazla select * from yaptigi icin performans kaybina sebep oluyor.
	 // bunu onlemek icin findAll metoduna kendi query mizi yazarak override ediyoruz. join = inner join oldugu icin
	 // view de filtrelenmis olarak karsimiza cikar. left join yaparsak hesabi olmayanlari da gorebiliriz.
	 //	 @Query("select u from User u" 
	 //			 + "join u.accounts" 
	 //			 + "join u.address")
	 //	 List<User> findAll();
		@Query("select u from User u"
				+ " left join fetch u.accounts"
				+ " left join fetch u.address")
		// fetch ekledigimizde = fetch the data for the data(account - adres) along with the join and populate into the user object
	 
	 //List<User> findAll(); list yaparsak duplicate user goruruz
		Set<User> findAllUsersWithAccountsAndAddresses();
}
