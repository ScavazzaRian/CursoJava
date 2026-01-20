
public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void aumento(double porc) {
		if(porc < 0) {
			System.out.println("Digite um valor valido");
			return;
		}
		porc = porc / 100;
		salarioBruto += salarioBruto * porc;
	}
	
	@Override
	public String toString() {
		return "Funcionario: " + nome
				+ String.format("\nSalario Liquido: R$ %.2f", salarioLiquido());
	}
}
