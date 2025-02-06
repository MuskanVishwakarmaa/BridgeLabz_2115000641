import java.util.ArrayList;
import java.util.List;

// Doctor class (Association: Can have multiple patients)
class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Dr. " + name + " is consulting " + patient.getName());
    }

    public String getName() {
        return name;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

// Patient class (Association: Can consult multiple doctors)
class Patient {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public String getName() {
        return name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}

// Hospital class (Manages doctors and patients)
class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(" - Dr. " + doctor.getName() + " (Patients: " + doctor.getPatients().size() + ")");
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName() + " (Doctors: " + patient.getDoctors().size() + ")");
        }
    }
}

// Main class
public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        // Creating doctors
        Doctor drAditya = new Doctor("Aditya");
        Doctor drSingh = new Doctor("Singh");

        // Creating patients
        Patient patient1 = new Patient("Yash");
        Patient patient2 = new Patient("Laksh");

        // Adding doctors and patients to the hospital
        hospital.addDoctor(drAditya);
        hospital.addDoctor(drSingh);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Consultations (Association: Many-to-Many relationship)
        drAditya.consult(patient1);
        drSingh.consult(patient1);
        drAditya.consult(patient2);

        // Display hospital details
        hospital.showDetails();
    }
}
