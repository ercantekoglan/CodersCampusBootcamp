package com.coderscampus.Lesson10_Stream_Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApplication {

	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<>();

		cars.add(new Car("Telsa", "Model S", 2019));
		cars.add(new Car("Telsa", "Model S", 2018));
		cars.add(new Car("Telsa", "Model X", 2016));
		cars.add(new Car("Telsa", "Model 3", 2019));
		cars.add(new Car("Ford", "F150", 2017));
		cars.add(new Car("Toyota", "Corolla", 1997));
		cars.add(new Car("Toyota", "Celica", 2002));
		
		//map fonksiyonu obje listesindeki bir degeri cekip baska bir listeye atmaya yarar
		//we can map one of the properties
		List<String> models = cars.stream()
								  .map(car -> car.getModel())
								  				 .collect(Collectors.toList());
		
		Set<String> brands = cars.stream()
			     				 .map(car -> car.getBrand())
			     				 				.collect(Collectors.toSet());
		
		
		models.stream()
			  .forEach(model -> System.out.println(model));
			
		System.out.println("-------");
		
		brands.stream()
			  .forEach(brand -> System.out.println(brand));
		
		
	}

}
