import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Product> produtos = new ArrayList<>();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date;
		String name;
		double price;
		char op;
		int qtd;
		
		System.out.print("Enter the number of products: ");
		qtd = scanner.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.printf("Product #%d data: \n", i+1);
			System.out.println("Common, used or imported (c/u/i)? ");
			op = scanner.next().charAt(0);
			
			// Generics question
			System.out.print("Name: ");
			scanner.nextLine();
			name = scanner.nextLine();
			
			System.out.print("Price: ");
			price = scanner.nextDouble();
			
			switch(op) {
				case 'i':
					System.out.print("Customs fee: ");
					double fee = scanner.nextDouble();
					produtos.add(new ImportedProduct(name, price, fee));
					break;
				case 'c':
					produtos.add(new Product(name, price));
					break;
				case 'u':
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					date = LocalDate.parse(scanner.next(), fmt);
					produtos.add(new UsedProduct(name, price, date));
					break;
				default:
					System.out.print("Opcao invalida");
					break;
			}
		}
		
		for(Product produto : produtos) {
			System.out.println(produto.priceTag());
		}
		
		scanner.close();
	}
}
