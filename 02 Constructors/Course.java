public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String InstituteName;
    public Course(String courseName, int duration, double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void display(){
        System.out.println("Name of the course: "+courseName);
        System.out.println("Duration of the course in months: "+duration);
        System.out.println("Fee of the course: "+fee);
    }
    public static void InsName(){
        String InstituteName = "SRM";
        System.out.println("Institute name: "+InstituteName);
    }

    public static void main(String[] args) {
        Course course = new Course("Data Analytics", 3, 12000);
        course.display();
        InsName();
    }
}
