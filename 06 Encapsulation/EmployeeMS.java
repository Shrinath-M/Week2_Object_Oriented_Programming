abstract class FullTimeEmployee extends Employee implements Department {
    private String DeptName;

    public FullTimeEmployee(int employeeId, String name, int sal) {
        super(employeeId, name, sal);
    }
    public double calculateSalary() {
        return getSal(); // Fixed salary for full-time employees
    }
    public void assignDepartment(String departmentName) {
        this.DeptName = departmentName;
    }
    public String getDepartmentDetails() {
        return "Department: " + DeptName;
    }
}

abstract class PartTimeEmployee extends Employee implements Department {
    private String departmentName;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, int sal, int hoursWorked, double hourlyRate) {
        super(employeeId, name, sal);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public double calculateSalary() {
        return hoursWorked * hourlyRate; // Salary based on hours worked
    }
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}
import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a list of employees
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "Alice", 80000);
        fullTimeEmployee.assignDepartment("Engineering");

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Bob", 20000, 20, 500);
        partTimeEmployee.assignDepartment("Support");

        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        // Display details and calculate salary using polymorphism
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Calculated Salary: " + employee.calculateSalary());
            if (employee instanceof Department) {
                Department dept = (Department) employee;
                System.out.println(dept.getDepartmentDetails());
            }
            System.out.println("---");
        }
    }
}
