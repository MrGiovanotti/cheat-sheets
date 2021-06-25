package com.mrgiovanotti.datetimemanagement;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class HandlingDates {

	public static void main(String[] args) {

		// Creating current date
		LocalDate currentDate = LocalDate.now();

		// Creating a specific date
		LocalDate specificDate = LocalDate.of(1983, 04, 17);
		// or
		specificDate = LocalDate.of(1983, Month.APRIL, 17);

		// Creating a date from a string
		LocalDate dateFromString = LocalDate.parse("1983-04-17");

		// Adding time to a date
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		// or
		tomorrow = LocalDate.now().plus(1, ChronoUnit.DAYS);

		// Substracting time from a date
		LocalDate lastMonth = LocalDate.now().minusDays(1);
		// or
		lastMonth = LocalDate.now().minus(1, ChronoUnit.MONTHS);

		// Getting day of the week
		DayOfWeek today = LocalDate.now().getDayOfWeek();

		// Getting day of month
		int todayIs = LocalDate.now().getDayOfMonth();

		// Getting month name
		Month thisMonth = LocalDate.now().getMonth();

		// Getting month name in Spanish
		String monthNameInSpanish = thisMonth.getDisplayName(TextStyle.FULL,
				new Locale("es", "EC"));

		// Getting number of month of year
		int numberOfMonth = thisMonth.getValue();

		// Is this a leap year?
		boolean isLeap = LocalDate.now().isLeapYear();

		// Comparing dates (We use isBefore, isAfter, isEquals)
		boolean isBefore = LocalDate.now().isBefore(LocalDate.parse("2021-05-26"));

	}

}
