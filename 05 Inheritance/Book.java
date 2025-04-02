public class Book {
    private String title;
    private int pubYear;
    public Book(String title, int pubYear){
        this.title = title;
        this.pubYear = pubYear;
    }
    public void display(){
        System.out.println("The book "+title+" has been published in the year "+pubYear+".");
    }
}
