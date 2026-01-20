import java.util.Scanner;

import Util.Coin;

public class Program {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
		double compra, dolar;
		
		System.out.println("What is the dollar price? ");
		dolar = scanner.nextDouble();
		System.out.println("How many dollars will be bought? ");
		compra = scanner.nextDouble();
		System.out.printf("Amount to be paind in reais R$ %.2f", Coin.Conversor(dolar, compra));
		
		scanner.close();
	}
}
