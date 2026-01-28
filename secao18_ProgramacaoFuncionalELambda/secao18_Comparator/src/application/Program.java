package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Product;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 450.0));

		// Tem um problema, nossa classe nao fica fechada para alteracao
		// Se o criterio de comparacao mudar, vamos precisar alterar a classe product
		// O ideal e nao precisar alterar a classe product

		// Collections.sort(list);

		// no proprio objeto list temos um metodo sort (interface funcional (possui
		// apenas um metodo))

		// Primeiro jeito de implementar o Comparator
		list.sort(new MyComparator());

		for (Product p : list) {
			System.out.println(p);
		}

		// Segundo jeito
		Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};

		list.sort(comp);

		for (Product p : list) {
			System.out.println(p);
		}
		
		// Terceiro jeito
		Comparator<Product> comp2 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		list.sort(comp2);

		for (Product p : list) {
			System.out.println(p);
		}
		
		// Quarto jeito
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		for (Product p : list) {
			System.out.println(p);
		}
		
		// Do lado esquerdo os parametros e do lado direito a implementacao da funcao
	}
}
