package entities.model;

import java.time.LocalDateTime;

public class Receipt {
	private String authorizationCode;
	private LocalDateTime moment;

	public Receipt(String authorizationCode, LocalDateTime moment) {
		this.authorizationCode = authorizationCode;
		this.moment = moment;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

}
