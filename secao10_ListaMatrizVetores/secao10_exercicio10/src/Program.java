import java.util.Scanner;

import Util.Aluno;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd;
		String nome;
		double nota1, nota2;
		Aluno[] vetor;
		
		System.out.println("Quantos alunos serao digitados? ");
		qtd = scanner.nextInt();
		vetor = new Aluno[qtd];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ", i+1);
			scanner.nextLine();
			nome = scanner.nextLine();
			nota1 = scanner.nextDouble();
			nota2 = scanner.nextDouble();
			
			vetor[i] = new Aluno(nome, nota1, nota2);
		}
		
		System.out.println("ALUNOS APROVADOS: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i].getMedia() >= 6) {
				System.out.println(vetor[i].getNome());
			}
		}
		
		scanner.close();
	}
}
