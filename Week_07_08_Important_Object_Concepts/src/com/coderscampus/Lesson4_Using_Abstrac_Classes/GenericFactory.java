package com.coderscampus.Lesson4_Using_Abstrac_Classes;

import com.coderscampus.Lesson3_Extending_Abstract_Classes.Part;

public abstract class GenericFactory {

	protected Integer totalCapacity;

	
	public abstract Product build (Part[] parts);

	public Integer getTotalCapacity() {
		return totalCapacity;
	}
}