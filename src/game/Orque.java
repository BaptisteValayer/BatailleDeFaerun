package game;

public class Orque extends Warrior {

	public void fight(Warrior warriorEnnemy) {
		int damageRecieved = this.attackStrength(this.getStrength());
		int realDamage = warriorEnnemy.reduceDamage(damageRecieved);
		warriorEnnemy.looseLifePoint(realDamage);
		lifesteal(realDamage);
	}

	private void lifesteal(int lifesteal) {
		int lifeWithLifesteal = (this.getLifePoint()+lifesteal);
		if(lifeWithLifesteal>=100) {
			this.setLifePoint(100);
		}
		else {
			this.setLifePoint(lifeWithLifesteal);
		}
		
	};
	
	public Orque() {
		super();
	}
}
