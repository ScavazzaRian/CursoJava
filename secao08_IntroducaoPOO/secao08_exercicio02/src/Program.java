
public class Program {
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		
		func.nome = "Rian";
		func.salarioBruto = 1000;
		func.taxa = 100;
		
		System.out.println(func);
		
		func.aumento(10);
		
		System.out.println(func);
	}
}
