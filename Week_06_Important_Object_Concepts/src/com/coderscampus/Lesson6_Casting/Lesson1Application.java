package com.coderscampus.Lesson6_Casting;

public class Lesson1Application {

	public static void main(String[] args) {
		Teacher physicsTeacher = new PhysicsTeacher();

		// This is an alternative way of casting, but it's more verbose
//		PhysicsTeacher castedPhysicsTeacher = (PhysicsTeacher)physicsTeacher;
//		castedPhysicsTeacher.teach("Trevor Page");
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
		((PhysicsTeacher)physicsTeacher).teach("Trevor Page");
		System.out.println("----");
		
		Teacher compSciTeacher = new CompSciTeacher();
		System.out.println(compSciTeacher.getClasses());
		System.out.println(compSciTeacher.getLevelOfEducation());
		compSciTeacher.teach(36);
		System.out.println("----");
		
		Teacher quantumTeacher = new QuantumPhysicsTeacher();
		System.out.println(quantumTeacher.getClasses());
		System.out.println(quantumTeacher.getLevelOfEducation());
		quantumTeacher.teach();
		System.out.println("----");
	}

}