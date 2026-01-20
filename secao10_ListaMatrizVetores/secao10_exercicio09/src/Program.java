import java.util.Scanner;

import Util.Pessoa;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd, idade, idadeVelha;
		String nome, nomeVelho;
		Pessoa[] vetor;
		
		System.out.print("Quantos numeros voce vai digitar: ");
		qtd = scanner.nextInt();
		vetor = new Pessoa[qtd];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Dados da %da pessoa", i+1);
			
			System.out.print("Nome: ");
			scanner.nextLine();
			nome = scanner.nextLine();
			
			System.out.print("Idade: ");
			idade = scanner.nextInt();
			
			vetor[i] = new Pessoa(nome,idade); 
		}
		
		idadeVelha = vetor[0].getIdade();
		nomeVelho = vetor[0].getNome();
		
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i].getIdade() > idadeVelha) {
				idadeVelha = vetor[i].getIdade();
				nomeVelho = vetor[i].getNome();
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", nomeVelho);
		
		scanner.close();
	}
}
