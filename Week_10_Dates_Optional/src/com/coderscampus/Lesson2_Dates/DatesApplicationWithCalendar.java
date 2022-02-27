package com.coderscampus.Lesson2_Dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DatesApplicationWithCalendar {
	public static void main(String[] args) {
//		lesson6();
//		lesson7();

		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));
		cal.set(2020, 0, 1);
		Date jan1 = cal.getTime();

		System.out.println(jan1);
		System.out.println("----------");

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd h:mm:ss a z");
		formatter.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		String formattedDate = formatter.format(jan1);
		System.out.println(formattedDate);
		System.out.println("----------");

		String dateValue1 = "2020-01-05 5:00 PM";
		String dateValue2 = "2019-01-01 10:00 AM";

		DateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd h:mm a");
		Date date1;
		Date date2;
		try {
			date1 = formatter2.parse(dateValue1);
			date2 = formatter2.parse(dateValue2);
			if (date1.before(date2)) {
				System.out.println("date1 is before date2");
			} else {
				System.out.println("date1 is after date2");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
