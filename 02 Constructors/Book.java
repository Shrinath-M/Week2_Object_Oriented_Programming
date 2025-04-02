import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Book {
    private String title;
    private String author;
    private float price;

    public Book(String title, String author, float price){
        this.price = price;
        this.title = title;
        this.author = author;
    }

    public Book(){
        this.author = "Unknown Author";
        this.title = "Unknown Title";
        this.price = 100;
    }

    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

    public static void main(String[] args){
        Book defaultCons = new Book();
        Book parameterizedCons = new Book("Alchemist", "Paulo Cohelo", 100);
        System.out.println("Default constructor: ");
        defaultCons.display();
        System.out.println("Parameterized constructor: ");
        parameterizedCons.display();
    }
}
