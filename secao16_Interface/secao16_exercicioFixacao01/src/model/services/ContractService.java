package model.services;

import java.time.LocalDate;

import entities.model.Contract;
import entities.model.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.setOneOnlinePaymentService(onlinePaymentService);
	}

	public OnlinePaymentService getOneOnlinePaymentService() {
		return onlinePaymentService;
	}

	public void setOneOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getTotalValue() / months;
		LocalDate now = contract.getDate();		
		
		for(int i = 1; i <= months; i++) {
			LocalDate nextInstallment = now.plusMonths(i);
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			contract.getListaPagamento().add(new Installment(nextInstallment, quota));
		}
	}
}
