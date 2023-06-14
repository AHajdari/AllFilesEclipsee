
public class CoffeeCup {
	
	private int temperature;
	private int contentVolInMl;
	
	public CoffeeCup(int temperature, int contentVolInMl) {
		super();
		this.temperature = temperature;
		this.contentVolInMl = contentVolInMl;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		if(temperature > 0) {
		this.temperature = temperature;
		}
		this.temperature = 1;
	}

	public int getContentVolInMl() {
		return contentVolInMl;
	}

	public void setContentVolInMl(int contentVolInMl) {
		this.contentVolInMl = contentVolInMl;
	}
	
	

}
