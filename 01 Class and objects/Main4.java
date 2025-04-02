import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        String name = sc.next();
        System.out.println("Enter the product code: ");
        int code = sc.nextInt();
        System.out.println("Enter the product price: ");
        int price = sc.nextInt();
        Inventory inv = new Inventory(code, name, price);
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        inv.calculateTotalCost(quantity);
    }
}
