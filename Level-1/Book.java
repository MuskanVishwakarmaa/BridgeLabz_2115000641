class Book{
	//Attributes
	private String title;
	private String author;
	private int price;

	//default constructor
	Book(){
		this.title = "Unknown title";
		this.author = "Unknown author";
		this.price = 0;
	}

	//parameterized constructor
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}

	//method to display book details
	void displayBookDetails(){
		System.out.println("Title of the book is " + title);
		System.out.println("Author of the book is " + author);
		System.out.println("Price of the book is $" + price);
	}

	//main method
	public static void main(String args[]){
		Book book1 = new Book("To kill a Mockingbird", "Harper Lee", 15);
		Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 14);
		Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", 16);

		book1.displayBookDetails();
		book2.displayBookDetails();
		book3.displayBookDetails();

		//object to test the default constructor
		Book defaultBook = new Book();
		defaultBook.displayBookDetails();
	}
}
