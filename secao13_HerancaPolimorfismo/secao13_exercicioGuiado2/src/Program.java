import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

public class Program {
	public static void main(String[] args) {
		List<Shape> lista = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String color;
		double width, height, radius;
		char op;
		int qtd;
		
		System.out.print("Enter the number of shapes: ");
		qtd = scanner.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.printf("Shape #%d data:", i+1);
			System.out.print("Rectangle or Circle (r/c): ");
			op = scanner.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			scanner.nextLine();
			color = scanner.nextLine();
			
			if(op == 'r') {
				System.out.print("Width: ");
				width = scanner.nextDouble();
				System.out.print("Height: ");
				height = scanner.nextDouble();
				
				lista.add(new Rectangle(Color.valueOf(color.toUpperCase()), width, height));
			}else {
				System.out.print("Radius: ");
				radius = scanner.nextDouble();
				
				lista.add(new Circle(Color.valueOf(color), radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape forma : lista) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		scanner.close();
	}
}
