package game;

public class TestGuerrier {

	public static void main(String[] args) {
		Orque orque = new Orque();
		Orque orque2 = new Orque();
		Goblin goblin = new Goblin();
		Dwarf dwarf = new Dwarf();
		DwarfChief dwarfchief = new DwarfChief();
		Elf elf = new Elf();
		ElfChief elfchief = new ElfChief();

		int x=0; 
		while(!orque.isDead() && !orque2.isDead()) {
			System.out.println("Figth : "+x);
			if(x%2==0) {
				orque.fight(orque2);
				x++;
			}
			else {
				orque2.fight(orque);
				x++;
			}
			System.out.println(orque2.toString());
			System.out.println(orque.toString());
		}
	}

}
