package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.PriceUpdate;
import model.Product;

public class Program {
	public static void main(String[] args) {
		/*
		 * Consumer: interface funcional de tipo T, e possui um unico metodo abstrato do accept
		 */
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.90));
	}
}
