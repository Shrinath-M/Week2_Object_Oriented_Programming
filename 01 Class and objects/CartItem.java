import java.util.ArrayList;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Set quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Calculate total price of the item
    public double getTotalPrice() {
        return price * quantity;
    }
}





