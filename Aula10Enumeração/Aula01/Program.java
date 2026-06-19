import java.util.Date;
import enitities.Order;
import enitities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
			Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
			System.out.println(order);
			
			OrderStatus os1 =  OrderStatus.DELIVERED;


	}

}
