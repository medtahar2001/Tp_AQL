package exercice02;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class TestOrderController {

    @Test
    public void testCreateOrder() {
        //**//
        OrderService mockOrderService = mock(OrderService.class);
        OrderController orderController = new OrderController(mockOrderService);
        Order order = new Order();
        orderController.createOrder(order);
        verify(mockOrderService).createOrder(order);
        //**//
        OrderDao mockOrderDao = mock(OrderDao.class);
        OrderService orderService = new OrderService(mockOrderDao);
        orderService.createOrder(order);
        verify(mockOrderDao).saveOrder(order);
    }
}