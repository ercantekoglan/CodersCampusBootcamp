package com.springframework.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //- farkli package de classin varsa springin taramasi icin eklenir
//@ComponentScan("com.coderscampus") - parent package dan taratmaya basliyor

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


//Maven is Dependency Management System +>pom.xml
//Spring Boot = get up and run web app - bizim icin gerekli dosya ayarlamalarini yapar.
//Any @Component is marked, is going to manage by Spring,
//It is managed inside of the Application Context

/*Inversion Of Control = Spring bizim icin ayarlamalari kontrol eder.Inversion of control bir 
 * yazılım tasarım prensibidir. Ioc ile Uygulama içerisindeki obje instance’larının yönetimi sağlanarak, 
 * bağımlılıklarını en aza indirgemek amaçlanmaktadır. Projeniz deki bağımlılıkların oluşturulmasını ve 
 * yönetilmesini geliştiricinin yerine, framework’ün yapması olarak da açıklanabilir.
 
 *Yazdığımız kod bloğu çalışacağı zaman, framework bizim kodumuzu çağırır ve çalıştırır 
 *daha sonra kontrol yeniden framework’e geçmesi olayının tümüne Inversion Of Control adı verilmektedir.
 */


//Dependency Injection = Dependency injection kaba tabir ile bir sınıfın/nesnenin 
//bağımlılıklardan kurtulmasını amaçlayan ve o nesneyi olabildiğince bağımsızlaştıran 
//bir programlama tekniği/prensibidir.

//Dependency Injection uygulayarak; bir sınıfının bağımlı olduğu nesneden bağımsız 
//hareket edebilmesini sağlayabilir ve kod üzerinde olası geliştirmelere karşın 
//değişiklik yapma ihtiyacını ortadan kaldırabilirsiniz.

/*Inversion of control makalesinde bahsettiğim gibi frameworkler sizin sadece business logic
 *  ile ilgilenmenizi sağlar, diğer tüm operasyonları ise kendi halleder. Bunu da frameworkten 
 *  bağımsız bir şekilde kod yazabilmemiz için genellikle dependency injection uygulayarak sağlar.
 */


/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

/* APPLICATON CONTEXT 
 * 
 * It is hearth of the Spring 
 * 
 *  Anything marked as @Component , is going to manage by Spring,
 *  It is managed inside of the Application Context
 * 
 *  Run a bastigin da Application Context instantiate all objects.
 *  i.e. = FileController fo = new FileController => is instantiate and stored in appliation context .
 * */ 


/* SINGLETON DESIGN PATTERN
 * 
 * When you go to instantiate an instance of a class, we first check to see if we 
 * have already instantiated it before, if we have already instantiated the object
 * grab that one and return it. So we are not instantiate twice.(eger yoksa 1 tane kurar.)
 * 
 * Componenet olarak isaretlenen her sey(controller,service,restcontroller)
 * will be managed and instatiated as singleton object as default.
 * 
 *  NEVER maintain state in singleton.singleton object ile calisirken ASLA maintain state(startrin values in valuables
 *  that are accesible to the whole class = instance variables
 *  
 *  state i method icinde tanimla
 *  
 *  sadece bi instance oldugundan dolayi baska bir yerdeki kodlayici da buna ulasabilir.
 *  
 *  ornegin iki kullanici ayni anda rapor almaya calisirsa yanlislikla ikiside ayni sonucu alabilir.
 *  
 *  singleton object is going to be shared by everyone
 *  
 *  degiseknini method icinde tanimla!!!!!!!!!!!!!!
 *  
 *  Dont store state in your instances if they managed by Spring.If they are not managed by spring 
 *  if we are using same thing like data transfer obj it is ok.
 *  
 * */ 


/*@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
 * 
 * ile Springin singleton olacak calismamasini soyleyebiliriz ama onerilmez.

 */


/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

/*Application Properties File
 * 
 * spring boot app
 * 
 * Where you put your properties and configurations for those properties - configuration environment
 * help to configure your environment(personal comp which is local, dev - development environment)
 * local and dev could have different configurations. aplication.properties bunu ayarlar.
 * 
 * for naming, if you have 2 words, do not use camel case, use .
 * 
 * user.file , not userFile
 */
 
/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////

/* SPring Profiles
 * 
 * sag clikc src/main/resources -> new file -> application-dev.properties, application-qa.properties yeni proller olusturur.
 * 
 * 
 * application.properties default dosya.
 * 
 * yeni ekledigin environment propertisini spring e tanitmak icin -> run arrow ->run congigurations ->arhuments sekmesi 
 * -> VM aruments (virtual machine) -> -Dspring.profiles.active = dev
 *    -D = here is an argument that about to give it to you
 */

