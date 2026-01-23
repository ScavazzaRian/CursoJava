package model;

public class Caixa<T> {
	private T conteudo;

	public T pegar() {
		return conteudo;
	}

	public void guardar(T i) {
		this.conteudo = i;
	}
}
