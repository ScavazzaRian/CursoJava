package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Reservation reservation;
		Scanner scanner = new Scanner(System.in);
		int roomNumber;
		LocalDate checkIn, checkOut;
		
		try {
			// CRIANDO UM OBJETO QUARTO
			System.out.print("Room number: ");
			roomNumber = scanner.nextInt();
		
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(scanner.next(), fmt);
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = LocalDate.parse(scanner.next(), fmt);
			
			reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
			
			// UPDATE
			System.out.println(); 
            System.out.println("Enter data to update the reservation:");
            
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(scanner.next(), fmt);
            
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(scanner.next(), fmt);
        
            reservation.updateDate(checkIn, checkOut);
            
            System.out.println("Reservation: " + reservation);
		}
		catch (DomainException e ) {
			System.out.print("Error in reservation: " + e);
		}
		catch (RuntimeException e) {
			System.out.print("Deu um erro ai: " + e);
		}
			
		
		scanner.close();
	}

}
