
public class VirtualCafeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VirtualPerson person = new VirtualPerson();
		CoffeeCup coffee = new CoffeeCup(89, 20);
		
		VirtualCafe.serveCustomer(person, coffee);

	}

}
