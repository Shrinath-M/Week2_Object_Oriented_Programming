import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this);
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + schoolName);
        for (Student student : students) {
            student.viewCourses();
        }
    }
}

public class SchoolDemo {
    public static void main(String[] args) {

        School school = new School("Bright Future Academy");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        math.enrollStudent(student1);
        science.enrollStudent(student1);
        science.enrollStudent(student2);

        school.addStudent(student1);
        school.addStudent(student2);

        school.displayStudents();

        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
    }
}
