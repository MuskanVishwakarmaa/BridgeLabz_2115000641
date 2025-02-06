import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + name + " - Enrolled Students: " + students);
    }

    public String toString() {
        return name;
    }
}

// Student class
class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void viewCourses() {
        System.out.println(name + " is enrolled in: " + courses);
    }

    public String toString() {
        return name;
    }
}

// School class
class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School: " + name + " - Students: " + students);
    }
}

// Main class
public class SchoolManagement {
    public static void main(String[] args) {
        School school = new School("Sacred Heart");

        Student student1 = new Student("Aditya");
        Student student2 = new Student("Yash");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        student1.enroll(math);
        student1.enroll(science);
        student2.enroll(math);

        school.addStudent(student1);
        school.addStudent(student2);

        student1.viewCourses();
        student2.viewCourses();
        
        math.showEnrolledStudents();
        science.showEnrolledStudents();

        school.showStudents();
    }
}
