package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Product;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		String path = "C:\\temp\\produtos.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] data = linha.split(",");
				list.add(new Product(data[0], Double.parseDouble(data[1])));
				linha = br.readLine();
			}
			double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / list.size();

			System.out.println("Average price: " + String.format("%.2f", avg));
			
			Comparator<String> comp = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName()).sorted(comp.reversed())
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
}
