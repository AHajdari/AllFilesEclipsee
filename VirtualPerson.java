
public class VirtualPerson {
	
	public void drinkCoffee(CoffeeCup coffeeCup) throws TooHotException, TooColdException{
		if(coffeeCup.getTemperature() < 65 ) {
			throw new TooColdException("Coffee is too cold");
		}
		else if(coffeeCup.getTemperature() > 85) {
			throw new TooHotException("Coffee is too hot");
		}
		System.out.println("Person drinks the coffee");
	}

}
 