import java.util.ArrayList;
class Book{
    private String title;
    private String author;

    //Constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    //Getter
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +"title='" + title + '\'' + ", author='" +author + '\'' + '}';
    }
}

class Library{
    private ArrayList<Book> books;

    //Constructor
    public Library(){
        this.books = new ArrayList<>();
    }

    //Method to add a book to the library
    public void addBook(Book book){
        books.add(book);
    }

    //Method to display all books in the library
    public void displayBooks(){
        System.out.println("Books in the library:");
        for (Book book : books){
            System.out.println(book);
        }
    }
}

class LibraryAndBooks{
    public static void main(String[] args){
		
        //Create some Book objects
        Book book1 = new Book("How to hack your brain", "Author1");
        Book book2 = new Book("Marvel's Spiderman", "Stan Lee");
        Book book3 = new Book("How to fly higher", "Unknown");

        //Create Library objects
        Library library1 = new Library();
        Library library2 = new Library();

        //Add books to library1
        library1.addBook(book1);
        library1.addBook(book2);

        //Add book3 to library2
        library2.addBook(book3);

        //displaying books in both libraries
        library1.displayBooks();
		System.out.println();
        library2.displayBooks();
		System.out.println();

        //Showing that books can exist independently
        System.out.println("Independent Book: " + book1);
        System.out.println("Independent Book: " + book3);
    }
}