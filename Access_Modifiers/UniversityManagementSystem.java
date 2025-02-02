class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

	public double getCGPA(){
        return CGPA;
	}

    public void setCGPA(double CGPA){
        this.CGPA = CGPA;
    }

    public void displayStudentDetails(){
        System.out.println("Roll Number: " +rollNumber);
        System.out.println("Name: " +name);
        System.out.println("CGPA: " +CGPA);
    }
}

class PostgraduateStudent extends Student{
    public PostgraduateStudent(int rollNumber, String name, double CGPA){
        super(rollNumber, name, CGPA);
    }

    public void displayPostgraduateDetails(){
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

public class UniversityManagementSystem{
    public static void main(String[] args){

        Student student1 = new Student(101, "Muskan", 8.5);
        student1.displayStudentDetails();

        student1.setCGPA(9.0);
        System.out.println("\nAfter updating CGPA:");
        student1.displayStudentDetails();

        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Rashmi", 9.2);
        pgStudent.displayPostgraduateDetails();
    }
}
