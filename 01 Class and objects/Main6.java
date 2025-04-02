public class Main6 {
    public static void main(String[] args) {
        StudentReport sr1 = new StudentReport("Shrinath", 120, 100);
        StudentReport sr2 = new StudentReport("Sahaj", 651, 70);
        StudentReport sr3 = new StudentReport("Sukesh", 015, 29);
        System.out.println("Details of student 1 ");
        sr1.display();
        System.out.println("Details of student 2 ");
        sr2.display();
        System.out.println("Details of student 3 ");
        sr3.display();
        System.out.println("Grades of each student: ");
        sr1.grade(100);
        sr2.grade(70);
        sr3.grade(29);
    }
}
