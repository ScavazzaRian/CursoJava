import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd;
		int[] vetorA;
		int[] vetorB;
		int[] vetorResultante;
		
		System.out.print("Quantos numeros voce vai digitar: ");
		qtd = scanner.nextInt();
		
		vetorA = new int[qtd];
		vetorB = new int[qtd];
		vetorResultante = new int[qtd];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scanner.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			vetorB[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < vetorResultante.length; i++) {
			vetorResultante[i] = vetorB[i] + vetorA[i];
		}
		
		for(int i = 0; i < vetorResultante.length; i++) {
			System.out.println(vetorResultante[i]);
		}
		
		scanner.close();
	}
}
