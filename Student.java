class Student{
	static String universityName = "GLA University";
	private static int totalStudent = 0;
	private String name;
	private final int rollNumber;
	private String grade;

	//constructor
	Student(String name, int rollNumber, String grade){
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		totalStudent++;
	}

	//method to display total Student
	public static int displayTotalStudent(){
		return totalStudent;
	}

	//method to display details
	public void display(){
		if(this instanceof Student){
			System.out.println("Object is an instance of the Student class");
			System.out.println("===Student Details===");
			System.out.println("Student Name: " + name);
			System.out.println("Student Roll Number: " + rollNumber);
			System.out.println("Student Grade: " + grade);
		}
		else{
			System.out.println("Object is not an instance of the Student Class");
		}
	}

	public static void main(String args[]){
		Student s1 = new Student("Muskan", 2115000641, "A");
		Student s2 = new Student("Priya", 2115000767, "A");
		Student s3 = new Student("Rashmi", 2115000832, "A");

		//Display University name
		System.out.println("University Name: " + universityName);

		s1.display();
		System.out.println();

		s1.display();
                System.out.println();

		s1.display();
                System.out.println();

		//display total student
		System.out.println("Total Student: " + totalStudent);
	}
}
