import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd;
		double[] vetor;
		double soma = 0, media = 0;
		
		System.out.println("Quando numeros teremos: ");
		qtd = scanner.nextInt();
		vetor = new double[qtd];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = scanner.nextDouble();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		media = soma / vetor.length;
		
		System.out.print("VALORES = ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f  ", vetor[i]);
		}
		
		System.out.printf("\nSOMA: %.2f\n", soma);
		System.out.printf("MEDIA: %.2f", media);
		
		scanner.close();
	}
}
