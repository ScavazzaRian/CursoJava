package entities;

public class Bank {
	private int id;
	private String nome;
	private double saldo;
	
	public Bank(int id, String nome, double depositoInicial) {
		this.id = id;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	public Bank(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public double getDeposito() {
		return saldo;
	}
	
	public void saque(double saque) {
		this.saldo = saldo - saque - 5;
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	@Override
	public String toString() {
		return id
				+ ", Nome: "
				+ nome
				+ ", saldo: "
				+ String.format("%.2f", saldo);
	}
}
