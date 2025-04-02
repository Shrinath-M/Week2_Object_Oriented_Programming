import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{Name='" + name + "', Price=" + price + "}";
    }
}

class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in Order:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void displayOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 75000);
        Product product2 = new Product("Smartphone", 50000);
        Product product3 = new Product("Headphones", 3000);


        Order order1 = new Order("ORD001");
        order1.addProduct(product1);
        order1.addProduct(product3);

        Order order2 = new Order("ORD002");
        order2.addProduct(product2);

        Customer customer = new Customer("Shrinath");
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        customer.displayOrders();
    }
}
