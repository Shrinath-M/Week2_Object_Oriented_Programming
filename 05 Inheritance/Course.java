public class Course {
    private String courseName;
    private int duration;
    public Course(String courseName, int duration){
        this.duration = duration;
        this.courseName = courseName;
    }
    public void display(){
        System.out.println("Name of the course: "+courseName);
        System.out.println("Duration of the course: "+duration);
    }
}
