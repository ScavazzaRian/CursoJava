package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Product;
import model.UpperCasaName;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.90));

		// Funcao map, aplica uma funcao para todos os elementos de uma sequencia de dados(stream)
		// Map so funciona no stram
		
		List<String> names = list.stream().map(new UpperCasaName()).collect(Collectors.toList());
		List<String> teste = list.stream().map(x -> x.getName().toLowerCase()).collect(Collectors.toList());
		
		for (String p : names) {
			System.out.println(p);
		}
		
		for (String p : teste) {
			System.out.println(p);
		}
	}

}
