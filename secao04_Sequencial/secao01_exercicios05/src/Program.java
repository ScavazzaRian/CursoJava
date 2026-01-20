import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cod01, cod02, qtd01, qtd02;
		double valorunit01, valorunit02, total;
		
		cod01 = scanner.nextInt();
		qtd01 = scanner.nextInt();
		valorunit01 = scanner.nextDouble();
		
		cod02 = scanner.nextInt();
		qtd02 = scanner.nextInt();
		valorunit02 = scanner.nextDouble();
		
		total = valorunit01 * qtd01 + valorunit02 * qtd02;
		
		System.out.printf("VALOR A PAGAR: %.2f", total);
		
		scanner.close();
	}
}
