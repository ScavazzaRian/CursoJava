import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double raio, area;
		
		System.out.println("Informe o valor do raio");
		raio = scanner.nextDouble();
		area = 3.14159 * raio;
		
		System.out.printf("O valor da area e: %f", area);
		
		scanner.close();
	}
}
