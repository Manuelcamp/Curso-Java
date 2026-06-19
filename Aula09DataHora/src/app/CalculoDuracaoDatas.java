package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDuracaoDatas {

	public static void main(String[] args) {
		

		LocalDate d04 = LocalDate.parse("2025-08-14");
		LocalDateTime d05 = LocalDateTime.parse("2025-08-14T19:43:45");
		Instant d06 = Instant.parse("2025-08-14T19:43:45z");
		
		LocalDate pastWeekLocalDate = d04.minusWeeks(2); 
		LocalDate nextWeekLocalDate = d04.plusWeeks(2);
		
		LocalDateTime ThreeHoursBefore = d05.minusHours(3);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); 
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		Duration t1 = Duration.between(pastWeekInstant, d06);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());

		System.out.println("2 Weeks Before " + pastWeekLocalDate);
		System.out.println("2 Weeks After " + nextWeekLocalDate);
		
		System.out.println("3 Hours Before " + ThreeHoursBefore);
	
		System.out.println("Instant 7 Days before " + pastWeekInstant);
		System.out.println("Instant 7 Days after" + nextWeekInstant);
		
		System.out.println(t1);
		System.out.println(t1.toDays());
		System.out.println(t1.toMillis());
		System.out.println(t2.toDays());


	}

}
