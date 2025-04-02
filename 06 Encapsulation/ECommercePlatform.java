public class ECommercePlatform {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();

        // Add product instances
        products.add(new Electronics(101, "Smartphone", 29999.99, 0.18));
        products.add(new Clothing(102, "Jacket", 3999.99, 0.12));
        products.add(new Groceries(103, "Rice", 999.99));

        // Calculate and display final price for each product (Polymorphism)
        for (Product product : products) {
            product.displayDetails();
            double discount = product.calculateDiscount();
            double tax = product instanceof Taxable ? ((Taxable) product).calculateTax() : 0;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + (product.getPrice() + tax - discount));
            System.out.println();
        }
    }
}