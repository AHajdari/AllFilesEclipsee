import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<>();
		cars.add("BMW");
		cars.add("Mercedes-Benz");
		cars.add("Audi");
		cars.add("Porsche");
		
		System.out.println(cars.get(0));
		cars.set(2, "Range Rover");
		cars.remove(2);
		System.out.println(cars.size());
		for (String i : cars) {
			System.out.println(i);
		    }

		
		

	}

}
