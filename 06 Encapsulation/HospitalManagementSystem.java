import java.util.ArrayList;
import java.util.List;


abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods (Encapsulation)
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String diagnosis);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private List<String> medicalHistory;

    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted; // Calculate based on daily rate and days admitted
    }

    @Override
    public void addRecord(String diagnosis) {
        medicalHistory.add(diagnosis);
    }

    @Override
    public List<String> viewRecords() {
        return medicalHistory;
    }
}

// Subclass OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee; // Bill is just the consultation fee for outpatients
    }

    @Override
    public void addRecord(String diagnosis) {
        medicalHistory.add(diagnosis);
    }

    @Override
    public List<String> viewRecords() {
        return medicalHistory;
    }
}

// Main class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create a list of patients
        List<Patient> patients = new ArrayList<>();

        // Add patient instances
        InPatient inPatient = new InPatient("IP001", "Alice", 30, 1500.0, 5);
        inPatient.addRecord("Flu");
        inPatient.addRecord("High Fever");

        OutPatient outPatient = new OutPatient("OP002", "Bob", 25, 500.0);
        outPatient.addRecord("Migraine");

        patients.add(inPatient);
        patients.add(outPatient);

        // Process patients and display details dynamically (Polymorphism)
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill Amount: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.println("Medical Records: " + record.viewRecords());
            }
            System.out.println();
        }
    }
}

