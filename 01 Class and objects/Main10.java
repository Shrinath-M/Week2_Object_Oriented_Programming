public class Main10 {
    public static void main(String[] args) {
            ShoppingCart cart = new ShoppingCart();
            cart.addItem("Laptop", 55000.00, 1);
            cart.addItem("Headphones", 2000.00, 2);
            cart.displayCart();
            cart.removeItem("Headphones");
            cart.displayCart();

    }
}
