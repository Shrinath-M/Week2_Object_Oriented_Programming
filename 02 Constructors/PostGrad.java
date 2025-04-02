public class PostGrad extends Student{
    private String Specialization;

    public PostGrad(int rollNumber, String name, float cgpa, String Specialization){
        super(rollNumber, name, cgpa);
        this.Specialization = Specialization;
    }
    public void display(){
        System.out.println("Name of the student: "+name);
        System.out.println("Roll number of "+name+" is: "+rollNumber);
        System.out.println("CGPA of "+name+" is: "+getCgpa());
        System.out.println("Specialization: " +Specialization);
    }

    public static void main(String[] args) {
        PostGrad pg = new PostGrad(120, "Shrinath", 8.34f, "ECE");
        pg.display();
        pg.setCgpa(9.4f);
        System.out.println("Updated cgpa of "+pg.name+" is: "+pg.getCgpa());
    }
}
