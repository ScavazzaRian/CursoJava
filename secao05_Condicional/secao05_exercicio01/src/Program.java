import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		num = scanner.nextInt();
		
		if(num < 0) {
			System.out.println("NEGATIVO");
		}else if (num > 0) {
			System.out.println("POSTIVO");
		}else {
			System.out.println("NEUTRO");
		}
		
		scanner.close();
	}
}
