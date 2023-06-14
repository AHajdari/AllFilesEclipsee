
public class VirtualCafe {
	
	public static void serveCustomer (VirtualPerson customer, CoffeeCup coffee)  {
		try {
			customer.drinkCoffee(coffee);
			System.out.println("Coffee served!");
		}catch (TooHotException e) {
			System.out.println(e.getMessage());
		}
		catch (TooColdException e) {System.out.println(e.getMessage());}
	}

}
