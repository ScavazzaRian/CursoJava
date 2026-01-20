package entities.services;

import entities.Notificador;

public class PedidoService {
	private Notificador notificador;

	public PedidoService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public Notificador getNotificador() {
		return notificador;
	}

	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}

	public void processarPedido(double valor) {
		System.out.printf("Pedido de valor %.2f processado!\n", valor);
		System.out.println(notificador.enviar());
	}
}
