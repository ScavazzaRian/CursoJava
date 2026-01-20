package model.services;

public class StandardShippingService implements ShippingService {

	@Override
	public Double shipment(Double amount) {
		if (amount <= 100.00) {
			return 20.00;
		} else if (amount <= 200.00) {
			return 12.00;
		} else {
			return 0.0;
		}
	}

}
