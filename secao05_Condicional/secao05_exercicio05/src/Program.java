import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cod, qtd;
		double cq = 4, xs = 4.5, xb = 5, ts = 2, rf = 1.5, total = 0;
		
		cod = scanner.nextInt();
		qtd = scanner.nextInt();
		
		switch(cod) {
			case 1:
				total = qtd * cq;
				break;
			case 2:
				total = qtd * xs;
				break;
			case 3:
				total = qtd * xb;
				break;
			case 4:
				total = qtd * ts;
				break;
			case 5:
				total = qtd * rf;
				break;
		}
		
		System.out.printf("Total: %.2f", total);
		
		scanner.close();
	}
}
