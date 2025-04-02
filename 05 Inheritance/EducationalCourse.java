import jdk.jfr.Recording;

class OnlineCourse extends Course{
    private String platform;
    private String Recording;

    public OnlineCourse(String courseName, int duration, String platform, String Recording){
        super(courseName, duration);
        this.Recording = Recording;
        this.platform = platform;
    }

    public void display(){
        super.display();
        System.out.println("The course is conducted in "+platform+" and "+Recording);
    }
}

class PaidOnlineCourse extends Course{
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, double fee, double discount){
        super(courseName, duration);
        this.fee = fee;
        this.discount = discount;
    }
    public void display(){
        super.display();
        System.out.println("The course fee is "+fee+" and discount is "+discount);
    }
}
public class EducationalCourse {
    public static void main(String[] args) {
        Course course = new Course("Data analytics", 2);
        OnlineCourse oc = new OnlineCourse("Block chain", 2, "Gmeeet", "Yes");
        PaidOnlineCourse poc = new PaidOnlineCourse("Finlatics", 3, 3000, 10);
        course.display();
        oc.display();
        poc.display();
    }
}
