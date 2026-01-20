package model.services;

import java.time.Duration;

import entities.model.CarRental;
import entities.model.Invoice;

public class RentalService {
	private Double pricePerDay;
	private TaxService taxService;

	public RentalService(Double pricePerDay, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		double days = Duration.between(carRental.getStart(), carRental.getFinish()).toDays();

		double payment;
		payment = pricePerDay * days;

		double tax = taxService.tax(payment);

		carRental.setInvoice(new Invoice(payment, tax));
	}
}
