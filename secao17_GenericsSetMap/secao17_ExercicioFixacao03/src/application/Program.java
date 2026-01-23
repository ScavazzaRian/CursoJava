package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> lista = List.of(1,2,3,4,5,6); // Imutavel
		List<String> lista2 = Arrays.asList("Rian", "Edson"); // Tamanho Fixo, mas posso trocar os elementos
		List<String> listaNomes = new ArrayList<>();
		
		Collections.addAll(listaNomes, "rian", "bob", "carlos"); // Jeito mais comum de add elementos numa lista
		
		print(lista);
		print(lista2);
		print(listaNomes);
		
		List<Double> somas = new ArrayList<>();
		Collections.addAll(somas, 3.0, 4.0, 5.0);
		System.out.println(somar(somas));
	}
	
	public static void print(List<?> lista) {
		for (Object obj : lista) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
	public static Double somar(List<? extends Number> list) {
		double soma = 0.0;
		for (Number obj : list) {
			soma += obj.doubleValue();
		}
		return soma;
	}
}
