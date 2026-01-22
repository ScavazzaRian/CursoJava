package util;

import java.util.List;

import services.Shape;

public class Utilities {
	// Essa minha lista pode ser um tipo de Shape ou qlqr subtipo de shape como Rectangle or Circle
	public static Double totalArea(List<? extends Shape> list) {
		double soma = 0;
		for (Shape shape : list) {
			soma += shape.area();
		}
		return soma;
	}
}
