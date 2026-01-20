import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd;
		double[] vetor;
		double media, soma = 0;
		
		System.out.print("Quantos numeros voce vai digitar: ");
		qtd = scanner.nextInt();
		vetor = new double[qtd];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = scanner.nextDouble();
			soma += vetor[i];
		}
		
		media = soma / vetor.length;
		System.out.printf("MEDIA DO VETOR: %.3f\n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		scanner.close();
	}
}
