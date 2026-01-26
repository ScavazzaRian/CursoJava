package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

import model.Vendedor;

public class Program {

	public static void main(String[] args) {
		Map<Vendedor, Double> vendas = new LinkedHashMap<>();
		String path = "C:\\temp\\vendedor.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String linha = br.readLine();
			while (linha != null) {
				String[] infos = linha.split(",");
				double total = Double.parseDouble(infos[1]);
				
				vendas.put(new Vendedor(infos[0]), vendas.getOrDefault(new Vendedor(infos[0]), 0.0) + total);
				
				linha = br.readLine();
			}
			
			for (Vendedor venv : vendas.keySet()) {
				System.out.println("Name: " + venv.getName() + ", Total sales: " + vendas.get(venv));
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

}
