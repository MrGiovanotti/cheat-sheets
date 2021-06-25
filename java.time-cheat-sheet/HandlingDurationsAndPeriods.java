package com.mrgiovanotti.datetimemanagement;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.concurrent.TimeUnit;

public class HandlingDurationsAndPeriods {

	public static void main(String[] args) {

		//*****************************************************
		// ********** Duration can include time ***************
		//*****************************************************

		LocalDateTime currentDate = LocalDateTime.now();
		LocalDateTime someDateTime = LocalDateTime.of(2021, 12, 15, 14, 12);

		Duration duration = Duration.between(currentDate, someDateTime);

		// Getting days of duration
		long days = duration.toDays();

		// We can add time to a durarion
		Duration anotherDuration = duration.plusHours(5);

		// We can use Duarion with Instants
		Instant instant1 = Instant.now();

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Instant instant2 = Instant.now();
		Duration timeElapsed = Duration.between(instant1, instant2);



		//*****************************************************
		// ********** Period does not include time ************
		//*****************************************************

		LocalDate date1 = LocalDate.of(2015, 9, 23);
		LocalDate date2 = LocalDate.of(2019, 5, 18);

		Period period = Period.between(date1, date2);

		System.out.println(period);

	}

}
