public class Book {
    private String title;
    private String author;
    private float price;

    public Book(String title, String author, float price){
        this.author = author;
        this.price = price;
        this.title = title;
    }
    public void display(){
        System.out.println("Author name: "+author);
        System.out.println("Title of the book: "+title);
        System.out.println("Price of the book: "+price);
    }
}
