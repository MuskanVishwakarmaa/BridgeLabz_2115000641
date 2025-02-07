//Superclass
class Person{
    String name;
    int age;

    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass
class Teacher extends Person {
    String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass
class Student extends Person {
    int grade;

    // Constructor
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass
class Staff extends Person {
    String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

//Main Class
public class SchoolSystem {
    public static void main(String[] args) {

        // Creating different person objects
        Teacher teacher = new Teacher("Muskan", 35, "Mathematics");
        Student student = new Student("Rashmi", 16, 10);
        Staff staff = new Staff("Priya", 40, "Administration");

        // Displaying details
        teacher.displayInfo();
        teacher.displayRole();
        System.out.println();

        student.displayInfo();
        student.displayRole();
        System.out.println();

        staff.displayInfo();
        staff.displayRole();
    }
}
