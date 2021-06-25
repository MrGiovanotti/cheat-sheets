package com.mrgiovanotti.datetimemanagement;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class HandlingTime {

	public static void main(String[] args) {

		// Current time
		LocalTime now = LocalTime.now();

		// Creating a specific time
		LocalTime someTime = LocalTime.of(13, 45, 58);

		// Creating a time from a string
		LocalTime timeFromString = LocalTime.parse("13:45:58");

		// Getting hour, minutes, etc
		int hour = now.getHour();
		int minutes = now.getMinute();

		// Adding time
		LocalTime afterAnHour = LocalTime.now().plusHours(1);
		// or
		afterAnHour = LocalTime.now().plus(1, ChronoUnit.HOURS);

		// Substracting time
		LocalTime beforeAnHour = LocalTime.now().minusHours(1);
		// or
		beforeAnHour = LocalTime.now().minus(1, ChronoUnit.HOURS);

		// Comparing time (We use isBefore, isAfter, isEquals)
		boolean isBefore = LocalTime.now().isBefore(someTime);

		// Getting max and min time of day
		LocalTime maxTimeOfDay = LocalTime.MAX;
		LocalTime minTimeOfDay = LocalTime.MIN;

	}

}
