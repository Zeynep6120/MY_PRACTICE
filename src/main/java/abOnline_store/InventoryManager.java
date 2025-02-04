package abOnline_store;
import abOnline_store.Product;
import java.util.HashMap;
import java.util.Map;
//InventoryManager(EnvanterYönetimi)
public class InventoryManager {



        private Map<Integer, Product> inventory;

        public InventoryManager() {
            inventory = new HashMap<>();
        }

        public void addProduct(Product product) {
            inventory.put(product.getId(), product);
        }

        public Product getProduct(int productId) {
            return inventory.get(productId);
        }

        public void updateStock(int productId, int quantity) {
            Product product = inventory.get(productId);
            if (product != null && product.getStock() >= quantity) {
                product.setStock(product.getStock() - quantity);
            } else {
                System.out.println("Yetersiz stok!");
            }
        }

        public Map<Integer, Product> getInventory() {
            return inventory;
        }
    }

