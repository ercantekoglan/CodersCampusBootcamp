package com.coderscampus.Lesson4_Using_Abstrac_Classes;

import com.coderscampus.Lesson3_Extending_Abstract_Classes.Part;

public class GenericFactoryApplication {

	public static void main(String[] args) {
		GenericFactory carFactory = new CarFactory();
		Body body = new Body();
		Frame frame = new Frame();
		Electronics electronics = new Electronics();

		Part[] parts = new Part[3];
		parts[0] = body;
		parts[1] = frame;
		parts[2] = electronics;

		Product car = carFactory.build(parts);
		System.out.println("We've built a new car: " + car);
	}

}