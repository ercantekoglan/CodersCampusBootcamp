package com.coderscampus.Lesson7_Protected_and_Package_Access_Modifiers;

public class PhysicsTeacher extends Teacher {
	
	public PhysicsTeacher () {
		System.out.println("Inside the PhysicsTeacher constructor");
		this.setClasses("PHYS 101, PHYS 201");
		this.setLevelOfEducation("Masters of Science");
	}
	
	public void teach () {
		System.out.println("I'm a physics teacher and I'm now teaching physics");
	}
	
	public void teach (String teacherName) {
		System.out.println("I'm a physics teacher called " + teacherName + " and I'm now teaching physics");
	}
	
}