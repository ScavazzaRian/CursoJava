import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double X, Y;
		X = scanner.nextDouble();
		Y = scanner.nextDouble();
		
		if(X == 0 && Y == 0) {
			System.out.println("Origem");
		}
		else if (X == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (Y == 0.0) {
			System.out.println("Eixo X");
		}else if (X < 0 && Y > 0) {
			System.out.println("Q2");
		}else if (X < 0 && Y < 0) {
			System.out.println("Q3");
		}else if (X > 0 && Y < 0) {
			System.out.println("Q4");
		}else {
			System.out.println("Q1");
		}
		
		scanner.close();
	}
}
