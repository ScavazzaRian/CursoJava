import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int X, Y;
		
		while(true) {
			X = scanner.nextInt();
			Y = scanner.nextInt();
			
			if(X == 0 || Y == 0) {
				break;
			}else if (X > 0 && Y > 0) {
				System.out.println("PRIMEIRO");
			}else if (X < 0 && Y > 0) {
				System.out.println("SEGUNDO");
			}else if (X > 0 && Y < 0) {
				System.out.println("QUARTO");
			}else {
				System.out.println("TERCEIRO");
			}
		}
		
		scanner.close();
	}
}
