package game;

import java.util.ArrayList;
import java.util.Random;

public class Goblin extends Warrior {
	
	/**
	 * method use when Goblin died, he explode and hit all enemies
	 * damage inflicted are between 10 and 30
	 * @param ennemies
	 */
	public void martyrdom(ArrayList<Warrior> enemies) {
		for (Warrior warrior : enemies) {
			Random randomDamage = new Random();
			warrior.looseLifePoint(randomDamage.nextInt(20)+10);
		}
	}
}
