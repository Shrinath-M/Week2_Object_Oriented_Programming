class author extends Book{
    private String name;
    private int year;
    public author(String title, int pubYear, String name, int year){
        super(title, pubYear);
        this.name = name;
        this.year = year;
    }

    public void display(){
        super.display();
        System.out.println("Author name is "+name+" and is born in "+year+".");
    }
}
public class Library {
    public static void main(String[] args) {
        author a1 = new author("Alchemist", 1999, "Paulo Coelho", 1967);

        a1.display();
    }
}
