import java.util.ArrayList;
import java.util.List;

// Interface for Medical Records
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

// Abstract class for Patient
abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private List<String> medicalHistory;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }

    // Abstract method for calculating bill
    public abstract double calculateBill();

    // Getters
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // Encapsulation for medical history
    public void addMedicalRecord(String record) {
        medicalHistory.add(record);
    }

    public List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory); // Returning a copy for security
    }

    // Display patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Medical History: " + medicalHistory);
    }
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        addMedicalRecord(record);
    }

    @Override
    public List<String> viewRecords() {
        return getMedicalHistory();
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addMedicalRecord(record);
    }

    @Override
    public List<String> viewRecords() {
        return getMedicalHistory();
    }
}

// Main class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        
        InPatient inPatient = new InPatient(101, "Neeta Ambani", 45, 5, 2000);
        OutPatient outPatient = new OutPatient(102, "Mukesh Ambani", 45, 500);
        
        inPatient.addRecord("Appendicitis Surgery");
        outPatient.addRecord("Routine Checkup");
        
        patients.add(inPatient);
        patients.add(outPatient);
        
        // Display details using polymorphism
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: $" + patient.calculateBill());
            System.out.println("-------------------------------------------");
        }
    }
}
