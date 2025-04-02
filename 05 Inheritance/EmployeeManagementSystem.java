class Manager extends Employee {
    private int teamSize;
    public Manager(String name, int id, int sal, int teamSize){
        super(name, id, sal);
        this.teamSize = teamSize;
    }

    public void displayManager(){
        super.display();
        System.out.println("Team size: "+teamSize);
    }
}

class Developer extends Employee{
    private String ProLang;
    public Developer(String name, int id, int sal, String ProLang){
        super(name, id, sal);
        this.ProLang = ProLang;
    }
    public void displayDeveloper(){
        super.display();
        System.out.println("Programming language: "+ProLang);
    }
}

class Intern extends Employee{
    private int duration;
    public Intern(String name, int id, int sal, int duration){
        super(name, id, sal);
        this.duration = duration;
    }
    public void displayIntern(){
        super.display();
        System.out.println("Duration: "+duration);
    }
}
public class EmployeeManagementSystem{
    public static void main(String[] args) {
        Manager m = new Manager("Shrinath", 123, 125000, 2);
        Developer d = new Developer("Ritthi", 234, 150000, "Python");
        Intern i = new Intern("Sanjiv", 345, 150000, 3);
        m.displayManager();
        d.displayDeveloper();
        i.displayIntern();

    }
}
