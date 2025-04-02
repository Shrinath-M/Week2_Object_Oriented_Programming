class Teacher extends Person{
    private String subject;
    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    public void display(){
        super.display();
        System.out.println("Subject: "+subject);
    }
}
class Student extends Person{
    private String grade;
    public Student(String name, int age, String grade){
        super(name, age);
        this.grade = grade;
    }
    public void display(){
        super.display();
        System.out.println("Grade of the student: "+grade);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Person p = new Person("Shrinath", 21);
        Teacher t = new Teacher("Ruckmani", 42, "English");
        Student s = new Student("Ritthi", 16, "A");
        p.display();
        System.out.println("------");
        t.display();
        System.out.println("------");
        s.display();
        System.out.println("------");
    }
}
