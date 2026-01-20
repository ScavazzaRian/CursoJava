import java.util.Scanner;

import Util.Quarto;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Quarto[] vetor = new Quarto[10];
		int qtd, num;
		String nome, email;
		
		System.out.print("Quantos quartos vao ser alugados: ");
		qtd = scanner.nextInt();
		
		if(qtd <= 10) {
			for(int i = 0; i < qtd; i++) {
				System.out.print("Informe o numero do quarto de 1 a 10: \n");
				num = scanner.nextInt();
				if(num <= 0) {
					System.out.print("Por favor informa um numero valido!!");
				}
				num = num - 1;
				
				System.out.print("Informe o nome: \n");
				scanner.nextLine();
				nome = scanner.nextLine();
				
				System.out.print("Informe o email: \n");
				email = scanner.nextLine();
				
				vetor[num] = new Quarto(nome, email, num);
			}
			
			System.out.println("Busy rooms: ");
			for(int i = 0; i < vetor.length; i++) {
				if(vetor[i] != null) {
					System.out.printf("%d: %s, %s\n", vetor[i].getNum(), vetor[i].getNome(), vetor[i].getEmail());
				}
			}
			
		}else {
			System.out.println("Numero de quartos insuficientes!");
		}
		
		scanner.close();
	}
}
