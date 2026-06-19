package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversaoDeFusosHorarios {

	public static void main(String[] args) {
		//Conveter data-hora global para local

		LocalDate d04 = LocalDate.parse("2025-08-14");
		LocalDateTime d05 = LocalDateTime.parse("2025-08-14T19:43:45");
		Instant d06 = Instant.parse("2025-08-14T01:43:45z");

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println(r3);
		System.out.println(r4);
		
		System.out.println("D04 Dia = " + d04.getDayOfMonth());
		System.out.println("D04 Mês = " + d04.getMonth() + " " + d04.getMonthValue());
		System.out.println("D04 Ano = " + d04.getDayOfYear() + " " + d04.getYear());
		
		System.out.println("D05 Hora = " + d05.getHour());
		System.out.println("D05 Minuto = " + d05.getMinute());
	}

}
