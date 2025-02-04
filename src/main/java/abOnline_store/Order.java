package abOnline_store;
import java.util.Map;

public class Order {


    private int orderId;
        private int userId;
        private Map<Integer, Integer> items; // Ürün ID -> Miktar
        private String status;

        public Order(int orderId, int userId, Map<Integer, Integer> items, String status) {
            this.orderId = orderId;
            this.userId = userId;
            this.items = items;
            this.status = status;
        }

        // Getter ve Setter metotları
        public int getOrderId() {
            return orderId;
        }
        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }
        public int getUserId() {
            return userId;
        }
        public void setUserId(int userId) {
            this.userId = userId;
        }
        public Map<Integer, Integer> getItems() {
            return items;
        }
        public void setItems(Map<Integer, Integer> items) {
            this.items = items;
        }
        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }
    }

