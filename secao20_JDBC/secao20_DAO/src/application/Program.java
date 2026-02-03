package application;

public abstract class Program {
	// Para cada entidade do BD, teremos um objeto responsavel por fazer o acesso de dados;
	/*
	 * Exemplo:
	 * 	- Cliente -> ClienteDAO
	 * 	- Produto -> ProdutoDAO
	 * 	- Pedido  -> PedidoDAO
	 * 
	 * Cada DAO sera definido por uma interface e injecao de dependencia sera feita por Factory
	 */
}
