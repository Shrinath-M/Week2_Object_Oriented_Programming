import java.util.ArrayList;
import java.util.List;

// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and setter methods (Encapsulation)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

// Interface Discountable
interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private double discountApplied;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountApplied = 0.0;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discountApplied = (getPrice() * discountPercentage) / 100;
        setPrice(getPrice() - discountApplied);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discountApplied;
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discountApplied;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discountApplied = 0.0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + additionalCharge) * getQuantity();
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discountApplied = (getPrice() * discountPercentage) / 100;
        setPrice(getPrice() - discountApplied);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discountApplied + ", Additional Charge: " + additionalCharge;
    }
}

// Main class
public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Create a list of food items
        List<FoodItem> order = new ArrayList<>();

        // Add food items to the order
        VegItem vegItem = new VegItem("Paneer Butter Masala", 250.0, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Biryani", 300.0, 1, 50.0);

        order.add(vegItem);
        order.add(nonVegItem);

        // Process the order and apply discounts
        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(10); // Apply 10% discount
                System.out.println(discountable.getDiscountDetails());
            }
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println();
        }
    }
}

