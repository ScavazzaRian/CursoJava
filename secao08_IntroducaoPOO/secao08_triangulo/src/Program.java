import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo();
		Triangulo triangula = new Triangulo();
		Scanner scanner = new Scanner(System.in);
		
		double A, B, C, AA, BB, CC;
		
		A = scanner.nextDouble();
		B = scanner.nextDouble();
		C = scanner.nextDouble();
		
		AA = scanner.nextDouble();
		BB = scanner.nextDouble();
		CC = scanner.nextDouble();
		
		triangulo.a = A;
		triangulo.b = B;
		triangulo.c = C;
		
		triangula.a = AA;
		triangula.b = BB;
		triangula.c = CC;
		
		double resultado = triangulo.area();
		double resultado2 = triangula.area();
		
		System.out.println(resultado);
		
		Triangulo.maior(resultado, resultado2);
		
		scanner.close();
	}
}
