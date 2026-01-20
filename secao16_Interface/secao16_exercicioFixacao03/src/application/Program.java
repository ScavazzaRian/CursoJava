package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.model.CarRental;
import entities.model.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {
	/*
	 * Interface estabelece um contrato que a classe deve seguir;
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Enter rental data: ");
		System.out.println("Car model: ");
		String carModel = scanner.nextLine();

		System.out.println("Pickup (dd/MM/yyyy): ");
		LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), fmt);
		System.out.println("Return (dd/MM/yyyy): ");
		LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.println("Entre com o preco por dia: ");
		double pricePerDay = scanner.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, new BrazilTaxService());

		rentalService.processInvoice(cr);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
		System.out.println("Imposto: " + cr.getInvoice().getTax());
		System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
		
		scanner.close();
	}

}
