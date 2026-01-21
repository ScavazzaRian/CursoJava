package application;

import java.util.Scanner;

import services.BrasilInterestService;
import services.InterestService;

public class Program {

	public static void main(String[] args) {
		/*
		 * A partir do Java 8+, interfaces podem ter metodos concretos;
		 * 
		 * - O intuito e evitar a repeticao de implementacao em todas as classes. - A
		 * necessidade de se criar classes abstratras para prover o reuso da
		 * implementacao.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Amount: ");
		double amount = scanner.nextDouble();

		System.out.println("Months: ");
		int months = scanner.nextInt();

		InterestService bis = new BrasilInterestService(2.0);
		double payment = bis.payment(amount, months);

		System.out.println(String.format("%.2f", payment));

		scanner.close();
	}

}
