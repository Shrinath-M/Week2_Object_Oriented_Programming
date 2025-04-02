import java.util.ArrayList;

public class ShoppingCart {
        private ArrayList<CartItem> cartItems = new ArrayList<>();

        // Method to add an item to the cart
        public void addItem(String itemName, double price, int quantity) {
            for (CartItem item : cartItems) {
                if (item.getItemName().equalsIgnoreCase(itemName)) {
                    item.setQuantity(item.getQuantity() + quantity);
                    System.out.println(quantity + " more " + itemName + "(s) added to the cart.");
                    return;
                }
            }
            cartItems.add(new CartItem(itemName, price, quantity));
            System.out.println(itemName + " added to the cart.");
        }

        // Method to remove an item from the cart
        public void removeItem(String itemName) {
            cartItems.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
            System.out.println(itemName + " removed from the cart.");
        }

        // Display the total cost
        public void displayTotalCost() {
            double totalCost = 0;
            for (CartItem item : cartItems) {
                totalCost += item.getTotalPrice();
            }
            System.out.println("Total Cost: ₹" + totalCost);
        }

        // Display all items in the cart
        public void displayCart() {
            if (cartItems.isEmpty()) {
                System.out.println("Your cart is empty.");
                return;
            }
            System.out.println("Items in Cart:");
            for (CartItem item : cartItems) {
                System.out.println(item.getItemName() + " - ₹" + item.getPrice() + " x " + item.getQuantity() + " = ₹" + item.getTotalPrice());
            }
            displayTotalCost();
        }

}
