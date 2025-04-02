class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return ("Order shipped. Tracking Number: " + trackingNumber);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-04-01");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-04-02", "TRACK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-04-03", "TRACK67890", "2025-04-07");

        // Demonstrating polymorphism
        Order[] orders = { order, shippedOrder, deliveredOrder };

        for (Order currentOrder : orders) {
            currentOrder.display();
            System.out.println("Status: " + currentOrder.getOrderStatus());
            System.out.println("---");
        }
    }
}
