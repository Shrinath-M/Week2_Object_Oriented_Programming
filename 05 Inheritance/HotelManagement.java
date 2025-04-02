interface worker{
    void performDuties();
}
class Chef extends PersonHotel implements worker{
    private String speciality;
    public Chef(String name, String id, String speciality){
        super(name, id);
        this.speciality = speciality;
    }
    public void performDuties(){
        System.out.println("Preparing meals. Specialized in "+speciality);
    }
    public void display(){
        super.display();
        System.out.println("Role : Chef ; Speciality : "+speciality);
    }
}
class Waiter extends PersonHotel implements worker{
    private int tableAssn;
    public Waiter(String name, String id, int tableAssn){
        super(name, id);
        this.tableAssn = tableAssn;
    }
    public void performDuties(){
        System.out.println("Serving customers. Managing table number "+tableAssn);
    }
    public void display(){
        super.display();
        System.out.println("Role : Waiter ; Table assigned : "+tableAssn);
    }
}
public class HotelManagement {
    public static void main(String[] args) {
        Chef c = new Chef("Shrinath", "VBC", "Italian cuisine");
        Waiter w = new Waiter("Shrinath", "WTR", 8);
        c.display();
        c.performDuties();
        System.out.println("-----");
        w.display();
        w.performDuties();
    }
}
