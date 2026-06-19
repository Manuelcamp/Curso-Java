package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ManipulacaoDeDatas {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-08-14");
		LocalDateTime d05 = LocalDateTime.parse("2025-08-14T19:43:45");
		Instant d06 = Instant.parse("2025-08-14T19:43:45z");
		Instant d07 = Instant.parse("2025-08-14T19:43:45-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2025", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2025 01:30", fmt2); 
		LocalDate d10 = LocalDate.parse("20/07/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		LocalDate d11 = LocalDate.of(2006,01,24);
		LocalDateTime d12 = LocalDateTime.of(2006, 1, 24, 10, 30);
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println(d12);
	}

}
