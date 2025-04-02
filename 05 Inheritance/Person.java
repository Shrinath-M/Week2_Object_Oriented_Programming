public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void display(){
        System.out.println("Name of the student is "+name+" and age is "+age+".");
    }
}
