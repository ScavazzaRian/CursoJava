import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd; 
		double num1, num2, num3;
		
		qtd = scanner.nextInt();
		
		double[] media = new double[qtd];
		
		for(int i = 0; i < qtd; i++) {
			num1 = scanner.nextDouble();
			num2 = scanner.nextDouble();
			num3 = scanner.nextDouble();
			
			media[i] = (num1 * 0.2) + (num2 * 0.3) + (num3 * 0.5);
		}		
		
		for(int i = 0; i < media.length; i++) {
			System.out.println(media[i]);
		}
		
		scanner.close();
	}
}