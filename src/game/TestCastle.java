package game;

import java.util.ArrayList;
import java.util.List;

public class TestCastle {

	public static void main(String[] args) {
		List<Warrior> listTestAttente = new ArrayList<>();
		Castle FondCombe = new Castle("Fondcombe");
		
		Elf elf1 = new Elf();
		Dwarf dwarf1 = new Dwarf();
		DwarfChief dwarfC1 = new DwarfChief();
		
		FondCombe.warriorOrder(elf1);
		FondCombe.warriorOrder(dwarf1);
		FondCombe.warriorOrder(dwarfC1);
		FondCombe.warriorOrder(dwarfC1);
				
		listTestAttente = FondCombe.getWarriorOnStandby();
		
		System.out.println("Initialisation");
		System.out.println(FondCombe.getAvailableResource());
		System.out.println("att->"+listTestAttente);
		
		for(int i=0; i<15; i++) {
			System.out.println("Tour "+(i+1));
			FondCombe.trainWarrior();
			System.out.println(FondCombe.getAvailableResource());
			FondCombe.increaseRessource(1);
			System.out.println("att->"+listTestAttente);
		}
	}

}
