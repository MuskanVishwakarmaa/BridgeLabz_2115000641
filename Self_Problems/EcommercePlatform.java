import java.util.ArrayList;
import java.util.List;

// Product class (Individual products that can be added to orders)
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Order class (Aggregates multiple products)
class Order {
    private static int orderCounter = 1;
    private int orderId;
    private List<Product> products;
    private Customer customer;

    public Order(Customer customer) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId + " | Customer: " + customer.getName());
        System.out.println("Products in Order:");
        for (Product product : products) {
            System.out.println(" - " + product.getName() + " (" + product.getPrice() + ")");
        }
    }
}

// Customer class (Can place multiple orders)
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Order placeOrder() {
        Order order = new Order(this);
        orders.add(order);
        return order;
    }

    public void showOrderHistory() {
        System.out.println("Order History for " + name + ":");
        for (Order order : orders) {
            order.showOrderDetails();
            System.out.println();
        }
    }
}

// Main class to demonstrate the relationships
public class EcommercePlatform {
    public static void main(String[] args) {
        // Creating products
        Product laptop = new Product("Laptop", 1000.0);
        Product phone = new Product("Smartphone", 600.0);
        Product headphones = new Product("Headphones", 150.0);

        // Creating customers
        Customer customer1 = new Customer("Aditya");
        Customer customer2 = new Customer("Yash");

        // Customers place orders
        Order aliceOrder = customer1.placeOrder();
        aliceOrder.addProduct(laptop);
        aliceOrder.addProduct(headphones);

        Order bobOrder = customer2.placeOrder();
        bobOrder.addProduct(phone);

        // Showing order history for each customer
        customer1.showOrderHistory();
        customer2.showOrderHistory();
    }
}
