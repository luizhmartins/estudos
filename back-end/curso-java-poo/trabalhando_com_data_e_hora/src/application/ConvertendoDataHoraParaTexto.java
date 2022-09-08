package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoDataHoraParaTexto {
	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		// Convertendo data e hora para texto
		System.out.println("\nFormatando data e hora\n");
		LocalDate d12 = LocalDate.parse("2022-09-05");
		LocalDateTime d13 = LocalDateTime.parse("2022-09-05T09:10:36");
		Instant d14 = Instant.parse("2022-09-05T09:10:36Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		
		System.out.println("d12 = " + d12.format(fmt1));
		System.out.println("d13 = " + fmt2.format(d13));
		// OU
		System.out.println("d13 = " + d13.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println("d13 com ISO_DATE_TIME = " + fmt4.format(d13));
		
		System.out.println("d14 = " + fmt3.format(d14));
		System.out.println("d14 com ISO_INSTANT = " + fmt5.format(d14));
		
	}

}

