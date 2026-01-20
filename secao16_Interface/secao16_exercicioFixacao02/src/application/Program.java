package application;

import java.util.Scanner;

import entities.model.Order;
import model.services.OrderService;
import model.services.StandardShippingService;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double discount, total;
		int num;
		
		// Criando venda
		System.out.println("Entre com o numero da compra: ");
		num = scanner.nextInt();
		System.out.println("Entre com o valor da compra: ");
		total = scanner.nextDouble();
		System.out.println("Entre com o desconto da compra: ");
		discount = scanner.nextDouble();
		Order order = new Order(num, total, discount);
		
		// Calculando frete
		OrderService orderService = new OrderService(new StandardShippingService());
		
		System.out.println("Valor da compra: " + String.format("%.2f", order.getBasicValue()));
		System.out.println("Valor do frete: " + String.format("%.2f", orderService.getShippingService().shipment(order.getBasicValue())));
		System.out.println("Valor do desconto: " + String.format("%.2f", order.getDiscount()));
		System.out.println("Total: " + String.format("%.2f", orderService.total(order)));
		
		scanner.close();
	}
}
