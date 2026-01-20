package entities;

public class NotificadorSMS extends Notificador{
	@Override
	public String enviar() {
		return "Enviando EMAIL: Pedido aprovado!";
	}
}
