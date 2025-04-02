public class BookLib {
    public int ISBN;
    protected String title;
    private String author;

    public BookLib(int ISBN, String title, String author){
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
}
