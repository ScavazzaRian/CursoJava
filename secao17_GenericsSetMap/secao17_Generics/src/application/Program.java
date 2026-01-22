package application;

import java.util.Scanner;

import entities.model.PrintService;

public class Program {
	public static void main(String[] args) {
		/*
		 * Permite que classes, interfaces e metodos possam ser parametrizados por tipo.
		 * Comumente utilizado em colecoes.
		 */
		Scanner scanner = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();
		
		System.out.println("How many value:" );
		int qtd = scanner.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			int num = scanner.nextInt();
			ps.addValue(num);
		}
		
		ps.print();
		System.out.println(ps.first());
		
		scanner.close();
	}
}
