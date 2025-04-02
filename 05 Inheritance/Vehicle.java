public class Vehicle {
    private int maxspeed;
    private String fuelType;

    public Vehicle(int maxspeed, String fuelType){
        this.maxspeed = maxspeed;
        this.fuelType = fuelType;
    }
    public void displayInfo(){
        System.out.println("Maximum speed: "+maxspeed+" Fuel Type: "+fuelType);
    }
}
