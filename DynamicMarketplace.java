import java.util.*;

// Enum categories for different products
enum BookCategory { FICTION, NONFICTION, EDUCATIONAL }
enum ClothingCategory { MENS, WOMENS, KIDS }
enum GadgetCategory { MOBILE, LAPTOP, ACCESSORY }

// Generic Product class
class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - " + price;
    }
}

// Generic method to apply discount
class MarketplaceUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }
}

public class DynamicMarketplace {
    public static void main(String[] args) {
        // Creating products
        Product<BookCategory> book = new Product<>("Java Programming", 500.0, BookCategory.EDUCATIONAL);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 250.0, ClothingCategory.MENS);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 20000.0, GadgetCategory.MOBILE);

        // Displaying products before discount
        System.out.println("Product Catalog:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);

        // Applying Discounts
        MarketplaceUtil.applyDiscount(book, 10);
        MarketplaceUtil.applyDiscount(shirt, 5);
        MarketplaceUtil.applyDiscount(phone, 15);

        // Displaying products after discount
        System.out.println("\nAfter Discounts:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}
