package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
		/*
		 * Uma sequencia de elementos de uma fonte de dados: colecao, array
		 * 
		 * - Stream, declarativa (iteracao interna, escondida do programador)
		 * - Ela e imutavel
		 * 
		 * Pipeline: Linha de montagem. Podemos criar um fluxo de processamento. Colocar varios processos
		 * em varias streams.
		 * - E composto por 0 ou mais operacoes intermediarias e uma terminal
		 * - OPERACAO INTERMEDIARIA -> Encadeamento, produz uma nova stream
		 * 		- So executa quando a operacao terminal e invocada
		 * 		- List operacoes: filter, map, flatmap, peek, distinct, sorted, skip, limit(*)
		 * - OPERACAO TERMINAL -> Producao um objeto nao stream
		 * 		-> .collect(Collectors.toList())
		 * 		- List operacoes: forEach, forEachOrdered, toArray, reduce, collect, min, max
		 * 		count, anyMatch(*), allMatch(), noneMatch, findFirst, findAny;
		 */
		
		/*
		 * Para criar uma stream() ou parallelStream() a partir de uma colecao fazemos list.stream()
		 * 
		 * Outras formas incluem:
		 * Stream.of
		 * Stream.ofNullable
		 * Stream.iterate
		 */
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		// O limit limita a quantidade de elementos e nao o valor
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2).limit(10);
		System.out.println(Arrays.toString(st3.toArray()));
		
		Stream<Long> fibo = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(fibo.limit(10).toArray()));
	}
}
