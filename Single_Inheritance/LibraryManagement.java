//Book as a Parent class
class Book{
	private String title;
	private int publicationYear;
	
	//Constructor
	public Book(String title, int publicationYear){
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
	//getter method
	public String getTitle(){
		return title;
	}
	public int getPublicationYear(){
		return publicationYear;
	}
}

//Author class as a child class
class Author extends Book{
	private String name;
	private String bio;
	
	//constructor
	public Author(String title, int publicationYear, String name, String bio){
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	//getter method
	public String getName(){
		return name;
	}
	public String getBio(){
		return bio;
	}
	
	public void displayInfo(){
		System.out.println("Book Details");
		System.out.println("\nTitle: " + getTitle());
		System.out.println("Publication year: " + getPublicationYear());
		System.out.println("Author: " + getName());
		System.out.println("Bio: " + getBio());
	}
}

//main method 
public class LibraryManagement{
	public static void main(String args[]){
		Author author1 = new Author("The Magic of Coding", 2018, "John Doe", "A passionate coder and tech enthusiast.");
		author1.displayInfo();
	}
}