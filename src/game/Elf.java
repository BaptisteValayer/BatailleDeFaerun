package game;

public class Elf extends Warrior {

	public Elf() {
		super();
	}

	@Override
	public int getStrength() {
		return super.getStrength()*2;
	}
	
	public int getCost() {
		return super.getCost()*2;
	}
}
