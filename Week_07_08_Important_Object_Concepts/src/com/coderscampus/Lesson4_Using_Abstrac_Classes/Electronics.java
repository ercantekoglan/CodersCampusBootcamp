package com.coderscampus.Lesson4_Using_Abstrac_Classes;

import com.coderscampus.Lesson3_Extending_Abstract_Classes.Part;

public class Electronics implements Part {

	public Electronics () {
		System.out.println("A Car's Electronics is being constructed.");
	}

	public Integer getSize() {
		return 2;
	}

	public Integer getBuildTime() {
		return 30;
	}

}