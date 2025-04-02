public class University {
    static String universityName = "Global University";
    static int totalStudents = 0;

    private final int rollNumber;

    private String name;
    private String grade;

    public University(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);
    }

    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof University) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Operation not allowed: Object is not an instance of Student.");
        }
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
        // Class definition remains the same...
    public static void main(String[] args) {
            // Creating student objects
           University student1 = new University("Alice", 101, "A");
           University student2 = new University("Bob", 102, "B");

            // Display student details
           student1.displayDetails();
           student2.displayDetails();

            // Display total students
           University.displayTotalStudents();

            // Attempt to update grade
           student1.updateGrade(student1, "A+");
           student1.displayDetails();

            // Invalid operation
           student1.updateGrade(new Object(), "B+");

    }

}
