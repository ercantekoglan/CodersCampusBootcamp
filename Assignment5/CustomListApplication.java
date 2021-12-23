package com.coderscampus.Assignment5;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		
		
		for(int i = 0; i <101; i++) {
			myCustomList.add("element " + i);
		}

		// then you should validate that all the elements you've inserted actually exist
		// in your data structure
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
	}
}