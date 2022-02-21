package com.coderscampus.Lesson3_Overriding;

public class Lesson1Application {

	public static void main(String[] args) {
		
		Teacher physicsTeacher = new PhysicsTeacher();
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
		physicsTeacher.teach();
		System.out.println("----");
		
		Teacher compSciTeacher = new CompSciTeacher();
		System.out.println(compSciTeacher.getClasses());
		System.out.println(compSciTeacher.getLevelOfEducation());
		compSciTeacher.teach();
		System.out.println("----");
		
		Teacher quantumTeacher = new QuantumPhysicsTeacher();
		System.out.println(quantumTeacher.getClasses());
		System.out.println(quantumTeacher.getLevelOfEducation());
		quantumTeacher.teach();
		System.out.println("----");
	}

}