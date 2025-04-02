public class CarRental {
    private String CustomerName;
    private String CarModel;
    private int rentalDays;

    public CarRental(String CustomerName, String CarModel, int rentalDays){
        this.CarModel = CarModel;
        this.rentalDays = rentalDays;
        this.CustomerName = CustomerName;
    }
    public void totalCost(int rentalDays){
        System.out.println("Total cost for "+ rentalDays +" days is: "+rentalDays * 1000);
    }
    public void display(){
        System.out.println("Name of the customer: "+CustomerName);
        System.out.println("Name of the Car model: "+CarModel);
        System.out.println("Number of days for rent: "+rentalDays);
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Shrinath", "Mercedes MayBach", 3);
        cr.display();
        cr.totalCost(3);
    }
}
