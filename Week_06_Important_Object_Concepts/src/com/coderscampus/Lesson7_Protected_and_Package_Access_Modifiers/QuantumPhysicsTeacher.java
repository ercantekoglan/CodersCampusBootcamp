package com.coderscampus.Lesson7_Protected_and_Package_Access_Modifiers;

public class QuantumPhysicsTeacher extends PhysicsTeacher {

	public QuantumPhysicsTeacher () {
		System.out.println("Inside the QuantumPhysicsTeacher constructor");
		this.setClasses("QPHY 101, QPHY 201");
		this.setLevelOfEducation("PhD");
	}
	
	public void teach () {
		System.out.println("I'm a quantum physics teacher, and I'm now in a super-position of teaching.");
	}
}