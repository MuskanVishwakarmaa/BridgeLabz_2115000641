import java.util.ArrayList;
import java.util.List;

// Faculty class (Aggregation: Faculty can exist independently)
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

// Department class (Composition: Exists only within a University)
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

// University class (Composition with Department, Aggregation with Faculty)
class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments: " + departments);
        System.out.println("Faculties: " + faculties);
    }

    public void closeUniversity() {
        departments.clear(); // Deleting university removes all departments
        System.out.println(name + " is closed. All departments are removed.");
    }
}

// Main class
public class UniversityManagement {
    public static void main(String[] args) {
        University university = new University("Tech University");

        // Adding departments (Composition: They exist inside the university)
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");

        // Creating faculty members (Aggregation: They can exist independently)
        Faculty prof1 = new Faculty("Prof. Aditya");
        Faculty prof2 = new Faculty("Prof. Yash");

        university.addFaculty(prof1);
        university.addFaculty(prof2);

        university.showDetails();

        // Deleting the university (Removes departments, but faculties still exist)
        university.closeUniversity();
        System.out.println("Faculty members still exist: " + prof1 + ", " + prof2);
    }
}
