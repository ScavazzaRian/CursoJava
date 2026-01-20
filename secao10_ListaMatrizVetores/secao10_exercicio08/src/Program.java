import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd;
		double[] vetor;
		double media, soma = 0, par = 0;
		
		System.out.print("Quantos numeros voce vai digitar: ");
		qtd = scanner.nextInt();
		vetor = new double[qtd];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = scanner.nextDouble();
			if(vetor[i] % 2 == 0) {
				soma += vetor[i];
				par++;
			}
		}
		
		if(par == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			media = soma / par;
			System.out.printf("MEDIA DOS PARES: %.1f\n", media);
		}

		scanner.close();
	}
}
