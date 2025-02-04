package abOnline_store;
import java.util.HashMap;
import java.util.Map;
//CART(SEPET MODELİ)
public class Cart {


        private Map<Integer, Integer> items; // Ürün ID -> Miktar

        public Cart() {
            this.items = new HashMap<>();
        }

        public void addItem(int productId, int quantity) {
            items.put(productId, items.getOrDefault(productId, 0) + quantity);
        }

        public void removeItem(int productId) {
            items.remove(productId);
        }

        public Map<Integer, Integer> getItems() {
            return items;
        }
    }

