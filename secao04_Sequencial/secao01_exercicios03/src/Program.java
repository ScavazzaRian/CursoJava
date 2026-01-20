import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int A, B, C, D;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		A = scanner.nextInt();
		
		System.out.println("Informe o valor de B: ");
		B = scanner.nextInt();
		
		System.out.println("Informe o valor de C: ");
		C = scanner.nextInt();
		
		System.out.println("Informe o valor de D: ");
		D = scanner.nextInt();
		
		int diferenca = (A * B - C * D);
		System.out.printf("DIFERENCA: %d", diferenca);
		
		scanner.close();
	}
}
