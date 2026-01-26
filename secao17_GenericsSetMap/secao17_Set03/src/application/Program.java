package application;

import java.util.HashSet;
import java.util.Set;

import model.Product;

public class Program {
	/*
	 * Como o set testa igualdade:
	 * Se nossa classe tiver implementado o HashCode e o Equals, o set testa atraves dele.
	 */
	public static void main(String[] args) {
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("Tv", 2000.00));
		set.add(new Product("Tablet", 500.00));
		set.add(new Product("Telefone", 2500.00));
		
		Product prod = new Product("Tv", 2000.00);
		
		System.out.println(set.contains(prod));
	}

}
