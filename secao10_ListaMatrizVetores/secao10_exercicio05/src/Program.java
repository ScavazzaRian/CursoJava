import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd, maior, posicao = 0;
		int[] vetor;
		
		System.out.print("Quantos numeros voce vai digitar: ");
		qtd = scanner.nextInt();
		
		vetor = new int[qtd];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = scanner.nextInt();
		}
		
		maior = vetor[0];
		
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %d", maior);
		System.out.printf("\nPOSICAO DO MAIOR VALOR = %d", posicao);
		
		scanner.close();
	}
}
