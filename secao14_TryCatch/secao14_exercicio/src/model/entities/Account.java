package model.entities;

import model.exception.AccountException;

public class Account {
	private Integer number;
	private String holder;
	private double balance;
	private Double withDrawLimit;
	
	public Account(Integer number, String holder, Double deposit, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		deposit(deposit);
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	} 
	
	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withDraw(Double amount) throws AccountException {
		if(amount > withDrawLimit) {
			throw new AccountException("The amount exceeds withdraw limit");
		}
		if(amount > balance) {
			throw new AccountException("Not enough balance");
		}
		balance -= amount;
	}
}
