
public class Triangulo {
	public double a,b,c;
	
	public double area() {
		double p = (a+b+c)/2;
		double area = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
		return area;
	}
	
	public static void maior(double area1, double area2) {
		if(area1 > area2) {
			System.out.println("Triangulo 1 e maior");
		}else if(area2 > area1) {
			System.out.println("Triangulo 2 e maior");
		}else {
			System.out.println("Mesma area");
		}
	}
}
