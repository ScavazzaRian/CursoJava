package entities.model;

public class ComboDevice extends Device implements Scanner, Printer {
	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing " + doc);
	}

	@Override
	public String scanner() {
		return "Combo scan content";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo scanning " + doc);
	}
}
