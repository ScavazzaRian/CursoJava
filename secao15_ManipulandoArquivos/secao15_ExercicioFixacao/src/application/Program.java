package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Product> lista = new ArrayList<>();
		
		// Definindo o lugar do arquivo csv:
		System.out.println("Onde ficarao armazenados os dados de itens vendidos: ");
		String strPath = scanner.nextLine();
		boolean success = new File(strPath + "\\out").mkdir();
		File file = new File(strPath + "\\out");
		if (success == true) {
			System.out.println("Pasta criada com sucesso!");
		} else if (file.exists()){
			System.out.println("Pasta ja criada!");
		} else {
			System.out.println("Erro ao criar pasta!");
		}
		
		// Pegando dados dos produtos:
		System.out.println("Informe os dados de produto (nome,preco,quantidade): ");
		String[] dadosProdutos = scanner.nextLine().split(",");
		
		String nome = dadosProdutos[0];
		Double preco = Double.parseDouble(dadosProdutos[1]);
		Integer quantity = Integer.parseInt(dadosProdutos[2]);
		
		lista.add(new Product(nome, preco, quantity));
		
		// Criando o arquivo:
		String path = strPath + "\\out\\out.csv";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (Product product : lista) {
				bw.write(product.getName());
				bw.write(", ");
				bw.write(product.totalProduct());
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		scanner.close();
	}
}
