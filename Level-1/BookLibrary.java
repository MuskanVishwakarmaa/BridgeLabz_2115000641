import java.util.Scanner;
class BookLibrary{
	private String title;
	private String author;
	private double price;
	private boolean isAvailable;

	//constructor
	BookLibrary(String title, String author, double price, boolean isAvailable){
		this.title = title;
		this.author = author;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	//method to borrow book
	public boolean borrowBook() {
        	if (isAvailable) {
            		isAvailable = false; // Mark the book as unavailable after borrowing
            		System.out.println("You have successfully borrowed the book: " + title);
            		return true;
        	}
		else {
            		System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
            		return false;
        	}
    	}

	//getter and setter
	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return author;
	}

	public double getPrice(){
		return price;
	}

	public boolean isAvailable(){
		return isAvailable;
	}

	public void setIsAvailable(boolean available){
		isAvailable = available;
	}

	// Method to display book information
    	public void displayBookInfo() {
        	System.out.println("Book Title: " + title);
	        System.out.println("Author: " + author);
        	System.out.println("Price: $" + price);
        	System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    	}

	//main method
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

        	// Prompt user for book details
        	System.out.print("Enter the book title: ");
        	String title = scanner.nextLine();

        	System.out.print("Enter the author: ");
	        String author = scanner.nextLine();

        	System.out.print("Enter the price: ");
        	double price = scanner.nextDouble();

	        System.out.print("Is the book available (true/false): ");
        	boolean isAvailable = scanner.nextBoolean();

	        // Create a Book object with user input
        	BookLibrary book = new BookLibrary(title, author, price, isAvailable);

	        // Display book info
        	book.displayBookInfo();

        	// Try borrowing the book
        	book.borrowBook();

        	// Try borrowing again
        	book.borrowBook();
    	}
}
