import java.util.ArrayList;
import java.util.List;

class Department2 {
    private String name;
    private List<Faculty> facultyMembers;

    public Department2(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void displayFaculty() {
        System.out.println("Department: " + name);
        for (Faculty faculty : facultyMembers) {
            System.out.println(faculty);
        }
    }
}