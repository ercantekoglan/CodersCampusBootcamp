package com.coderscampus.Lesson2_Consructors;

public class PhysicsTeacher extends Teacher {
	
	public PhysicsTeacher () {
		System.out.println("Inside the PhysicsTeacher constructor");
		this.setClasses("PHYS 101, PHYS 201");
		this.setLevelOfEducation("Masters of Science");
	}
	
}