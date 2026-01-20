package entities;

public class PessoaJuridica extends Pessoa{
	private Integer quantidadeFuncionarios;
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer quantidadeFuncionarios) {
		super(nome, rendaAnual);
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	@Override
	public Double pagamentoImposto() {
		double totalPagamento = 0;
		if(quantidadeFuncionarios > 10) {
			totalPagamento = getRendaAnual() * 0.14;
		}else {
			totalPagamento = getRendaAnual() * 0.16;
		}
		return totalPagamento;
	}

}
