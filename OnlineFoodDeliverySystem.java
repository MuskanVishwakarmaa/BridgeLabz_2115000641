import java.util.ArrayList;
import java.util.List;

// Interface for discountable items
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Getters
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Setter with validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive!");
        }
    }

    // Method to display item details
    public void getItemDetails() {
        System.out.println("Item: " + itemName + " | Price: $" + price + " | Quantity: " + quantity);
    }
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount (5%) applied.";
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 2.0; // Extra charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + nonVegCharge) * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount (10%) applied.";
    }
}

// Main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        
        order.add(new VegItem("Paneer Butter Masala", 12.99, 2));
        order.add(new NonVegItem("Chicken Biryani", 15.99, 1));
        
        // Processing order using polymorphism
        for (FoodItem item : order) {
            item.getItemDetails();
            double totalPrice = item.calculateTotalPrice();
            double discount = 0;
            
            if (item instanceof Discountable) {
                discount = ((Discountable) item).applyDiscount();
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            
            double finalPrice = totalPrice - discount;
            System.out.println("Final Price: $" + finalPrice);
            System.out.println("--------------------------------------------------------------");
        }
    }
}
