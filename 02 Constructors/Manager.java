public class Manager extends EmployeeRecords {
    private String teamName;

    public Manager(int EmpId, String Dept, int sal, String teamName){
        super(EmpId, Dept, sal);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + EmpId);
        System.out.println("Department: " + Dept);
        System.out.println("Team name: "+teamName);
    }

    public static void main(String[] args) {
        EmployeeRecords emp = new EmployeeRecords(1234, "IT", 150000);
        emp.displayEmployeeDetails();
        emp.setSalary(155000);
        System.out.println("Updated salary: "+emp.getSalary());
        Manager m = new Manager(123, "ECE", 140000, "Data Anayst");
        m.displayManagerDetails();

    }
}

