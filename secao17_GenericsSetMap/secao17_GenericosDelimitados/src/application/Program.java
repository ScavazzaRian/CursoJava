package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.model.Product;
import services.CalcularionService;

public class Program {

	public static void main(String[] args) {
		List<Product> lista = new ArrayList<>();
		String path = "C:\\temp\\produtos.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] listaString = linha.split(",");
				lista.add(new Product(listaString[0], Double.parseDouble(listaString[1])));
				linha = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
		
		Product x = CalcularionService.max(lista);
		System.out.println(x.getName() + ", " + x.getPrice());
	}

}
