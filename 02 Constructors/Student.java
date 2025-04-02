public class Student {
    public int rollNumber;
    protected String name;
    private float cgpa;

    public Student(int rollNumber, String name, float cgpa){
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public float getCgpa(){
        return cgpa;
    }
    public void setCgpa(float newCgpa){
        this.cgpa = newCgpa;
    }

}
