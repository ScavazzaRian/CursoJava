import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double quadrado, cubo;
		int qtd;
		
		qtd = scanner.nextInt();
		
		for(int i = 1; i <= qtd; i++) {
			quadrado = Math.pow(i, 2);
			cubo = Math.pow(i, 3);
			
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		scanner.close();
	}
}