package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.model.ComumProduct;
import entities.model.ImportedProduct;
import entities.model.Product;
import entities.model.UsedProduct;

public class Program {
	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		String name;
		int qtd;
		double price;
		char op;
		List<Product> lista = new ArrayList<>();
		
		
		System.out.println("Quantos produtos serao cadastrados: ");
		qtd = scanner.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.println("Qual sera o produto cadastrado (i/u)?");
			op = scanner.next().charAt(0);
			
			System.out.println("Informe o nome do produto: ");
			scanner.nextLine();
			name = scanner.nextLine();
			
			System.out.println("Informe o preco do produto: ");
			price = scanner.nextDouble();
			
			if(op == 'i') {
				System.out.println("Informe a taxa de importacao: ");
				double tax = scanner.nextDouble();
				lista.add(new ImportedProduct(name, price, tax));
			} else if (op == 'u') {
				System.out.println("Informe a data de fabricacao: (dd/MM/yyyy)");
				LocalDate date = LocalDate.parse(scanner.next(), fmt);
				lista.add(new UsedProduct(name, price, date));
			} else {
				lista.add(new ComumProduct(name, price));
			}
		}
		
		for (Product product : lista) {
			System.out.println(product.priceTag());
		}
		
		scanner.close();
	}
}
