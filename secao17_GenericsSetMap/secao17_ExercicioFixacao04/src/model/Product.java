package model;

import java.util.Objects;

import enums.Tipo;

public class Product {
	private String name;
	private Tipo tipo;
	private int stock;

	public Product(String name, Tipo tipo) {
		this.name = name;
		this.tipo = tipo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getStock() {
		return stock;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name);
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
}
