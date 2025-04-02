public class Employee {
    private String name;
    private int id;
    private int sal;

    public Employee(String name, int id, int sal){
        this.name = name;
        this.id = id;
        this.sal = sal;
    }
    public void display(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary: "+sal);
    }
}
