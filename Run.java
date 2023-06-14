
public class Run {
	public static void main(String[] args) {
		Bag bag1 = new Bag();
		Bag bag2 = new Bag();
		Bag bag3 = new Bag();
		
		bag1.size = "Small";
		bag1.brand = "Superdry";
		bag1.color = "Red/Black";
		bag1.numOfZips = 2;
		bag1.price = 50;
		
		bag2.size = "Small";
		bag2.brand = "Nike";
		bag2.color = "White";
		bag2.numOfZips = 4;
		bag2.price = 30;
		
		System.out.println(bag1.size);
		System.out.println(bag1.brand);
		System.out.println(bag1.color);
		System.out.println(bag1.numOfZips);
		System.out.println(bag1.price);
		
		System.out.println("\n" + bag2.size);
		System.out.println(bag2.brand);
		System.out.println(bag2.color);
		System.out.println(bag2.numOfZips);
		System.out.println(bag2.price);
		
		
		
	}

}
