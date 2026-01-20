import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd;
		int[] vetor;
		
		System.out.println("Quando numeros teremos: ");
		qtd = scanner.nextInt();
		vetor = new int[qtd];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = scanner.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		scanner.close();
	}
}
