import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) {
		// Tipo especial que serve para especificar a forma literal de um conjunto de constante
		Order pedido = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(pedido);
		
		// O usuario vai entrar com uma String
		// Para converter para Enum passamos OrderStatus.valueOf("DELIVERED")
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}
