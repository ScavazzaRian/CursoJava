package model.service;

public class ConservativeRiskService implements RiskService {

	@Override
	public Boolean isApproved(Double amount, Double salary) {
		double parcela = amount / 12;
		return parcela <= salary * 0.1;
	}
}
