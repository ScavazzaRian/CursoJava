import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		LocalDateTime d08 = LocalDateTime.parse("2022-07-22T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		Instant novoDia = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		System.out.println(novoDia);
		
		// DURACAO TEMPO
		// Precisa do minutos, caso seja localdate fazemos .atTime(0,0)
		// .atStartOfDay()
		Duration t1 = Duration.between(d05, d08);
		System.out.println(t1.toDays());
		
	}
}
