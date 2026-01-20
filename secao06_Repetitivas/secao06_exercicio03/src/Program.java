import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int op, gas = 0, alcool = 0, diesel = 0;
		Scanner scanner = new Scanner(System.in);
		
		op = scanner.nextInt();
		
//		while (op != 4) {
//			if (op == 1) {
//				alcool += 1;
//			}else if(op == 2) {
//				gas += 1;
//			}else if(op == 3) {
//				diesel += 1;
//			}
//			op = scanner.nextInt();
//		}
		
		while (true) {
			if (op == 1) {
				alcool += 1;
			}else if(op == 2) {
				gas += 1;
			}else if(op == 3) {
				diesel += 1;
			}else {
				break;
			}
			op = scanner.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + diesel);
		
		scanner.close();
	}
}
