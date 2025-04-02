public class Vehicle {
    private String OwnerName;
    private String Vehicletype;
    private static int regFee = 5000;

    public Vehicle(String OwnerName, String VehicleType){
        this.OwnerName = OwnerName;
        this.Vehicletype = VehicleType;
    }

    public void display(){
        System.out.println("Owner name: "+OwnerName);
        System.out.println("Vehicle Type: "+Vehicletype);
    }
    public static void UpdateRegFee(int fee){
        System.out.println("Registration fees updated to "+fee+" from "+regFee);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Shrinath", "Luxury Car");
        vehicle.display();
        UpdateRegFee(6000);
    }
}
