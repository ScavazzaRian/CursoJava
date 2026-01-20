package entities.model;

public class ComumProduct extends Product{

	public ComumProduct(String name, Double price) {
		super(name, price);
	}

	@Override
	public String priceTag() {
		return "Name: "
			+ getName()
			+ ", R$ "
			+ String.format("%.2f", getPrice());
	}
	
}
