import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		// Estrutura de dados do mesmo tipo e ordenada
		// Posso falar que a lista e um wrapper do vetor?
		// Cade elemento na lista e um no, cada elemento aponta para o proximo.
		// Seu tamanho e variavel diferente do vetor.
		// Lista nao aceita tipo primitivo
		
		// Comando mais utilizados:
		/*
		 * size() -> Devolve o tamanho da lista;
		 * add() -> adiciona um elemnto na lista;
		 * remove() -> remove um elemnto da lita;
		 * indexOf() e lastIndexOf() -> encontra a posicao do elemento;
		 * */
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		list.add(2, "Rian");
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println(list.size());
		
		list.remove("Anna");
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println(list.indexOf("Bob"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
		
		for(String resultado : result) {
			System.out.println(resultado);
		}
		
		String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
	}
}
