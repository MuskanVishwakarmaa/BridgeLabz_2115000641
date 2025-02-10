import java.util.ArrayList;
import java.util.List;

// Interface for reservable items
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Abstract class LibraryItem
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean isAvailable;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Abstract method to be implemented by subclasses
    public abstract int getLoanDuration();

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    // Encapsulation: Getters
    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }
    
    // Setter to update availability
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}

// Book class
class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be loaned for 14 days
    }

    @Override
    public void reserveItem() {
        if (checkAvailability()) {
            setAvailable(false);
            System.out.println(getTitle() + " has been reserved.");
        } else {
            System.out.println(getTitle() + " is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

// Magazine class
class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // DVDs can be loaned for 5 days
    }

    @Override
    public void reserveItem() {
        if (checkAvailability()) {
            setAvailable(false);
            System.out.println(getTitle() + " DVD has been reserved.");
        } else {
            System.out.println(getTitle() + " DVD is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

// Main class to test the system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        
        // Adding items to the library
        Book book1 = new Book(101, "Java Programming", "James Gosling");
        Magazine mag1 = new Magazine(102, "Tech Today", "Editorial Team");
        DVD dvd1 = new DVD(103, "Inception", "Christopher Nolan");
        
        items.add(book1);
        items.add(mag1);
        items.add(dvd1);
        
        // Display item details using polymorphism
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days\n");
        }

        // Reserving items
        book1.reserveItem();
        dvd1.reserveItem();
        
        // Checking availability
        System.out.println("\nAvailability Check:");
        System.out.println("Is " + book1.getTitle() + " available? " + book1.checkAvailability());
        System.out.println("Is " + dvd1.getTitle() + " available? " + dvd1.checkAvailability());
    }
}
