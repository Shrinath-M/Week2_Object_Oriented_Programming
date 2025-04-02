public class AreaOfCircle {
    private int rad;

    public AreaOfCircle(int rad){
        this.rad = rad;
    }
    public void Area(){
        float a = 3.14f * (int) Math.pow(rad, 2);
        System.out.println("Area of circle: "+a);
    }
    public void circumference(){
        float c = 2 * 3.14f * rad;
        System.out.println("Circumference of a circle: "+c);
    }
    public void display(){
        Area();
        circumference();
    }
}
