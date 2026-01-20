package model.service;

import java.time.LocalDate;

import entities.model.ApprovalStatus;
import entities.model.LoanRequest;

public class LoanProcessService {
	RiskService riskService;

	public LoanProcessService(RiskService riskService) {
		this.riskService = riskService;
	}

	public RiskService getRiskService() {
		return riskService;
	}

	public void setRiskService(RiskService riskService) {
		this.riskService = riskService;
	}
	
	public void process(LoanRequest loanRequest) {
		Boolean resultado = riskService.isApproved(loanRequest.getAmount(), loanRequest.getSalary());
		if (resultado) {
			loanRequest.setStatus(new ApprovalStatus(resultado, "Aprovado!", LocalDate.now()));
		} else {
			loanRequest.setStatus(new ApprovalStatus(resultado, "Reprovado!", LocalDate.now()));
		}
	}
}
