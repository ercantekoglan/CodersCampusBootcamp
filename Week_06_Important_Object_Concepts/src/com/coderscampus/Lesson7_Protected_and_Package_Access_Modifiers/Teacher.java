package com.coderscampus.Lesson7_Protected_and_Package_Access_Modifiers;

public class Teacher {
	private String classes;
	private String levelOfEducation;
	protected int totalNumberOfMarkedPapers;
	
	protected void markPapers () {
		System.out.println("I'm a teacher and I'm now marking papers.");
	}
	
	private void giveARaise () {
		System.out.println("Teacher gets a raise!");
	}
	
	public void teach () {
		System.out.println("I'm a teacher and I'm now teaching");
	}
	
	public void teach (String teacherName, int age) {
		System.out.println("I'm a " + age + " year old teacher called " + teacherName + " and I'm now teaching");
	}
	
	public void teach (int age) {
		System.out.println("I'm a " + age + " year old teacher and I'm now teaching");
	}
	
	public Teacher () {
		System.out.println("Inside the Teacher constructor");
		this.classes = "No classes assigned";
		this.levelOfEducation = "No education assigned";
		this.giveARaise();
	}
	
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getLevelOfEducation() {
		return levelOfEducation;
	}
	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}
}