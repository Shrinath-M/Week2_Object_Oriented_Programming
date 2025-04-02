class Car extends Vehicle{
    private int capacity;
    public Car(int maxSpeed, String fuelType, int capacity){
        super(maxSpeed, fuelType);
        this.capacity = capacity;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Car capacity: "+capacity);
    }
}
class Truck extends Vehicle{
    private int cargoCap;
    public Truck(int maxSpeed, String fuelType, int cargoCap){
        super(maxSpeed, fuelType);
        this.cargoCap = cargoCap;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Cargo capacity: "+cargoCap+" kg");
    }
}
class Motorcycle extends Vehicle{
    private String type;
    public Motorcycle(int maxSpeed, String fuelType, String type){
        super(maxSpeed, fuelType);
        this.type = type;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Vehicle type: "+type);
    }
}
public class VehicleDetails {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(120, "Petrol", 4);
        vehicles[1] = new Truck(80, "Diesel", 1000);
        vehicles[2] = new Motorcycle(120, "Petrol", "Sports");
        for (int i = 0; i < vehicles.length; i++){
            vehicles[i].displayInfo();
            System.out.println("----");
        }
    }
}
