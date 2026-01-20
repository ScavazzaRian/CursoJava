package entities.model;

public class ImportedProduct extends Product{
	private Double customsFee;
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return getPrice() + customsFee;
	}

	@Override
	public String priceTag() {
		return "Name: "
				+ getName()
				+ ", R$ "
				+ String.format("%.2f", getPrice())
				+ ", Total Price: R$ "
				+ String.format("%.2f", totalPrice());
	}
}
