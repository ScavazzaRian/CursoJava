package application;

import java.util.ArrayList;
import java.util.List;

import model.Product;
import service.ProductService;

public class Program {
	public static void main(String[] args) {
		/*
		 * Consumer: interface funcional de tipo T, e possui um unico metodo abstrato do accept
		 */
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		System.out.println(ps.filteredSum(list, x -> x.getPrice() <= 100));
	}
}
