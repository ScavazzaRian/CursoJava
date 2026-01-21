package application;

import mode.entities.AbstractShape;
import mode.entities.Circle;
import mode.enums.Color;

public class Program {
	public static void main(String[] args) {
		AbstractShape circulo = new Circle(Color.WHITE, 3.0);
		
		System.out.println(circulo.getColor().name());
		System.out.println(circulo.area());
	}
}
