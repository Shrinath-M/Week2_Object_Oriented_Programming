public class MovieTicket {
    private String movieName;
    private int seatNumber;
    private int price;
    private boolean isBooked;

    public MovieTicket(String movieName, int seatNumber, int price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    public void bookTicket(){
        if(!isBooked){
            isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + " at seat " + seatNumber);
        }else{
            System.out.println("Seat " + seatNumber + " is already booked!");
        }
    }
    public void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

}
