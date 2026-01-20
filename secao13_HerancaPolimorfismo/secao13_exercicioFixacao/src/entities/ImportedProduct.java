package entities;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double costomsFee) {
		super(name, price);
		this.customsFee = costomsFee;
	}

	public Double getCostomsFee() {
		return customsFee;
	}

	public void setCostomsFee(Double costomsFee) {
		this.customsFee = costomsFee;
	}
	
	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(getName());
		sb.append(" $ ");
		sb.append(getPrice());
		sb.append(" (Customs fee: $ ");
		sb.append(totalPrice());
		sb.append(")");
		
		return sb.toString();
	}
}
