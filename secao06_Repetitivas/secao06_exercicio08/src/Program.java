import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd, resultado = 1;
		
		qtd = scanner.nextInt();
		
		for(int i = qtd; i > 0; i--) {
			resultado = resultado * i;
		}
		
		System.out.println(resultado);
		
		scanner.close();
	}
}