package Util;

public class Coin {
	public static final double IMPOSTO = 0.06;
	
	public static double Conversor(double dolar, double compra) {
		double convertido = dolar * compra + (dolar * compra * IMPOSTO);
		return convertido;
	}
}
