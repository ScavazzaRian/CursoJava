package application;

import model.Par;

public class Program {
	public static void main(String[] args) {
		Par<String, Integer> usuario = new Par<>("Rian", 23);
		
		System.out.println(usuario.getChave());
		System.out.println(usuario.getValor());
	}
}
