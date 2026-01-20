package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.model.Contract;
import entities.model.Installment;
import model.services.ContractService;
import model.services.PayPalService;

public class Program {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroContrato, qtdParcela;
		double valorContrato;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data;
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.println("Numero: ");
		numeroContrato = scanner.nextInt();
		System.out.println("Data (dd/MM/yyyy): ");
		data = LocalDate.parse(scanner.next(), fmt);
		System.out.println("Valor do contrato: ");
		valorContrato = scanner.nextDouble();
		System.out.println("Entre com o numero de parcelas: ");
		qtdParcela = scanner.nextInt();
		
		Contract contract = new Contract(numeroContrato, data, valorContrato);
		ContractService service = new ContractService(new PayPalService());
		service.processContract(contract, qtdParcela);
		
		// PARCELAS
		System.out.println("Parcelas:");
		for (Installment installment : contract.getListaPagamento()) {
			System.out.println(installment);
		}
		
		scanner.close();
	}
}
