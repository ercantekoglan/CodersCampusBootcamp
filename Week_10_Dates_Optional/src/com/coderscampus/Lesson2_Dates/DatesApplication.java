package com.coderscampus.Lesson2_Dates;

import java.util.Calendar;
import java.util.Date;

public class DatesApplication {
	public static void main(String[] args) {
//		lesson6();

		// This is deprecated, don't use this approach, use Calendar instead
		Date jan012020 = new Date(120, 2, 1, 0, 0, 0);

		Calendar cal = Calendar.getInstance();
		System.out.println(jan012020);
		System.out.println("-------asd--");

		Date someOtherDate = cal.getTime();
		cal.set(2020, 2, 1, 15, 11, 15);
		someOtherDate = cal.getTime();
		System.out.println(someOtherDate);

		System.out.println("----------");

		cal.add(Calendar.HOUR, 2);
		System.out.println(cal.getTime());

		System.out.println("----------");

		cal.add(Calendar.MINUTE, -1);
		System.out.println(cal.getTime());

		System.out.println("----------");

		Date now = new Date();
		if (now.after(cal.getTime())) {
			System.out.println(now + " is after " + cal.getTime());
		}
		System.out.println("----------");

		lesson6();
	}

	private static void lesson6() {
		Date now = new Date();
		System.out.println(now);

		System.out.println("----------");

		java.sql.Date jan011970 = new java.sql.Date(86400000);
		System.out.println(jan011970);
	}
}
