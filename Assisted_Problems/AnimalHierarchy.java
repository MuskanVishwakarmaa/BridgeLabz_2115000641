//Animal class as a parent class
class Animal{
	private String name;
	private int age;
	
	//constructor
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//getter method
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	//method
	void makeSound(){
		System.out.println("Animals make different sound");
	}
}

//Dog, cat and bird class as a child class---it shows Hierarchical inheritance
class Dog extends Animal{
	public Dog(String name, int age){
		super(name, age);
	}
	
	@Override
	void makeSound(){
		System.out.println(getName() + " is barking, age is " + getAge()); 
	}
}
class Cat extends Animal{
	public Cat(String name, int age){
		super(name, age);
	}
	
	@Override
	void makeSound(){
		System.out.println(getName() + " is Meowing, age is " + getAge()); 
	}
}
class Bird extends Animal{
	public Bird(String name, int age){
		super(name, age);
	}
	
	@Override
	void makeSound(){
		System.out.println(getName() + " is Chirping, age is " + getAge()); 
	}
}

//main method
public class AnimalHierarchy{
	public static void main(String args[]){
		Animal dog = new Dog("Tommy", 10);
		Animal cat = new Cat("Bells", 11);
		Animal bird = new Bird("Canary", 10);
		
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
	}
}