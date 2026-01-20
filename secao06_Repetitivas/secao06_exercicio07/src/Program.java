import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd; 
		double num1, num2, divisao;
		
		qtd = scanner.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			num1 = scanner.nextDouble();
			num2 = scanner.nextDouble();
			
			if(num2 == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			} else {
				divisao = num1 / num2;
				
				System.out.println(divisao);
			}
		}
		
		scanner.close();
	}
}