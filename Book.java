class Book{
	static String libraryName = "CEA Library";
	private String title;
	private String author;
	private final long isbn;

	//Constructor
	Book(String title, String author, long isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public static void displayLibraryName(){
		System.out.println("Library Name: " + libraryName);
	}

	public void display(){
		if(this instanceof Book){
			System.out.println("Object is an instance of the Book class");
			System.out.println("Title of the book: " + title);
			System.out.println("Author of the book: " + author);
			System.out.println("ISBN: " + isbn);
		}
		else{
			System.out.println("Object is not an instance of the Book class");
		}
	}

	public static void main(String args[]){
		Book b1 = new Book("Pride and Prejudice", "Jane Austen", 1503290563);
		Book b2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 0743273565);

		displayLibraryName();
		b1.display();
		System.out.println();
		b2.display();
	}
}
