package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.AccountException;

public class Program {

	public static void main(String[] args) {
		Account account;
		Scanner scanner = new Scanner(System.in);
		String name;
		int numberAccount;
		double initialBalance, withDrawLimit, withdraw;
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		numberAccount = scanner.nextInt();
		
		System.out.print("Holder: ");
		scanner.nextLine();
		name = scanner.nextLine();
		
		System.out.print("Initial Balance: ");
		initialBalance = scanner.nextDouble();
		
		System.out.print("Withdraw limite: ");
		withDrawLimit = scanner.nextDouble();
		
		account = new Account(numberAccount, name, initialBalance, withDrawLimit);
		
		try {
			System.out.print("Enter amount for withdraw: ");
			withdraw = scanner.nextDouble();
			account.withDraw(withdraw);
			System.out.printf("New balance: %.2f", account.getBalance());
		}
		catch (AccountException e) {
			System.out.print("Withdraw erroor: " + e.getMessage());
		}
		
		
		scanner.close();
	}

}
