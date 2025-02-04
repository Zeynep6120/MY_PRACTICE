package abOnline_store;
import abOnline_store.Product;

import java.util.Map;
public class Runner {



        public static void main(String[] args) {
            InventoryManager inventoryManager = new InventoryManager();
            CartService cartService = new CartService();
            OrderService orderService = new OrderService();

            // Envantere ürün ekleme
            inventoryManager.addProduct(new Product(1, "Laptop", "Elektronik", 15000, 10));
            inventoryManager.addProduct(new Product(2, "Telefon", "Elektronik", 8000, 20));

            // Ürünleri listeleme
            System.out.println("Envanter:");
            for (Map.Entry<Integer, Product> entry : inventoryManager.getInventory().entrySet()) {
                Product product = entry.getValue();
                System.out.println(product.getId() + " - " + product.getName() + " (" + product.getStock() + " adet)");
            }

            // Sepete ürün ekleme
            cartService.addToCart(1, 2); // 2 adet Laptop
            cartService.addToCart(2, 1); // 1 adet Telefon

            // Sipariş oluşturma
            orderService.createOrder(1, cartService.getCart().getItems());
        }
    }

