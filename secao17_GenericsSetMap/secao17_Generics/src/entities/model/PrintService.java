package entities.model;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	// Caso eu quissesse adionar outros tipos eu precisaria alterar todo o codigo
	// Quebrando a utilizado basica do fundamento POO que e o reuso
	
	// Daria pra utilizar a classe Object ja que Integer, String herdam dela, mas daria ruim;
	
	// Portanto o mais correto e utilizar o Generics;
	// Basicamente o primeiro elemento instanciado vai ser o tipo da lista;
	List<T> lista = new ArrayList<>();
	
	public void addValue(T value) {
		lista.add(value);
	}
	
	public T first() {
		if(lista.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return lista.get(0);
	}
	
	public void print() {
		if (lista.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		for (T num : lista) {
			System.out.println(num);
		}
	}
}
