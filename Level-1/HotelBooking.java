import java.util.Scanner;
class HotelBooking{
	//Attributes
	private String guestName;
	private String roomType;
	private int nights;

	//default constructor
	HotelBooking(){
		this.guestName = "Unknown";
		this.roomType = "NA";
		this.nights = 0;
	}

	//parameterized constructor
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}

	//copy constructor
	HotelBooking(HotelBooking hotel){
		this.guestName = hotel.guestName;
                this.roomType = hotel.roomType;
                this.nights = hotel.nights;
	}

	//Getter method
	public String getGuestName(){
		return guestName;
	}

	public String getRoomType(){
		return roomType;
	}

	public int getNights(){
		return nights;
	}

	//method to display result
	public void display(){
		System.out.println("\nGuest Name:- " + guestName);
		System.out.println("Room Type:- " + roomType);
		System.out.println("Nights:- " + nights);
	}

	//main method
	public static void main(String args[]){
		HotelBooking defHotel = new HotelBooking();
		defHotel.display();

		Scanner sc = new Scanner(System.in);
		System.out.println("\nThe data above is default. Please enter your preferred details");
		System.out.print("Enter Guest Name: ");
		String guestName = sc.nextLine();

		System.out.print("Enter Room Type: ");
		String roomType = sc.nextLine();

		System.out.print("Enter night: ");
		int nights = sc.nextInt();

		HotelBooking userHotel = new HotelBooking(guestName, roomType, nights);
		userHotel.display();

		HotelBooking copyHotel = new HotelBooking(userHotel);
		System.out.print("\nCloned Booking Details (Copy Constructor Output):");
    		copyHotel.display();

		sc.close();
	}
}
