import java.util.Scanner;
public class EmployeeDetails{
	//Fields (Attribute)
	private String name;
	private String id;
	private double salary;

	//Constructor
	public EmployeeDetails(String name, String id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	//Method to display Details
	public void display(){
		System.out.println("Employee Details:");
		System.out.println("Emp.Name " + name);
		System.out.println("Emp.Id " + id);
		System.out.println("Emp.Salary " + salary);
	}

	//Main class
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Emp_Id: ");
		String id = sc.next();

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();

		//Creating object
		EmployeeDetails emp = new EmployeeDetails(name, id, salary);
		emp.display();
		sc.close();
	}
}

