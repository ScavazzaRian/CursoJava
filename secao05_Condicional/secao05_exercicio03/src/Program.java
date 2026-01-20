import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		num1 = scanner.nextInt();
		
		num2 = scanner.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("MULTIPLOS");
		}else {
			System.out.println("NAO MULTIPLOS");
		}
		
		scanner.close();
	}
}
