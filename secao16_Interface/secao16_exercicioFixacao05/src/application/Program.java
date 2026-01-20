package application;

import java.util.Scanner;

import entities.model.LoanRequest;
import model.service.AggressiveRiskService;
import model.service.LoanProcessService;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double amount = scanner.nextDouble();
		double salario = scanner.nextDouble();
		
		LoanRequest pedido = new LoanRequest(amount, salario);
		
		LoanProcessService servico = new LoanProcessService(new AggressiveRiskService());
		servico.process(pedido);
		System.out.println(pedido.getStatus());
		
		
		scanner.close();
	}
}
