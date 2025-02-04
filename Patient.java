class Patient{
	static String hospitalName = "City Hospital";
	private static int totalPatients = 0;
	private String name;
	private int age;
	private String ailment;
	private final int patientID;

	//constructor
	Patient(String name, int age, String ailment, int patientID){
		this.name = name;
		this.age = age;
		this.ailment = ailment;
		this.patientID = patientID;
		totalPatients++;
	}

	//method to display total patient
	public static int getTotalPatients(){
		return totalPatients;
	}

	//method to display details
	public void display(){
		if(this instanceof Patient){
			System.out.println("Object is an instance of the Patient class");
			System.out.println("Patient Name: " + name);
			System.out.println("Patient Age: " + age);
			System.out.println("Patient Ailment: " + ailment);
			System.out.println("Patient ID: " + patientID);
		}
		else{
			System.out.println("Object is not an instance of the Patient Class");
		}
	}

	public static void main(String args[]){
		Patient p1 = new Patient("Alexa", 25, "PCOD", 1234);
		Patient p2 = new Patient("Siri", 24, "PCOS", 9876);

		System.out.println("Hospital Name: " + hospitalName);

		p1.display();
		System.out.println();
		p2.display();

		System.out.println("Total number of Patients: " + totalPatients);
	}
}
