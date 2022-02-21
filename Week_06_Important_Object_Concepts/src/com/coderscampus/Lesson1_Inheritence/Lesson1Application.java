package com.coderscampus.Lesson1_Inheritence;

public class Lesson1Application {

	public static void main(String[] args) {
		PhysicsTeacher physicsTeacher = new PhysicsTeacher();
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
		
		System.out.println("------------");
		
		CompSciTeacher compSciTeacher = new CompSciTeacher();
		System.out.println(compSciTeacher.getClasses());
		System.out.println(compSciTeacher.getLevelOfEducation());
	}

}