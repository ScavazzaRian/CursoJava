package entities.model;

import java.time.LocalDate;

public class ApprovalStatus {
	private Boolean approved;
	private String message;
	private LocalDate date;

	public ApprovalStatus(Boolean approved, String message, LocalDate date) {
		this.approved = approved;
		this.message = message;
		this.date = date;
	}

	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Pedido de emprestimo: " + getMessage()
		+ " Data: " + getDate();
	}
}
