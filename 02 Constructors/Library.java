public class Library {
    private String title;
    private String author;
    private int price;
    private boolean isAvailable;

    public Library(String title, String author, int price){
        this.author = author;
        this.isAvailable = true;
        this.price = price;
        this.title = title;
    }

    public String borrowBook(){
        if (isAvailable){
            isAvailable = false;
            return "You have successfully borrowed the book \""+title+"\".";
        }else{
            return "Sorry, \""+title+"\" isn't available now";
        }
    }

    public String returnBook(){
        isAvailable = true;
        return "You have returned the book \""+title+"\" and is available for borrowing.";
    }



    public static void main(String[] args){
        Library book = new Library("Alchemist", "Paulo Cohelo", 120);
        System.out.println(book.borrowBook());
        System.out.println(book.borrowBook());
        System.out.println(book.returnBook());
        System.out.println(book.borrowBook());
    }
}
