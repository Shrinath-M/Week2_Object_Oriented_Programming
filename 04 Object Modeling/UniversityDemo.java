import java.util.ArrayList;
import java.util.List;







public class UniversityDemo {
    public static void main(String[] args) {

        University university = new University("Tech University");

        Faculty faculty1 = new Faculty("Alice", "Computer Science");
        Faculty faculty2 = new Faculty("Bob", "Mathematics");

        Department csDept = new Department("Computer Science");
        Department mathDept = new Department("Mathematics");

        csDept.addFaculty(faculty1);
        mathDept.addFaculty(faculty2);

        university.addDepartment(csDept);
        university.addDepartment(mathDept);
        university.displayUniversityStructure();
    }
}
