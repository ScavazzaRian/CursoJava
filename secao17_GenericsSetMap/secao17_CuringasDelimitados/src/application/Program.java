package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import model.Rectangle;
//import model.Circle;
//import util.Utilities;
//import services.Shape;

public class Program {
	/*
	 * Covariancia = podemos acessar o elemento mas nao podemos inserir
	 * Contravariancia = podemos inserir o elemento mas nao podemos acessar ele
	 * 
	 * List<? super Number> Number ou qualquer superclasse (Object) List<? extends
	 * Number> Number ou qualquer subclasse (Double)
	 */
	public static void main(String[] args) {
//		List<Shape> lista = new ArrayList<>();
//		lista.add(new Rectangle(4.0, 4.0));
//		lista.add(new Circle(5.0));
//		
//		
//		System.out.println(Utilities.totalArea(lista));

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		print(myObjs);

		copy(myDoubles, myObjs);
		print(myObjs);
	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number num : source) {
			destiny.add(num);
		}
	}

	public static void print(List<?> lista) {
		for (Object obj : lista) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
