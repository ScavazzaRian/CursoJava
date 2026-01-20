import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd, num, in = 0, out = 0;
		
		qtd = scanner.nextInt();
		
		for(int i = 1; i<= qtd; i++) {
			num = scanner.nextInt();
			
			if(num >= 10 && num < 20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		
		System.out.printf("%d IN\n%d OUT", in, out);
		
		scanner.close();
	}
}
