
public class Car {
	private String brand;
	private String color;
	private int horsepower;
	private int miles;
	private String transmission;
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getHorsepower() {
		return horsepower;
	}


	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}


	public int getMiles() {
		return miles;
	}


	public void setMiles(int miles) {
		this.miles = miles;
	}


	public String getTransmission() {
		return transmission;
	}


	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	
	

	public Car(String brand, String color, int horsepower, int miles, String transmission) {
	super();
	this.brand = brand;
	this.color = color;
	this.horsepower = horsepower;
	this.miles = miles;
	this.transmission = transmission;
	}
	public Car() {
		this.brand = "null";
		this.color = "null";
		this.horsepower = 0;
		this.miles = 0;
		this.transmission = "null";
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", horsepower=" + horsepower + ", miles=" + miles
				+ ", transmission=" + transmission + "]";
	}
	
	
	
	
	
	

}
