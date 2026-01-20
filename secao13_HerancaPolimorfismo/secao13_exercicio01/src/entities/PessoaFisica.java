package entities;

public class PessoaFisica extends Pessoa{
	private Double gastoSaude;
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double pagamentoImposto() {
		double totalPagamento = 0;
		if(super.getRendaAnual() > 20000) {
			totalPagamento = (getRendaAnual() * 0.25) - (gastoSaude * 0.50);
		}else {
			totalPagamento = (getRendaAnual() * 0.15) - (gastoSaude * 0.50);
		}
		return totalPagamento;
	}

}
