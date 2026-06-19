package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatacaoDeDatas {

	public static void main(String[] args) {
		

		LocalDate d04 = LocalDate.parse("2025-08-14");
		LocalDateTime d05 = LocalDateTime.parse("2025-08-14T19:43:45");
		Instant d06 = Instant.parse("2025-08-14T19:43:45z");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println(d04.format(fmt1));
		System.out.println(fmt1.format(d04));
		System.out.println(fmt2.format(d05));
		System.out.println(fmt3.format(d06));
		System.out.println(fmt4.format(d05));
	}

}
