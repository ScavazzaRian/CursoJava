package model;

import java.util.function.Function;

public class UpperCasaName implements Function<Product, String>{

	@Override
	public String apply(Product t) {
		return t.getName().toUpperCase();
	}
	
}
