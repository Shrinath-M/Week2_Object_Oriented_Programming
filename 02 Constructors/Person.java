public class Person {
    private int age;
    private String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Person(Person otherPerson){
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args){
        Person def = new Person(21, "Shrinath");
        def.display();
        Person clone = new Person(def);
        clone.display();
    }
}
