package entities;

public class NotificadorEmail extends Notificador {
	@Override
	public String enviar() {
		return "Enviando SMS: Pedido aprovado!";
	}
}
