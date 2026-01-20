import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		num = scanner.nextInt();
		
		for(int i = 1; i<= num; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		scanner.close();
	}
}
