package com.coderscampus.Lesson4_Using_Abstrac_Classes;

import com.coderscampus.Lesson3_Extending_Abstract_Classes.Part;

public class Frame implements Part {

	public Frame () {
		System.out.println("A Car's Frame is being constructed.");
	}

	@Override
	public Integer getSize() {
		return 10;
	}

	@Override
	public Integer getBuildTime() {
		return 10;
	}

}
