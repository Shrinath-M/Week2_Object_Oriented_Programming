import javax.sound.midi.Soundbank;

public class ShoppingCart {
    private static int discount = 20;
    private String PdtName;
    private int price;
    private int quantity;
    private final int PdtId = 123;

    public ShoppingCart(String PdtName, int price, int quantity){
        this.quantity = quantity;
        this.price = price;
        this.PdtName = PdtName;
    }
    public void UpdateDiscount(int newDiscount){
        this.discount = newDiscount;
        System.out.println("Updated discount: "+newDiscount);
    }
    public void display(){
        if (this instanceof ShoppingCart){
            System.out.println("Product ID: "+PdtId);
            System.out.println("Product name: "+PdtName);
            System.out.println("Price: "+price);
            System.out.println("Quantity: "+quantity);
            System.out.println("Discount: "+discount);
        }
    }

    public static void main(String[] args) {
        ShoppingCart sc1 = new ShoppingCart("Mercedes", 1500000, 2);
        sc1.display();
        sc1.UpdateDiscount(30);

    }
}
