package abOnline_store;

public class CartService {



        private Cart cart;

        public CartService() {
            cart = new Cart();
        }

        public void addToCart(int productId, int quantity) {
            cart.addItem(productId, quantity);
        }

        public void removeFromCart(int productId) {
            cart.removeItem(productId);
        }

        public Cart getCart() {
            return cart;
        }
    }

