package com.coderscampus.Lesson4_Using_Abstrac_Classes;

import com.coderscampus.Lesson3_Extending_Abstract_Classes.Part;

public class Body implements Part {

	public Body () {
		System.out.println("A Car's Body is being constructed.");
	}

	@Override
	public Integer getSize() {
		return 20;
	}

	@Override
	public Integer getBuildTime() {
		return 5;
	}

}