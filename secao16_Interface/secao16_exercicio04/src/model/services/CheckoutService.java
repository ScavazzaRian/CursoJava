package model.services;

import java.time.LocalDateTime;

import entities.model.Receipt;
import entities.model.Sale;

public class CheckoutService {
	PaymentGateway paymentGateway;

	public CheckoutService(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	public PaymentGateway getPaymentGateway() {
		return paymentGateway;
	}

	public void setPaymentGateway(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}
	
	public void processSale(Sale sale) {
		LocalDateTime now = LocalDateTime.now();
		
		sale.setReceipt(new Receipt(paymentGateway.pay(sale.total()), now));
	}
}
