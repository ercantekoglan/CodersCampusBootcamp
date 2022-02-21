package com.coderscampus.Lesson1_Inheritence;

public class Teacher {
	private String classes;
	private String levelOfEducation;

	public Teacher () {
		this.classes = "No classes assigned";
		this.levelOfEducation = "No education assigned";
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