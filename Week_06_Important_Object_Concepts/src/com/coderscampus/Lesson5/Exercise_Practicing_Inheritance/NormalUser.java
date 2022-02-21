package com.coderscampus.Lesson5.Exercise_Practicing_Inheritance;

public class NormalUser extends User {

	public NormalUser() {
		this.setReadAccess(true);
		this.setWriteAccess(true);
		this.setSuperUser(false);
	}

}
