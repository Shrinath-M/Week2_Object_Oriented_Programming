import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{Name='" + name + "', Position='" + position + "'}";
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
    }

    public void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayEmployees();
        }
    }
}

public class CompanyDemo {
    public static void main(String[] args) {

        Company company = new Company("Tech Innovators");
        Department devDept = new Department("Development");
        Department hrDept = new Department("Human Resources");
        devDept.addEmployee("Alice", "Software Engineer");
        devDept.addEmployee("Bob", "DevOps Engineer");
        hrDept.addEmployee("Charlie", "HR Manager");
        company.addDepartment(devDept);
        company.addDepartment(hrDept);
        company.displayCompanyStructure();
    }
}
