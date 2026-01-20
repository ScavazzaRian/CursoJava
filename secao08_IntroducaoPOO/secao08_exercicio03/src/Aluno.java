
public class Aluno {
	public double nota1, nota2, nota3;
	
	public double media() {
		return nota1 + nota2 + nota3;  
	}
	
	public void reprovado(double nota) {
		if (nota >= 60) {
			System.out.println("APROVADO");
		}else {
			System.out.printf("REPROVADO\nFALTOU %.2f PONTOS", 60 - nota);
		}
	}
}