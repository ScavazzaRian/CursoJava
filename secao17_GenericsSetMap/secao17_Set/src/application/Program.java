package application;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.TreeSet;

public class Program {
	/*
	 * Set<T> (INTERFACE)
	 * - Nao admite repeticao
	 * - Elemento nao possuem posicao
	 * - Acesso, insercao e remocao sao rapidos
	 * - Oference operacoes do tipo intersecao (inner join), uniao (union) e diferenca
	 * 
	 * HashSet -> Todas as operacoes sao rapidas, mas nao possui ordenacao
	 * TreeSet -> Mais lento e ordenado pelo compareTo do objeto
	 * LinkedHashSet -> Velocidade media e a ordem e conforme adicionado.
	 * 
	 * add(obj), remove(obj), contains(obj)
	 * Tudo e baseado em hashCode e Equals, se eles nao existirem e usado a comparacao de ponteiro.
	 * 
	 * clear(limpa o conjunto)
	 * size(retorna o tamanho do conjunto)\
	 * removeIf(predicate)
	 * 
	 * addAll() adiciona no conjunto oss elementos de outro conjunto sem repeticao
	 * retainAll() remove do conjunto os elementos nao contidos em outro
	 * removeAll() remove do conjunto os elementos contidos em outro
	 */
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();

		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		set.remove("Tablet");
		set.removeIf(x -> x.length() >= 3);

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
	}

}
