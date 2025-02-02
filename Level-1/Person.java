class Person{
	//Attributes
	private String name;
	private int age;

	//Parameterized Constructor
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	//Copy constructor
	Person(Person other){
		this.name = other.name;
		this.age = other.age;
	}

	//method to display details
	public void display(){
		System.out.println("Name: " + name + "\nAge: " + age);
	}

	//main method
	public static void main(String args[]){
		Person p1 = new Person("Muskan", 21); //original object
		Person p2 = new Person(p1); //cloned object using copy constructor

		p1.display();
		p2.display();
	}
}
