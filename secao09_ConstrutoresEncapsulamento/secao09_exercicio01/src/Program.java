import java.util.Scanner;

import entities.Bank;


public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank conta01;
		char op;
		String nome;
		int id;
		double deposito;
		
		
		System.out.println("Enter account number: ");
		id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter account holder: ");
		nome = scanner.nextLine();
		
		System.out.println("Is there na initial deposit: ");
		op = scanner.next().charAt(0);
		
		if(op == 'Y') {
			System.out.println("Enter initial deposite value: ");
			deposito = scanner.nextDouble();
			conta01 = new Bank(id, nome, deposito);
		}else {
			conta01 = new Bank(id, nome);
		}
		
		conta01.deposito(200);
		System.out.println(conta01);
		conta01.saque(300);
		System.out.println(conta01);
		
		scanner.close();
	}
}
