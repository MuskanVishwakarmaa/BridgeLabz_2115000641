import java.util.ArrayList;
import java.util.List;

// Course class (Students enroll in courses, and professors teach courses)
class Course {
    private String name;
    private Professor professor;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.getName() + " is assigned to teach " + name);
    }

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " enrolled in " + name);
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + name);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
    }

    // Getter for course name
    public String getName() {
        return name;
    }
}

// Professor class (Teaches multiple courses)
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Student class (Enrolled in multiple courses)
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void showEnrolledCourses() {
        System.out.println("\n" + name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(" - " + course.getName());  // Accessing course name using getter
        }
    }
}

// Main class to demonstrate the relationships
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating professors
        Professor prof1 = new Professor("Dr. Aditya");
        Professor prof2 = new Professor("Dr. Singh");

        // Creating courses
        Course math = new Course("Mathematics");
        Course cs = new Course("Computer Science");

        // Assigning professors to courses
        math.assignProfessor(prof1);
        cs.assignProfessor(prof2);

        // Creating students
        Student student1 = new Student("Yash");
        Student student2 = new Student("Anirudh");

        // Enrolling students in courses
        student1.enrollCourse(math);
        student1.enrollCourse(cs);
        student2.enrollCourse(cs);

        // Displaying course details
        math.showCourseDetails();
        cs.showCourseDetails();

        // Displaying enrolled courses for each student
        student1.showEnrolledCourses();
        student2.showEnrolledCourses();
    }
}
