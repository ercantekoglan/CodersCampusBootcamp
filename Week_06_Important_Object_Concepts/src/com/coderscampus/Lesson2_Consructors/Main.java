package com.coderscampus.Lesson2_Consructors;

public class Main {

	public static void main(String[] args) {
		PhysicsTeacher physicsTeacher = new PhysicsTeacher();
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
		System.out.println("------------------------------");
		CompSciTeacher compSciTeacher = new CompSciTeacher();
		System.out.println(compSciTeacher.getClasses());
		System.out.println(compSciTeacher.getLevelOfEducation());
		System.out.println("------------------------------");
		QuantumPhysicsTeacher quantumTeacher = new QuantumPhysicsTeacher();
		System.out.println(quantumTeacher.getClasses());
		System.out.println(quantumTeacher.getLevelOfEducation());
	}

}