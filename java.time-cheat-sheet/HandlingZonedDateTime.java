package com.mrgiovanotti.datetimemanagement;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class HandlingZonedDateTime {

	public static void main(String[] args) {
		LocalDateTime localDate = LocalDateTime.now();

		ZoneId newYorkZone = ZoneId.of("America/New_York");
		ZonedDateTime newYorkDateTime = ZonedDateTime.of(localDate, newYorkZone);

		ZoneId madridZone = ZoneId.of("Europe/Madrid");
		ZonedDateTime madridDateTimeFromNewYork = newYorkDateTime.withZoneSameInstant(madridZone);

		ZoneId ecuadorZone = ZoneId.of("America/Guayaquil");
		ZonedDateTime ecuadorDateTime = ZonedDateTime.of(localDate, ecuadorZone);
		ZonedDateTime madridTimeFromEcuador = ecuadorDateTime.withZoneSameInstant(madridZone);

		ZonedDateTime ecuadorDateTime1 = ZonedDateTime.of(localDate, ZoneOffset.of("-05:00"));

		// Getting availables zones
		Set<String> allZones = ZoneId.getAvailableZoneIds();

		allZones.forEach(System.out::println);


		System.out.println(ecuadorDateTime);
		System.out.println(newYorkDateTime);
		System.out.println(madridDateTimeFromNewYork);
		System.out.println(madridTimeFromEcuador);

	}

}
