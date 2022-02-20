package com.coderscampus.lesson1;

public class PassByValueExample3 {

	public static void main (String[] args) {
		HumanA trevor = new HumanA("Male", "5'10\"", "165", "Brown");
		System.out.println("Outside of the modifyValues method: " + trevor.getInfo());
		System.out.println(trevor.hashCode());
		modifyValues(trevor);
		System.out.println(trevor.hashCode());
		System.out.println("Outside of the modifyValues method: " + trevor.getInfo());
	}
	
	public static void modifyValues (HumanA trevor) {
		System.out.println("Inside of the modifyValues method: " + trevor.getInfo());
		trevor.eyeColor = "Blue";
		trevor.gender = "Female";
		trevor.weight = "150";
		trevor.height = "5'8\"";
		System.out.println(trevor.hashCode());
		System.out.println("Inside of the modifyValues method: " + trevor.getInfo());
	}
}