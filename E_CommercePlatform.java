import java.util.ArrayList;
import java.util.List;

// Interface for taxable products
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Getters
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    // Setter with validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive!");
        }
    }

    // Method to calculate final price
    public void displayFinalPrice() {
        double discount = calculateDiscount();
        double finalPrice = price - discount;
        double tax = 0;
        
        if (this instanceof Taxable) {
            tax = ((Taxable) this).calculateTax();
            System.out.println(((Taxable) this).getTaxDetails());
        }
        
        finalPrice += tax;
        System.out.println("Product: " + name + " | Final Price: $" + finalPrice);
    }
}

// Electronics class
class Electronics extends Product implements Taxable {
    private double warrantyPeriod; // in years

    public Electronics(int productId, String name, double price, double warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax (18% GST) applied.";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax (12% GST) applied.";
    }
}

// Groceries class
class Groceries extends Product implements Taxable {
    private String expiryDate;

    public Groceries(int productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% VAT
    }

    @Override
    public String getTaxDetails() {
        return "Groceries Tax (5% VAT) applied.";
    }
}

// Main class
public class E_CommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        
        products.add(new Electronics(101, "Smartphone", 1000, 2));
        products.add(new Clothing(102, "T-Shirt", 50, "L"));
        products.add(new Groceries(103, "Milk", 2, "10-02-2025"));
        
        // Displaying final prices using polymorphism
        for (Product product : products) {
            product.displayFinalPrice();
            System.out.println("--------------------------");
        }
    }
}
