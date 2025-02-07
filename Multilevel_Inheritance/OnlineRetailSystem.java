//Base Class
class Order{
    int orderId;
    String orderDate;

    //Constructor
    public Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    //Method to get order status
    public String getOrderStatus(){
        return "Order placed on " + orderDate;
    }

    //Display Order Details
    public void displayOrderDetails(){
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
		System.out.println();
    }
}

// Subclass
class ShippedOrder extends Order{
    String trackingNumber;

    //Constructor
    public ShippedOrder(int orderId, String orderDate, String trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getOrderStatus(){
        return "Order shipped. Tracking Number: " + trackingNumber;
    }

    // Display Order Details
    public void displayOrderDetails(){
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;

    //Constructor
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus(){
        return "Order delivered on " + deliveryDate;
    }

    // Display Order Details
    public void displayOrderDetails(){
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println();
    }
}

//Main Class
public class OnlineRetailSystem{
    public static void main(String[] args){
        //Creating Order Objects at Different Stages
        Order order1 = new Order(101, "2025-02-03");
        ShippedOrder order2 = new ShippedOrder(102, "2025-02-04", "TRACK12345");
        DeliveredOrder order3 = new DeliveredOrder(103, "2025-02-03", "TRACK67890", "2025-02-06");

        //Displaying Order Status
        order1.displayOrderDetails();
        order2.displayOrderDetails();
        order3.displayOrderDetails();
    }
}