import java.util.Scanner;

class Program{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, soma;
		
		System.out.println("Informe um numero");
		num1 = scanner.nextInt();
		
		System.out.println("Informe o segundo numero");
		num2 = scanner.nextInt();
		
		soma = num1 + num2;
		
		System.out.printf("A soma de %d + %d = %d", num1, num2, soma);
		
		scanner.close();
	}
}