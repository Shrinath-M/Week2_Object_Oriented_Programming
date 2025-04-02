class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println(name+" barks!");
    }
}
class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println(name+" meows!");
    }
}
class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println(name+" Tweets!");
    }
}
public class Animalhierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog("Simba", 12);
        Cat cat = new Cat("Good luck", 10);
        Bird bird = new Bird("Touser", 9);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
