package com.coderscampus.Assignment4;

public class Student {
	private String id;
	private String name;
	private String courseName;
	private String grade;

	public Student(String id, String name, String courseName, String grade) {
		this.id = id;
		this.name = name;
		this.courseName = courseName;
		this.grade = grade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
