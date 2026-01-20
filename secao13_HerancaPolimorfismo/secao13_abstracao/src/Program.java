import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;

public class Program {
	public static void main(String[] args) {
		List <Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 6500.0, 0.01));
		
		double soma = 0.0;
		for(Account acc : list) {
			soma += acc.getBalance();
		}
		
		System.out.print(soma);
	}
}
