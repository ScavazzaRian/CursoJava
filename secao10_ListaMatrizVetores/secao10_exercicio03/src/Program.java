import java.util.Scanner;

import Util.Pessoa;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pessoa[] vetor;
		int qtd, idade, menorIdade = 0;
		String nome;
		double altura, media = 0, porc, soma = 0;
		
		System.out.println("Quantas pessoas serao digitadas");
		qtd = scanner.nextInt();
		
		vetor = new Pessoa[qtd];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Dados da %d pessoa", i+1);
			
			System.out.print("\nNome: ");
			scanner.nextLine();
			nome = scanner.nextLine();
			
			System.out.print("\nIdade: ");
			idade = scanner.nextInt();
			
			System.out.print("\nAltura: ");
			altura = scanner.nextDouble();
			
			vetor[i] = new Pessoa(nome, idade, altura);
		}
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getAltura();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i].getIdade() < 16) {
				menorIdade++;
			}
		}
		
		porc =  (menorIdade * 100.0) / vetor.length;
		
		media = soma/vetor.length;
		
		System.out.printf("Altura media %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.2f\n", porc);
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}
		
		scanner.close();
	}
}
