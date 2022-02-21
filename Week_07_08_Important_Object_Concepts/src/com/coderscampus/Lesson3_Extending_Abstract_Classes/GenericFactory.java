package com.coderscampus.Lesson3_Extending_Abstract_Classes;

public abstract class GenericFactory {

	private Integer totalCapacity;

	public abstract void build (Part[] parts);

	public Integer getTotalCapacity() {
		return totalCapacity;
	}
}