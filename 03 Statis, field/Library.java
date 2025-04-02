public class Library {
    private final int Isbn = 1234;
    private static String LibName = "Anna Library";
    private String title;
    private String author;

    public Library(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void displayItems(){
        if (this instanceof Library){
            System.out.println("Library Name: "+LibName);
            System.out.println("Title of the book: "+title);
            System.out.println("Author name: "+author);
            System.out.println("Isbn: "+Isbn);
        }
        else{
            System.out.println("Object is not the instance of the Class");
        }
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(1234, "Shrinath");
        Library lib1 = new Library("Alchemist", "Paulo Coelho");
        lib1.displayItems();
    }
}
