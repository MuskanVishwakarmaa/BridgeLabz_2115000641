import java.util.Scanner;
public class BookDetails{
	//Fields(Attributes)
	private String title;
	private String author;
	private double price;

	//Constructor
	public BookDetails(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}

	//display result
	public void display(){
		System.out.println("Book Details:");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}

	//Main
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book title: ");
		String title = sc.nextLine();

		System.out.println("Enter Author name: ");
		String author = sc.nextLine();

		System.out.println("Enter Book price: Rs.");
		double price = sc.nextDouble();

		//Creating object
		BookDetails book = new BookDetails(title, author, price);
		book.display();
		sc.close();
	}
}
