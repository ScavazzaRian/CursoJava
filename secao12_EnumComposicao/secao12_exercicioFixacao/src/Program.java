import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Order order;
		int qtd, productQuantity;
		String name, email, status, productName;
		double productPrice;
		LocalDate birthDate;
		
		// Bloco dos clientes
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		name = scanner.nextLine();
		
		System.out.print("Email: ");
		email = scanner.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY)");
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		birthDate = LocalDate.parse(scanner.next(), fmt);
		
		// Bloco dos itens
		System.out.println("Enter order data: ");
		System.out.print("Status:" );
		scanner.nextLine();
		status = scanner.nextLine();
		
		// Criando o objeto Order;
		order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status.toUpperCase()), new Client(name, email, birthDate));
		
		System.out.print("How many itens to this order? ");
		qtd = scanner.nextInt();
		
		// Loop add itens
		for(int i = 0; i<qtd; i++) {
			System.out.printf("Enter #%d data: \n", i+1);
			System.out.print("Product name: ");
			scanner.nextLine();
			productName = scanner.nextLine();
			
			System.out.println("Product price: ");
			productPrice = scanner.nextDouble();
			
			System.out.println("Product quantity: ");
			productQuantity = scanner.nextInt();
			
			order.addItem(new OrderItem(new Product(productName, productPrice), productQuantity));
		}
		
		System.out.println("ORDER SUMMARY");
		System.out.println("Order Moment: " + order.getMoment());
		System.out.println("Order statud: " + order.getStatus().toString());
		System.out.println("Client: " + order.getClient().getName() + " (" + order.getClient().getBirthDate() + ") - " + order.getClient().getEmail());
		System.out.println("Order items: ");
		for(OrderItem item : order.getItens()) {
			System.out.println(item.getProduct().getName() + ", " + item.getProduct().getPrice() + ", Quantity: " + item.getQuantity() +  ", Subtotal: " + String.format("%.2f", item.subTotal()));
		}
		System.out.println("Total price: " + String.format("%.2f", order.total()));
		
		scanner.close();
	}
}
