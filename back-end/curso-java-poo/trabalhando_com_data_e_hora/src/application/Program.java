package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
	public static void main(String[] args) {
		
		// Instanciando hora e data local
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		//Convertendo estring de hora e data para objetos de date e datetime
		LocalDate d04 = LocalDate.parse("2022-09-05");
		LocalDateTime d05 = LocalDateTime.parse("2022-09-05T09:10:36");
		Instant d06 = Instant.parse("2022-09-05T09:10:36Z");
		Instant d07 = Instant.parse("2022-09-05T09:10:36-03:00");
		
		System.out.println("d01 = " + d01); // implicitamente está chamando d01.toString do objeto LocalDate
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
	}

}
