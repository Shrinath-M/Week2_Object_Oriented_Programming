public class PersonHotel {
    private String name;
    private String id;
    public PersonHotel(String name, String id){
        this.id = id;
        this.name = name;
    }
    public void display(){
        System.out.println("Name: "+name+" and id: "+id);
    }
}
