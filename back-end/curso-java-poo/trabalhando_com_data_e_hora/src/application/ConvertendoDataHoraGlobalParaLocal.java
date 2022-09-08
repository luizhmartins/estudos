package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoDataHoraGlobalParaLocal {
	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		// Convertendo data e hora Global para Local
		
		System.out.println("\nConvertendo data e hora Global para Local\n");
		
		LocalDate d04 = LocalDate.parse("2022-09-05");
		LocalDateTime d05 = LocalDateTime.parse("2022-09-05T09:10:36");
		Instant d06 = Instant.parse("2022-09-05T01:30:36Z");
		
//		for(String x : ZoneId.getAvailableZoneIds()) {
//			System.out.println(x);
//		}
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		// Pegando datas e horas com métodos do objeto LocalDate e LocalDateTime
		
		System.out.println("\nPegando datas e horas com métodos do objeto LocalDate e LocalDateTime\n");
		
		System.out.println("d04 Dia = " + d04.getDayOfMonth());
		System.out.println("d04 Mês = " + d04.getMonthValue());
		System.out.println("d04 Ano = " + d04.getYear());
		
		System.out.println("d05 Hora = " + d05.getHour());
		System.out.println("d05 Minuto = " + d05.getMinute());
		
	}

}

