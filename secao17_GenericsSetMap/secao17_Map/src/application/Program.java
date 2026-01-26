package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	/*
	 * E uma estrutura de dados de chave e valor;
	 * 		- Nao permite repeticoes do objeto chave;
	 * 		- Os elementos sao indexados pela chave;
	 * 		- Acesso, insercao e remocao sao rapidas;
	 * 
	 * Uso comum: cookies, local storage, qualquer modelo chave-valor;
	 * 
	 * Principais implementacoes (igual ao do Set):
	 * 		- HashMap 
	 * 		- TreeMap
	 * 		- LinkedHashMap
	 * 
	 * Metodos (baseado no equals e no hashCode):
	 * 		- Put (key, value)
	 * 		- Remove (key)
	 * 		- containsKey(key)
	 * 		- get (key) -> pega o valor
	 * 
	 * 	clear()
	 *  size()
	 *  keySet() -> retorna um Set<k>
	 *  values() -> retorna uma Collection<V>
	 */
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
		
		// Ele vai sobrescrever o valor, ja que nao pode existir duas chaves phone;
		cookies.put("phone", "99711133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
