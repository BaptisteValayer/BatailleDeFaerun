package game;
import utils.Dice;

/**
 * an abstract class which represent a warrior unspecified
 * @author baptiste
 *
 */
abstract class Warrior {
	
	/**
	 * life point to a warrior
	 */
	protected int lifePoint = 100;
	
	/**
	 * strength to a warrior
	 */
	protected final static int STRENGTH = 10;
	
	private final int cost = 1;
	
	public Warrior() {};
	
	/**
	 * a warrior fight versus an other warrior
	 * @param a warrior
	 * @param a warrior
	 */
	public void fight(Warrior warriorEnnemy) {
		int damageRecieved = this.attackStrength(this.getStrength());
		warriorEnnemy.looseLifePoint(warriorEnnemy.reduceDamage(damageRecieved));
	};
	
	/**
	 * use utils.Dice to generate an attack with random strength
	 * @param strength
	 * @return result
	 */
	public int attackStrength(int strength) {
		return Dice.De3(strength);
	}
	
	/**
	 * reduce life point of this
	 * @param damage
	 */
	public void looseLifePoint(int damage) {
		this.lifePoint=this.lifePoint-damage;
	};
	
	/**
	 * return damage received during fight reduce according to warrior's type
	 * @param damage
	 */
	public int reduceDamage(int damage) {
		return damage;
	};
	
	/**
	 * method which test if warrior(in param) is dead
	 * @param Warrior
	 * @return true if warrior is dead else return false
	 */
	public boolean isDead() {
		return this.lifePoint<=0;
	};
	
	
	//-------------------------getter and setter
	/**
	 * @return warrior's lifePoint
	 */
	public int getLifePoint() {
		return this.lifePoint;
	};
	
	/**
	 * @return warrior's strength
	 */
	public int getStrength() {
		return Warrior.STRENGTH;
	};

	/**
	 * update life point
	 * @param lifePoint
	 */
	public void setLifePoint(int lifePoint) {
		this.lifePoint = lifePoint;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" -> lifePoint=" + lifePoint + "]";
	}

	public int getCost() {
		return this.cost;
	}
}
