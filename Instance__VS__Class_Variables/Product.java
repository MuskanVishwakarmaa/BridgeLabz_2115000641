public class Product{
	//instance variables
	private String productName;
	private int price;

	//class variable
	private static int totalProducts = 0;

	//constructor
	public Product(String productName, int price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}

	//instance method to display product details
	public void displayProductDetails(){
		System.out.println("Product Details:-");
		System.out.println("Product name: " + this.productName);
		System.out.println("Product price: " + this.price);
	}

	//class method to display total product
	public static void displayTotalProducts(){
		System.out.println("\nTotal Products:-");
		System.out.println("Total product " + totalProducts);
	}

	//main method
	public static void main(String args[]){
		Product product1 = new Product("Laptop" , 55000);
		Product product2 = new Product("Mobile" , 27000);

		product1.displayProductDetails();
		product2.displayProductDetails();

		Product.displayTotalProducts();
	}
}
