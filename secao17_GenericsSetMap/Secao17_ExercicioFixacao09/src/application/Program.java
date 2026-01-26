package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import enums.Tipo;
import model.Product;

public class Program {

	public static void main(String[] args) {
		Map<Product, Integer> movimento = new LinkedHashMap<>();
		String path = "C:\\temp\\movimento.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] infos = linha.split(",");
				Product product = new Product(infos[0], Tipo.valueOf(infos[1]));
				int quantidade = Integer.parseInt(infos[2]);
				
				int stockAtual = movimento.getOrDefault(product, 0);
				
				if (product.getTipo() == Tipo.IN) {
					stockAtual += quantidade;
				} else {
					stockAtual -= quantidade;
				}
				
//				if (product.getTipo() == Tipo.IN) {
//					movimento.put(product, movimento.getOrDefault(product, 0) + quantidade);
//				} else {
//					movimento.put(product, movimento.getOrDefault(product, 0) - quantidade);
//				}
				
				movimento.put(product, stockAtual);
				
				linha = br.readLine();
			}
			for (Product p : movimento.keySet()) {
				p.setStock(movimento.get(p));
				System.out.println(p.getName() + ", " + p.getStock());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}

}
