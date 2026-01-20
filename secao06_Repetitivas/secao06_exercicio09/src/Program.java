import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd;
		
		qtd = scanner.nextInt();
		
		for(int i = 1; i <= qtd; i++) {
			if (qtd % i == 0) {
				System.out.println(i);
			}
		}
		
		scanner.close();
	}
}