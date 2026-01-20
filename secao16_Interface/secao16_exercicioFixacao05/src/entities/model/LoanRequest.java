package entities.model;

public class LoanRequest {
	private Double amount;
	private Double salary;

	private ApprovalStatus status;

	public LoanRequest(Double amount, Double salary) {
		this.amount = amount;
		this.salary = salary;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public ApprovalStatus getStatus() {
		return status;
	}

	public void setStatus(ApprovalStatus status) {
		this.status = status;
	}

}
