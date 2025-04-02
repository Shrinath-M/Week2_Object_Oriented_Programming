// Superclass: Vehicle
class Vehicle2 {
    private int maxSpeed;
    private String model;

    public Vehicle2(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}




