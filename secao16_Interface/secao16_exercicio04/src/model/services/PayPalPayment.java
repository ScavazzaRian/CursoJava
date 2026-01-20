package model.services;

public class PayPalPayment implements PaymentGateway {

	@Override
	public String pay(Double amount) {
		return "PAYPAL-" + String.format("%.0f", amount) + String.format("\nTotal a pagar: %.2f", amount);
	}

}
