class Book{
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void displayBookDetails(){
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book{
    public EBook(String ISBN, String title, String author){
        super(ISBN, title, author);
    }

    public void displayEBookDetails(){
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}

public class LibraryManagementSystem{
    public static void main(String[] args){
        Book book1 = new Book("123456789", "Java Programming", "Abhishek");
        book1.displayBookDetails();

        book1.setAuthor("William Shakespeare");
        System.out.println("\nAfter updating author:");
        book1.displayBookDetails();

        EBook eBook1 = new EBook("987654321", "Advanced Java", "Dr. Author");
        eBook1.displayEBookDetails();
    }
}
