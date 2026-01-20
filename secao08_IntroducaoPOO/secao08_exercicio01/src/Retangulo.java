
public class Retangulo {
	public double altura;
	public double largura;
	
	public double area() {
		return altura * largura;
	}
	
	public double perimetro() {
		return altura + altura + largura + largura;
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(altura, 2)) + (Math.pow(largura, 2)));
	}
	
	@Override
	public String toString() {
		return "AREA = " + area()
				+ "\nPERIMETRO = " + perimetro()
				+ "\nDIAGONAL = " + diagonal();
	}
}
