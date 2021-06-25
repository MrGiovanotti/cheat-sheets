package com.mrgiovanotti.datetimemanagement;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDates {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 00:00:00");
		LocalDate someDate = LocalDate.of(2020, 12, 18);

		// First way
		String formatedDate = someDate.format(formatter);

		// Second way
		formatedDate = formatter.format(someDate);

		// Creating a formatedDateTime from a String
		LocalDateTime anotherSomeDate = LocalDateTime.parse("2021-09-20 13:45:51",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));



	}

}
