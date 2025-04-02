public class Inventory {
    private int ICode;
    private String IName;
    private int IPrice;

    public Inventory(int ICode, String IName, int IPrice){
        this.ICode = ICode;
        this.IPrice = IPrice;
        this.IName = IName;
    }

    public void display(){
        System.out.println("Item code: "+ICode);
        System.out.println("Item name: "+IName);
        System.out.println("Item price: "+IPrice);
    }
    public void calculateTotalCost(int quantity){
        int TotalCost = IPrice * quantity;
        System.out.println("Total cost of purchase: "+TotalCost);
    }
}
