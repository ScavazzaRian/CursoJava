import java.util.Scanner;

import secao10_exercicio11.Pessoa;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char sexo;
		double altura;
		int qtd;
		Pessoa[] vetor;
		
		System.out.print("Quantos numeros voce vai digitar: ");
		qtd = scanner.nextInt();
		vetor = new Pessoa[qtd];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Altura da %d pessoa: ", i+1);
			altura = scanner.nextDouble();
			
			System.out.printf("Sexo da %d pessoa: ", i+1);
			sexo = scanner.next().charAt(0);
			
			vetor[i] = new Pessoa(altura, sexo);
		}
		
		double maiorAltura = vetor[0].getAltura();
		double menorAltura = vetor[0].getAltura();
		
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i].getAltura() > maiorAltura) {
				maiorAltura = vetor[i].getAltura(); 
			}
			
			if(vetor[i].getAltura() < menorAltura) {
				menorAltura = vetor[i].getAltura(); 
			}
		}
		
		double soma = 0, media = 0;
		int mul = 0, hom = 0;
		
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i].getSexo() == 'F') {
				soma += vetor[i].getAltura();
				mul++;
			}else {
				hom++;
			}
		}
		
		media = soma / mul;
		
		System.out.printf("Menor altura %.2f\n", menorAltura);
		System.out.printf("Maior altura %.2f\n", maiorAltura);
		System.out.printf("Media das alturas da mulheres %.2f\n", media);
		System.out.printf("Numero de homens %d\n", hom);
		
		scanner.close();
	}
}
