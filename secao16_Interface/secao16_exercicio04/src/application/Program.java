package application;

import java.util.Scanner;

import entities.model.OrderItem;
import entities.model.Sale;
import model.services.CheckoutService;
import model.services.PayPalPayment;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd;
		
		System.out.println("Qual o codigo da venda: ");
		int code = scanner.nextInt();
		
		System.out.println("Quantos itens serao adicionados: ");
		qtd = scanner.nextInt();
		
		Sale sale = new Sale(code);
		
		for ( int i = 0 ; i < qtd; i ++) {
			System.out.println("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.println("Preco: ");
			double preco = scanner.nextDouble();
			System.out.println("Quantidade: ");
			int quantity = scanner.nextInt();
			
			sale.getLista().add(new OrderItem(nome, quantity, preco));
		}
		
		CheckoutService checkoutService = new CheckoutService(new PayPalPayment());
		checkoutService.processSale(sale);
		
		System.out.println(sale.getReceipt().getAuthorizationCode());
		
		scanner.close();
	}
}
