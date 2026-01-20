import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd, pares = 0;
		int[] vetor;
		
		System.out.println("Quantos numeros voce vai digitar: ");
		qtd = scanner.nextInt();
		vetor = new int[qtd];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				pares++;
			}
		}
		
		System.out.printf("\n QUANTIDADE DE PARES = %d", pares);
		
		scanner.close();
	}
}
