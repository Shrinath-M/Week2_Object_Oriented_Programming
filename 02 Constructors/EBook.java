public class EBook extends BookLib {
    private int price;

    public EBook(int ISBN, String title, String author, int price){
        super(ISBN, title, author);
        this.price = price;
    }
    public void display(){
        System.out.println("ISBN: "+ISBN);
        System.out.println("Title: "+title);
        System.out.println("Author: "+getAuthor());
        System.out.println("Price: "+price);
    }

    public static void main(String[] args) {
        EBook eb = new EBook(123, "Alchemist", "Paulo Cohelo", 178);
        eb.display();
        eb.setAuthor("Paulo");
        System.out.println("Updated author name: "+eb.getAuthor());
    }

}
