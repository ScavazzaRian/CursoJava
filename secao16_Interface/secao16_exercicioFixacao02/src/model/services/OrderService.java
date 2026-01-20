package model.services;

import entities.model.Order;

public class OrderService {
	ShippingService shippingService;

	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public ShippingService getShippingService() {
		return shippingService;
	}

	public void setShippingService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public Double total(Order order) {
		double total = order.getTotal() + shippingService.shipment(order.getBasicValue());
		return total;
	}
}
