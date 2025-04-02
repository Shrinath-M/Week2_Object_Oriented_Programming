import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayUniversityStructure() {
        System.out.println("University: " + name);
        for (Department dept : departments) {
            dept.displayFaculty();
        }
    }
}