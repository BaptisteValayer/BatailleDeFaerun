package game;

public class DwarfChief extends Dwarf{
	
	public DwarfChief() {
		super();
	}
	
	public int reduceDamage(int damage) {
		return Math.round(damage/4);
	}
	
	public int getCost() {
		return super.getCost()*3;	
	}
}
