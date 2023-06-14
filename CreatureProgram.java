
public class CreatureProgram {
	public static void main (String [] args) {
		Creature c1 = new Creature();
		Creature c2 = new Creature();
		Creature c3 = new Creature(66, 99);
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.setHealth(57);
		c1.setStrength(99);
		
		c2.setHealth(87);
		c2.setStrength(49);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//System.out.println("Health for creature 1 went from 0 to "+ c1.getHealth() + " and the strength from 0 to " + c1.getStrength());
		//System.out.println("Health for creature 2 went from 0 to "+ c2.getHealth() + " and the strength from 0 to " + c2.getStrength());
		//System.out.println("Health for creature 3 went from 0 to "+ c3.getHealth() + " and the strength from 0 to " + c3.getStrength());
	}
 
}
