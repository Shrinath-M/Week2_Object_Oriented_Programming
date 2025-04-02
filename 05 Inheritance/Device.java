public class Device {
    private int deviceId;
    private String status;
    public Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }
    public void display(){
        System.out.println("The device id is "+deviceId+" and it's status is "+status+".");
    }
}
