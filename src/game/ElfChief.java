package game;

public class ElfChief extends Elf{

	public ElfChief() {
		super();
	};
	
	public int getStrength() {
		return super.getStrength()*2;
	}
	
	public int getCost() {
		return super.getCost()*4;	
	}
}
