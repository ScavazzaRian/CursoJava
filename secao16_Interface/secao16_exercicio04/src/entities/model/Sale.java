package entities.model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private int cod;
	private Receipt receipt;

	private List<OrderItem> lista = new ArrayList<>();

	public Sale(int cod) {
		this.setCod(cod);
	}

	public Receipt getReceipt() {
		return receipt;
	}

	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}

	public List<OrderItem> getLista() {
		return lista;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public Double total() {
		double sum = 0;
		for (OrderItem item : lista) {
			sum += item.getTotal();
		}
		return sum;
	}
}
