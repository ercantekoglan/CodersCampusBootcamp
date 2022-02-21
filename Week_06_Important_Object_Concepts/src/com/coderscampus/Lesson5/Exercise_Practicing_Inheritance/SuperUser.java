package com.coderscampus.Lesson5.Exercise_Practicing_Inheritance;

public class SuperUser extends User {

	public SuperUser() {
		this.setReadAccess(true);
		this.setWriteAccess(true);
		this.setSuperUser(true);
	}
	
	

}
