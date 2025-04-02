public class Employee {
    private String CompName = "Capgemini";
    private String EmpName;
    private final int EmpId = 123;
    private String designation;
    private static int count = 0;

    public Employee(String EmpName, String designation){
        this.EmpName = EmpName;
        this.designation = designation;
        count++;
    }
    public static void count_Emp(){
        System.out.println("Total number of employees: "+count);
    }

    public void display(){
        if (this instanceof Employee){
            System.out.println("Company name: "+CompName);
            System.out.println("Employee name: "+EmpName);
            System.out.println("Employee ID: "+EmpId);
            System.out.println("Designation: "+designation);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Shrinath", "Analyst");
        Employee emp2 = new Employee("Ritthi", "HR");
        emp1.display();
        emp2.display();
        count_Emp();
    }
}
