public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking(){
        this.guestName = "Shrinath";
        this.roomType = "Single";
        this.nights = 2;
    }

    public HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.nights = nights;
        this.roomType = roomType;
    }

    public HotelBooking(HotelBooking anotherBooking){
        this.guestName = anotherBooking.guestName;
        this.nights = anotherBooking.nights;
        this.roomType = anotherBooking.roomType;
    }

    public void display(){
        System.out.println("Guest name: "+guestName);
        System.out.println("Number of nights guest stay: "+nights);
        System.out.println("Room type: "+roomType);
    }

    public static void main(String[] args){
        HotelBooking hb_def = new HotelBooking();
        System.out.println("Default ");
        hb_def.display();
        HotelBooking hb_par = new HotelBooking("Ruckmani", "Single", 2);
        System.out.println("Parameterized ");
        hb_par.display();
        HotelBooking hb_copy = new HotelBooking(hb_def);
        System.out.println("Copy Constructor ");
        hb_copy.display();
    }
}
