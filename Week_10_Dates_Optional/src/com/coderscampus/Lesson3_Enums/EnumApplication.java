package com.coderscampus.Lesson3_Enums;

public class EnumApplication {
	public static void main(String[] args) {
		User user = new User("Trevor", "asdfasdf");

		System.out.println(user);

		if ("A".equals(user.getStatus().getValue())) {
			System.out.println("User is active");
		}

		if ("ACTIVE".equals(user.getStatus().name())) {
			System.out.println("User is active");
		}

		System.out.println("Ace primary value: " + Card.ACE.getCardValue());
		System.out.println("Ace secondary value: " + Card.ACE.getCardSecondaryValue());

	}
}
