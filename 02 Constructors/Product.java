public class Product {
    private String PdtName;
    private int price;
    private static int totalPdts = 0;

    public Product(String PdtName, int price){
        this.PdtName = PdtName;
        this.price = price;
        totalPdts++;
    }

    public void display(){
        System.out.println("Product name: "+PdtName);
        System.out.println("Price of the product: "+price);
    }
    public static void count(){
        System.out.println("Total number of products: "+totalPdts);
    }

    public static void main(String[] args) {
        Product pdt1 = new Product("Mercedes", 50000);
        Product pdt2 = new Product("MayBach", 30000000);
        Product pdt3 = new Product("Rolls Royce", 70000000);
        pdt1.display();
        pdt2.display();
        pdt3.display();
        count();
    }
}
