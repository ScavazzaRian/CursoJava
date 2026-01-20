import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double valor;
		valor = scanner.nextDouble();
		
		if(valor >= 0 && valor <= 25) {
			System.out.println("Intervalo [0,25]");
		}else if (valor <= 50) {
			System.out.println("Intervalo [25,50]");
		}else if (valor <= 75) {
			System.out.println("Intervalo [50,75]");
		}else if (valor <= 100) {
			System.out.println("Intervalo (75,100]");
		}else {
			System.out.println("Fora do intervalo");
		}
		
		scanner.close();
	}
}
