
public class Program {
	public static void main(String[] args) {
		Produtos calca = new Produtos();
		
		calca.nome = "Calca larga";
		calca.preco = 25.32;
		calca.qtd = 3;
		
		System.out.println(calca);
		
		calca.Add(5);
		
		System.out.println(calca);
		
		calca.Remove(2);
		
		System.out.println(calca);
	}
}
