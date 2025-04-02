abstract class Employee{
    private int EmpId;
    private String name;
    private int sal;
    public Employee(int EmpId, String name, int sal){
        this.EmpId = EmpId;
        this.name = name;
        this.sal = sal;
    }

    public int getEmpId(){
        return EmpId;
    }
    public String getName(){
        return name;
    }
    public int getSal(){
        return sal;
    }
    public void setSal(int sal){
        this.sal = sal;
    }
    public abstract int CalculateSal();
    public void display(){
        System.out.println("Employee ID: "+EmpId);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+sal);
    }
}
interface Department{
    void assignDept(String DeptName);
    String getDeptDetails();
}
