class thermostat extends Device {
    private float tempSet;
    public thermostat(int deviceId, String status, float tempSet){
        super(deviceId, status);
        this.tempSet = tempSet;
    }
    public void display(){
        super.display();
        System.out.println("The current temperature setting is "+tempSet);
    }
}

public class SmartHome {
    public static void main(String[] args) {
        thermostat t1 = new thermostat(123, "Working", 24.5f);
        t1.display();
    }
}


