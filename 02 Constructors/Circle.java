import java.util.concurrent.Callable;

public class Circle {
    private int rad;

    public Circle(){
    this(12);
    }

    public Circle(int rad){
        this.rad = rad;
    }

    public void display(){
        System.out.println("Radius: "+rad);
    }

    public static void main(String[] args){
        Circle def = new Circle();
        Circle user_def = new Circle(100);
        System.out.println("Default: ");
        def.display();
        System.out.println("User defined: ");
        user_def.display();
    }
}
