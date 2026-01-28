package application;

import java.util.ArrayList;
import java.util.List;

import model.Product;
import model.ProductPredicate;

public class Program {
	// Predicado:
	/*
	 * - 
	 */
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 450.0));
		list.add(new Product("HD Case", 80.9));
		
		// Possivel jeitos
		list.removeIf(p -> p.getPrice() >= 100);
		list.removeIf(new ProductPredicate());
		list.removeIf(Product::staticProductPredicate);
		
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
