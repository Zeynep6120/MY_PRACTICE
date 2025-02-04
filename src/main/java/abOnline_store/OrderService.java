package abOnline_store;
import abOnline_store.Order;

import java.util.HashMap;
import java.util.Map;
public class OrderService {



        private Map<Integer, Order> orders;
        private int currentOrderId;

        public OrderService() {
            orders = new HashMap<>();
            currentOrderId = 1;
        }

        public void createOrder(int userId, Map<Integer, Integer> items) {
            Order order = new Order(currentOrderId, userId, items, "Hazırlanıyor");
            orders.put(currentOrderId, order);
            System.out.println("Sipariş oluşturuldu. Sipariş ID: " + currentOrderId);
            currentOrderId++;
        }

        public Order getOrder(int orderId) {
            return orders.get(orderId);
        }
    }

