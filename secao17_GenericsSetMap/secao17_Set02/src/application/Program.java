package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		// Union -> Une os dois conjuntos
		Set<Integer> result = new TreeSet<>(a);
		result.addAll(b);
		System.out.println(result);
		
		// Intersection -> Retorna so oq ha de comum
		Set<Integer> result2 = new TreeSet<>(a);
		result2.retainAll(b);
		System.out.println(result2);
		
		// Difference -> Remove oq ha de comum e o restante de b
		Set<Integer> result3 = new TreeSet<>(a);
		result3.removeAll(b);
		System.out.println(result3);
	}

}
