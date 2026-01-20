import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min;
		double pagar = 50;
		
		min = scanner.nextInt();
		
		if(min > 100) {
			pagar += (min - 100) * 2;
		}
		
		System.out.printf("VALOR A PAGAR: %.2f", pagar);
		
		scanner.close();
	}
}
