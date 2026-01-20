import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cod, hora;
		double valor, salario;
		
		System.out.println("Informe seu numero: ");
		cod = scanner.nextInt();
		
		System.out.println("Informe suas horas trabalhadas: ");
		hora = scanner.nextInt();
		
		System.out.println("Informe seu salario por hora: ");
		valor = scanner.nextDouble();
		
		salario = valor * hora;
		
		System.out.printf("NUMBER = %d\nSALARY = %.2f", cod, salario);
		
		scanner.close();
	}
}
