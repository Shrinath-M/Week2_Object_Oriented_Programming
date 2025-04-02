public class HospitalManagement {
    private static String HospName = "Apollo";
    private String name;
    private int age;
    private String ailment;
    private static int TotalPatients = 0;
    private final int patientId = 123;

    public HospitalManagement(String name, int age, String ailment){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        TotalPatients++;
    }

    public static void PatientCount(){
        System.out.println("Total number of patients: "+TotalPatients);
    }

    public void display(){
        if (this instanceof HospitalManagement){
            System.out.println("Hospital Name: "+HospName);
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Patient ID: "+patientId);
            System.out.println("Ailment: "+ailment);
        }
    }

    public static void main(String[] args) {
        HospitalManagement hm1 = new HospitalManagement("ABC", 12, "Headache");
        HospitalManagement hm2 = new HospitalManagement("DEF", 34, "Stomach pain");
        hm1.display();
        hm2.display();
        PatientCount();
    }
}
