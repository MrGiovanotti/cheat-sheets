package com.mrgiovanotti.datetimemanagement;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class HandlingDatetime {

	public static void main(String[] args) {

		// Current datetime
		LocalDateTime currentDateTime = LocalDateTime.now();

		// Creating a specific dateTime
		LocalDateTime someDateTime = LocalDateTime.of(2021, 10, 10, 14, 54);

		// Creating a dateTime from a String
		LocalDateTime dateTimeFromString = LocalDateTime.parse("2019-03-05T21:54:02");

		// Adding time to a dateTime
		LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);
		// or
		tomorrow = LocalDateTime.now().plus(1, ChronoUnit.DAYS);

		// Substracting time from a dateTime
		LocalDateTime yesterday = currentDateTime.minusDays(1);
		// or
		yesterday = currentDateTime.minus(1, ChronoUnit.DAYS);

		/**
		 * We can do all we did with dates (Getting dayOfMonth, format, etc)
		 */

		System.out.println(dateTimeFromString);

	}

}
