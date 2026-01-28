package model;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product t) {
		t.setPrice(t.getPrice() * 1.1);
	}

}
