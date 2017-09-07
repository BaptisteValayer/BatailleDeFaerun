package game;

public class TestGuerrier {

	public static void main(String[] args) {
		Elf warrior1 = new Elf();
		Dwarf warrior2 = new Dwarf();
		DwarfChief warrior3 = new DwarfChief();
		ElfChief warrior4 = new ElfChief();

		int x=0; 
		while(!warrior4.isDead() && !warrior2.isDead()) {
			System.out.println("Figth : "+x);
			if(x%2==0) {
				warrior4.fight(warrior2);
				x++;
			}
			else {
				warrior2.fight(warrior4);
				x++;
			}
			System.out.println("war1"+warrior4.toString());
			System.out.println("war2"+warrior2.toString());
		}
	}

}
