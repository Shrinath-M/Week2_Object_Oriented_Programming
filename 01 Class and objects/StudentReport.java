public class StudentReport {
    private String name;
    private int rollNum;
    private int marks;

    public StudentReport(String name, int rollNum, int marks){
        this.marks = marks;
        this.name = name;
        this.rollNum = rollNum;
    }
    public void grade(int marks){
        if (marks < 30){
            System.out.println(name + " : Fail");
        }
        else{
            System.out.println(name + " : Pass");
        }
    }
    public void display(){
        System.out.println("Name of the student: "+name);
        System.out.println("Roll number of the student: "+rollNum);
        System.out.println("Student's marks: "+marks);
    }
}
