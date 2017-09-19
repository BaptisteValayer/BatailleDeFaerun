package game;

public class Orque extends Warrior {

	public int reduceDamage(int damage) {
		return Math.round(damage*4);
	}
	
	public int getStrength() {
		return super.getStrength()*4;
	}
}
