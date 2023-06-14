
public class Vehicle {
	int maxSpeed;
	int wheels;
	String color;
	double fuelCapacity;
	
	public Vehicle() {
		this.setColor("Red");
	}
	
	public Vehicle(String color) {
		this.setColor(color);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void horn() {
		System.out.println("Beep!");
	}

}
