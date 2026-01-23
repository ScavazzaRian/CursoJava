package application;

import model.Caixa;

public class Program {
	public static void main(String[] args) {
		// Exercicios para entender melhor a utilizacao de Generics com Java.
		Caixa<String> caixa = new Caixa<>();
		caixa.guardar("Oi");
		System.out.println(caixa.pegar());
		
		Caixa<Integer> caixa2 = new Caixa<>();
		caixa2.guardar(23);
		System.out.println(caixa2.pegar());
	}
}
