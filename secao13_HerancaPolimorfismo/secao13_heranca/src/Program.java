import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	// Tipo de associacao que permite que uma classe herde todos os dados e comportamento de outras
	// Reuso e Polimorfismo
	// class A extends B
	// Seta branca aponta heranca esta herdando
	public static void main(String[] args) {
		// Herance e uma relacao "e um"
		// Exemplo a contaDeEmpresa ainda e uma conta
		// A Account e uma generalizacao
		// E BusinessAccount e uma especializacao
		// Heranca e uma associacao entre classes
		// Composicao e uma associacao entre objetos
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		
		// BusinessAccount acc5 = (BusinessAccount) acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("LOAN!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("UPDATE!");
		}
	}
}
