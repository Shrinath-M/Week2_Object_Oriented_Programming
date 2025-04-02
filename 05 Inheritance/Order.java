public class Order {
    private int orderId;
    private String orderDate;
    public Order(int orderId, String orderDate){
        this.orderDate = orderDate;
        this.orderId = orderId;
    }
    public String getOrderStatus(){
        return ("Order placed!");
    }
    public void display(){
        System.out.println("Order date: "+orderDate);
        System.out.println("Order ID: "+orderId);
    }
}
