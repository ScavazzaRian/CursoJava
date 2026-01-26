package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();
		
		System.out.println("How many students for A? ");
		int qtd1 = scanner.nextInt();
		for (int i = 0; i < qtd1; i ++) {
			int num = scanner.nextInt();
			cursoA.add(num);
		}
		
		System.out.println("How many students for B? ");
		int qtd2 = scanner.nextInt();
		for (int i = 0; i < qtd2; i ++) {
			int num = scanner.nextInt();
			cursoB.add(num);
		}
		
		System.out.println("How many students for C? ");
		int qtd3 = scanner.nextInt();
		for (int i = 0; i < qtd3; i ++) {
			int num = scanner.nextInt();
			cursoC.add(num);
		}
		
		Set<Integer> auxilio = new HashSet<>(cursoA);
		auxilio.addAll(cursoB);
		auxilio.addAll(cursoC);
		
		System.out.println("Total students: " + auxilio.size());
		
		scanner.close();
	}

}
