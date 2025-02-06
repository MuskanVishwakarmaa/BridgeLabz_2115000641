import java.util.List;
import java.util.ArrayList;

//Employee class
class Employee{
	private String empName;
	private final int empID;
	private String empPosition;
	
	//constructor
	Employee(String empName, String empPosition, int empID){
		this.empName = empName;
		this.empID = empID;
		this.empPosition = empPosition;
	}
	
	//overriding toString() method to display employee details
	public String toString(){
		return "\nEmployee Name: " + empName + "\nEmployee ID: " + empID + "\nEmployee Position: " + empPosition;
	}
}

//Department class
class Department{
	private String depName;
	private List<Employee> employees;
	
	//Constructor for department class
	Department(String depName){
		this.depName = depName;
		this.employees = new ArrayList<>();
	}
	
	//method to add Employee to the department
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	
	// Overriding toString() method to display department details
    public String toString() {
        String result = "Department Name: " + depName + "\nEmployees:";
        for (Employee emp : employees) {
            result += emp + "\n";
        }
        return result;
    }

}

//Company class
class Company{
	private String comName;
	private List<Department> departments;
	
	//constructor for company class
	Company(String comName){
		this.comName = comName;
		this.departments = new ArrayList<>();
	}
	
	//method to add department to the company
	public void addDepartment(Department department){
		departments.add(department);
	}
	
	// Overriding toString() method to display company details
    public String toString() {
        String result = "Company Name: " + comName + "\nDepartments:\n";
        for (Department dept : departments) {
            result += dept + "\n";
        }
        return result;
    }
}

//method to demonstrate composition
public class CompanyAndDepartment{
	public static void main(String args[]){
		Company company1 = new Company("TCS");
        Company company2 = new Company("CapGemini");

        // Creating department objects
        Department hrDept = new Department("HR");
        Department engDept = new Department("Engineering");
		Department techDept = new Department("Technical");
        Department sdDept = new Department("SDE");

        // Adding departments to the companies
        company1.addDepartment(hrDept);
        company2.addDepartment(engDept);
		company1.addDepartment(techDept);
        company2.addDepartment(sdDept);

        // Creating employee objects
        Employee emp1 = new Employee("Muskan", "HR", 123);
        Employee emp2 = new Employee("Rashmi", "HR", 456);
		Employee emp3 = new Employee("Priya", "Engineering", 345);
		Employee emp4 = new Employee("Vaishnavi", "Engineering", 654);
		Employee emp5 = new Employee("Abhishek", "Technical", 385);
		Employee emp6 = new Employee("Aditya", "Technical", 953);
		Employee emp7 = new Employee("Aman", "SDE", 970);
		Employee emp8 = new Employee("Anand", "SDE", 346);
		

        // Adding employees to departments
        hrDept.addEmployee(emp1);
		hrDept.addEmployee(emp2);
        engDept.addEmployee(emp3);
		engDept.addEmployee(emp4);
		techDept.addEmployee(emp5);
		techDept.addEmployee(emp6);
		sdDept.addEmployee(emp7);
		sdDept.addEmployee(emp8);

        // Displaying company details
        System.out.println(company1);
        System.out.println(company2);
	}
}