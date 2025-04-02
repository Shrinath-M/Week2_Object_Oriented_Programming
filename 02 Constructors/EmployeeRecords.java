public class EmployeeRecords {
    public int EmpId;
    protected String Dept;
    private int sal;

    public EmployeeRecords(int EmpId, String Dept, int sal){
        this.EmpId = EmpId;
        this.Dept = Dept;
        this.sal = sal;
    }

    public double getSalary() {
        return this.sal;
    }

    public void setSalary(int sal) {
        if (sal > 0) {  // Ensure salary is valid
            this.sal = sal;
        } else {
            System.out.println("Salary must be positive.");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + EmpId);
        System.out.println("Department: " + Dept);
        System.out.println("Salary: " + getSalary());
    }
}
