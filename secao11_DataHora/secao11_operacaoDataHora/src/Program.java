import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {
		/*
		 * Data-hora local
		 * 
		 * LocaDate
		 * LocalDateTime
		 * 
		 * Data-hora global
		 * 
		 * Instant
		 * 
		 * Duracao
		 * 
		 * Duration
		 * 
		 * Outros 
		 * 
		 * Zoneld
		 * ChronoUnit
		 */
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("01/01/2022", fmt1);
		LocalDate d09 = LocalDate.parse("01/01/2022 01:30", fmt2);
		LocalDate d10 = LocalDate.parse("01/01/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"));
		
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
	}
}
