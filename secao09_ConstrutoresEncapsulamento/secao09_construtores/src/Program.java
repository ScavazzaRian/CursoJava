import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		double preco;
		int quantity;
		
		nome = sc.nextLine();
		preco = sc.nextDouble();
		quantity = sc.nextInt();
		
		Product produto = new Product(nome, preco, quantity);
		
		System.out.println(produto);
		
		sc.close();
	}
}
