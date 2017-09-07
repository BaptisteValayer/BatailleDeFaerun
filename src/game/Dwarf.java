package game;

public class Dwarf extends Warrior {
	
	public Dwarf() {
		super();
	}

	public int reduceDamage(int damage) {
		return Math.round(damage/2);
	}
}
