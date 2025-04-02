public class VehicleReg {
    private int regFee = 1000;
    private String ownerName;
    private String vehicleType;
    private final int regNum;

    public VehicleReg(String ownerName, String vehicleType, int regNum){
        this.regNum = regNum;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
    }

    public void display(){
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Registration number: "+regNum);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Registration fees: "+regFee);
    }

    public void UpdateRegfee(int newFee){
        if (this instanceof VehicleReg){
            this.regFee = newFee;
            System.out.println("registration fee updated successfully");
        }
        else{
            System.out.println("Operation not allowed: Object is not an instance of VehicleReg.");
        }
    }

    public static void main(String[] args) {
        VehicleReg v1 = new VehicleReg("Shrinath", "Car", 1234);
        VehicleReg v2 = new VehicleReg("Ritthi", "Bike", 2345);
        v1.display();
        v2.display();
        v1.UpdateRegfee(123456);
        v1.display();

    }


}
