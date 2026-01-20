package application;

import entities.Notificador;
import entities.NotificadorEmail;
import entities.services.PedidoService;

public class Program {

	public static void main(String[] args) {
		Notificador notificador = new NotificadorEmail();
		PedidoService pedido = new PedidoService(notificador);
		
		pedido.processarPedido(2);
	}

}
