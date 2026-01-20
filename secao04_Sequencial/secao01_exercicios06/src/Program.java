import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		double valorA, valorB, valorC, triangulo, circulo, trapezio, quadrado, retangulo;
		Scanner scanner = new Scanner(System.in);
		
		valorA = scanner.nextDouble();
		valorB = scanner.nextDouble();
		valorC = scanner.nextDouble();
		
		triangulo = valorA * valorC / 2;
		circulo = 3.14159 * Math.pow(valorC, 2);
		trapezio = (valorA + valorB) / 2.0 * valorC;
		quadrado = Math.pow(valorB, 2);
		retangulo = valorA * valorB;
		
		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);
		
		scanner.close();
	}
}
