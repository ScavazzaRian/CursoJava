package application;

import model.Cliente;

public class Program {
	/*
	 * HashCode e Equals: - Sao operacoes da classe Object para comparar se um
	 * objeto e igual ao outro; * Equals: lento, resposta 100% * hashCode: rapido,
	 * porem nao e 100%
	 * 
	 * - Tipo comuns como (String, LocalDate, Integer, etc) ja possuem
	 * implementacao, classes personalizadas precisam implementa-las.
	 */

	public static void main(String[] args) {
		// Exemplo
		String a = "Maria";
		String b = "Alex";

		System.out.println(a.equals(b));

		// HashCode
		// Esse metodo retorna um numero inteiro representado um codigo gerado a partir
		// das infos
		// do objeto.

		// Valores iguais retornam mesmo HashCode
		// Ha casos, em que coiencidamente valores diferentes podem retornar o mesmo
		// HashCode **raro
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		// O uso mais comum e: Temos uma lista gigante comparamos nosso objeto com todos
		// da lista
		// atraves do hashCode, caso de igual usamos o equals para garantir se objeto e
		// mesmo igual
		
		Cliente c1 = new Cliente("Maria", "maria@gmail.com");
		Cliente c2 = new Cliente("Alex", "alex@gmail.com");
		Cliente c3 = new Cliente("Maria", "mariajosefina@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.equals(c3));
		
		// Quando faco c1 == c2, ele vai comparar a posicao deles na memoria (instanciando); Retornando false
		//apesar do conteudo ser igual. 
	}
}
