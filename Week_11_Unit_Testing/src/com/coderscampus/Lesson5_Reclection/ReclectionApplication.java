package com.coderscampus.Lesson5_Reclection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class ReclectionApplication {
	
	PersonRepository personRepo = new PersonRepository();
	CatRepository catRepo = new CatRepository();
	CarRepository carRepo = new CarRepository();
	//reflection: be able to change the behaviour during run time
	@Test
	public void reflection_test() {
		
		Person person = new Person();
		person.setAge(18);
		person.setName("Julie Smith");
		person.setEyeColor("Brown");
		
		
		Cat cat = new Cat();
		Car car = new Car();
		//class icindeki butun metrhodlari siraliyor.
		Method[] methods = person.getClass().getMethods();
		for(Method method: methods) {
			System.out.println(method.getName());
		}
		
		save(person, personRepo);
		save(cat, catRepo);
		save(car, carRepo);
		
	}
	
	public <T, R> void save(T obj, R repo) {
		
		Class<T> c = (Class<T>)obj.getClass();
		//String nameOfClass = c.getName();
		
		//	String nameOfRepository = nameOfClass + "Repository";
		try {
		//	Class<?> repositoryClass  = Class.forName(nameOfRepository);
			Method saveMethod = repo.getClass().getMethod("save", c);
			saveMethod.invoke(repo, obj);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			System.err.println("Oops there was an error getting the save method");
		}
	}
	
	
	
	
	//recursive method?
	public void save(Person person) {
		//get a Repository and call the save method on the repo
		PersonRepository personRepository = new PersonRepository();
		personRepository.save(person);
	}
	
	public void save(Cat cat) {
		//get a Repository and call the save method on the repo
		CatRepository catRepository = new CatRepository();
		catRepository.save(cat);
	}
	
	public void save(Car car) {
		//get a Repository and call the save method on the repo
		CarRepository carRepository = new CarRepository();
		carRepository.save(car);
	}
//dynamicly run time invoke a method based on string
}





