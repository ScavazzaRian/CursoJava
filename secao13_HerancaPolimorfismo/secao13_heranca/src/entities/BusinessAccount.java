package entities;

public class BusinessAccount extends Account {
	private Double loanLimite;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
		super(number, holder, balance);
		this.loanLimite = loanLimite;
	}

	public Double getLoanLimite() {
		return loanLimite;
	}

	public void setLoanLimite(Double loanLimite) {
		this.loanLimite = loanLimite;
	}
	
	@Override
	public void withDraw(double amount) {
		super.withDraw(amount);
		balance -= 2.0;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimite) {
			balance += amount - 10.0;
		}
	}
}
