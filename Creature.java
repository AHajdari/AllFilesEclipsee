
public class Creature {
	private int strength;
	private int health;
	
	public Creature() {
		super();
		this.strength = 0;
		this.health = 0;
	}
	

	public Creature(int strength, int health) {
		super();
		this.strength = strength;
		this.health = health;
	}


	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health > 0 && health < 100) {
			this.health = health;
		}
		
	}
	
	public int vigor() {
		return (strength * health) / 100;
	}

	@Override
	public String toString() {
		return "Creature [strength=" + strength + ", health=" + health + ", vigor()=" + vigor() + "]";
	}

	
	

	
	
	
	
	
	

}
