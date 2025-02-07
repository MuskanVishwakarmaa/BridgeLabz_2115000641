//Device class as the parent class
class Device{
	private String deviceID;
	private String status;
	
	//constructor
	public Device(String deviceID, String status){
		this.deviceID = deviceID;
		this.status = status;
	}
	
	//getter method
	public String getDeviceID(){
		return deviceID;
	}
	public String getStatus(){
		return status;
	}
}

//Thermostat class as a child class
class Thermostat extends Device{
	private String temperatureSetting;
	
	//constructor
	public Thermostat(String deviceID, String status, String temperatureSetting){
		super(deviceID, status);
		this.temperatureSetting = temperatureSetting;
	}
	
	//getter method
	public String getTemperatureSetting(){
		return temperatureSetting;
	}
	
	//method to display
	public void displayStatus(){
		System.out.println("Device ID: " + getDeviceID());
		System.out.println("Status: " + getStatus());
		System.out.println("Temperature: " + getTemperatureSetting());
	}
}

//main method
public class SmartHomeDevices{
	public static void main(String args[]){
		Thermostat t1 = new Thermostat("D12", "On", "22 C");
		t1.displayStatus();
	}
}