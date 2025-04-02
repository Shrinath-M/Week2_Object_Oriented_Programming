public class MobilePhone {
    private String brand;
    private String model;
    private int price;

    public MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.price = price;
        this.model = model;
    }
    public void display(){
        System.out.println("Brand name: "+brand);
        System.out.println("Model name: "+model);
        System.out.println("Price of the mobile: "+price);
    }
}
