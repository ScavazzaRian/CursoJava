
public class Produtos {
	public String nome;
	public double preco;
	public int qtd;
	
	public double Total() {
		return preco * qtd;
	}
	
	public void Add(int qtd) {
		this.qtd += qtd;
	}
	
	public void Remove(int qtd) {
		this.qtd -= qtd;
	}
	
	@Override
    public String toString() {
        return nome 
            + ", R$ " + String.format("%.2f", preco)
            + ", " + qtd + " unidades, Total: R$ " 
            + String.format("%.2f", Total());
    }
}